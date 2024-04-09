package chap12;
/*
 * Thread 생성
 * 1. Thread 클래스를 상속받기
 * 2. run() 오버라이딩 : 
 */
class Thread1 extends Thread {
	Thread1(String name) {
		super(name); // Thread의 이름 설정
	}
	@Override
	public void run() { // Running 상태
		for (int i=1;i<=5;i++) {
			System.out.println(i+ ":" + getName());
			try {
				// 1000 밀리초(1초) 동안 대기
				sleep(1000);
			} catch (InterruptedException e) {}
		}
	} // run 메서드 Dead 상태(종료 상태)
}
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Thread t1 = new Thread1("First"); // new 상태(객체생성 상태)
		Thread t2 = new Thread1("Second"); // new 상태(객체생성 상태)
		t1.start(); // t1, Runnable 상태
		/*
		 * start 메서드 기능
		 * 1. 스택영역을 병렬화시킴
		 * 2. 병렬된 스택영역에 run()메서드 호출
		 */
		t2.start(); // t2, Runnable 상태
		System.out.println("main 스레드 종료"); // main, dead 상태
	}
}
