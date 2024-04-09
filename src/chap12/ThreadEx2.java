package chap12;
/*
 * Thread 생성 - 2
 * 1. Runnable 인터페이스 구현
 * 2. run 메서드 오버라이딩
 * 3. new Thread(Runnable)
 */
// Runnable 인터페이스를 구현한 구현 클래스. Thread 클래스가 아니다
class Runnable1 implements Runnable {
	@Override
	public void run() {
		for (int i=1;i<=5;i++) {
			// Thread.currentThread() : 현재 실행중인 스레드 객체 리턴
			System.out.println(i+":"+Thread.currentThread().getName());
//			System.out.println(i+":"+getName()); // getName()는 Thread의 메서드라서 에러
			try {
				Thread.sleep(1000); // 1초동안 대기상태
//				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// i=2일때로 바로 가지않음, 스케줄러의 권한이 있어야 함
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("main 메서드 실행 시작");
		// t1 스레드가 실행해야 하는 Run 메서드는 Runnable1() 객체의 run 메서드임
		Runnable r = new Runnable1();
		Thread t1 = new Thread(r,"First");
		Thread t2 = new Thread(r,"Second");
		t1.start();
		t2.start();
		System.out.println("main 메서드 실행 종료");
	}
}
