package chap12;
class ATM implements Runnable {
	private int money = 100000;
	public void run() {
		try {
			Thread.sleep((int)(Math.random()*1000)); 
		} catch (InterruptedException e) {}
		synchronized (this) { // 내 객체를 동기화
			while (true) {
				if (money <= 0) break;
				withdraw();
			}
		} // 이 시점에서 두번째 스레드가 접근할 수 있어도 이미 0원 
	}
	private void withdraw() { // 만원씩 출금. 돈이 없으면 종료
		if (money <= 0) return;	
		money -= 10000;
		System.out.println(Thread.currentThread().getName()+" 출금. 잔액:"+money);
	}
}
public class ThreadEx12 {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread alpha = new Thread(atm,"ALPHA");
		Thread beta = new Thread(atm,"BETA");
		alpha.start(); beta.start();
	}
}
