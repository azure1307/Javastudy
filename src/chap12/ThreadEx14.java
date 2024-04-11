package chap12;
/*
 * 생산자, 소비자 스레드
 * 
 * 엄마와 아들이 하나의 계좌를 공유함.
 * 계좌금액이 0이면 아들 wait()
 * 계좌금액이 0보다 크면 엄마 wait()
 * 엄마는 만원,2만원,3만원 중 랜덤한 돈을 계좌에 입금
 * 엄마 : 0~3초 동안 임의로 sleep // 생산자
 * 아들 : 0~1초 동안 임의로 sleep // 소비자
 */
class Account {
	int money;
	synchronized void output() { // 동기화 메서드. Son 스레드가 호출하는 메서드
		while (money == 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		// money > 0 경우만 실행
		notifyAll(); // wait() 상태의 스레드를 Runnable 상태로 변경
		System.out.println(Thread.currentThread().getName()+":"+money+"원 출금");
		money = 0;
	}
	synchronized void input() { // 동기화 메서드. Mother 스레드가 호출하는 메서드
		while (money > 0) { // 소비자 스레드가 데이터를 사용하기 전
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		// money == 0인 경우만 실행
		money = ((int)(Math.random()*3)+1)*10000;
		notifyAll();
		System.out.println(Thread.currentThread().getName()+":"+money+"원 입금");
	}
}
class Mother extends Thread { // 생산자 스레드
	Account account;
	Mother(Account account) {
		super("Mother");
		this.account = account;
	}
	public void run() {
		for (int i=0;i<20;i++) {
			account.input();
			try {
				sleep((int)(Math.random()*3000)); // 0~3초 사이로 sleep
			} catch (InterruptedException e) {}
		}
	}
}
class Son extends Thread { // 소비자 스레드
	Account account;
	Son(Account account) {
		super("Son");
		this.account = account;
	}
	public void run() {
		for (int i=0;i<20;i++) {
			account.output();
			try {
				sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx14 {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread m = new Mother(acc);
		Thread s = new Son(acc);
		m.start(); s.start();
	}
}

/*
 * Producer 클래스 : 자동차 공급자. Thread 클래스 상속       
 *     멤버메서드 : run()
 *         push() 메서드 호출하여 carName에 객체를 저장함.
 *         carName 객체가 존재하면 wait() 함.
 *         0 ~ 5000밀리초를 임의로 sleep()
 */
