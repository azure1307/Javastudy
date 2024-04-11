package chap12;
/*
 * 데몬 스레드
 *   1. 일반 스레드의 보조 역할. 무한 반복함
 *   	가비지 콜렉터(쓰레기 수집기) : 참조변수가 참조하고있지않은 객체를 삭제
 *   2. 일반 스레드가 모두 종료되면 데몬 스레드도 자동 종료
 *   3. setDaemon(true) 실행 => new 상태에서 실행해야 데몬 스레드가 됨
 *   
 */
class DaemonThread extends Thread {
	@Override
	public void run() {
		while (true) {
			// this: 실행중인 스레드 객체
			// this.toString(): Thread[Thread-0,5,main]
			/*
			 * Thread-0: 스레드의 이름. 별도로 이름을 설정해주지않아 기본 제공되는 이름을 붙임
			 * 5: 스레드의 우선순위. 1~10까지 값으로 설정. 1:낮음, 10:높음, 5:기본값
			 * 스케줄러는 우선순위가 높은 스레드를 먼저 실행하지만 이것도 확률싸움임
			 * main: 스레드 그룹.
			 */
			System.out.println(this); // Thread.toString() 메서드 호출
			try {
				sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx9 {
	public static void main(String[] args) throws InterruptedException {
		// Thread.currentThread(): 현재 실행중인 스레드 객체 
		System.out.println(Thread.currentThread()); // Thread에서.toString() 메서드 호출
		/* main: 스레드의 이름.
		 * 5: 스레드의 우선순위.
		 * main: 스레드 그룹.
		 */
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread(); // new 상태
//		t1.setDaemon(true); t2.setDaemon(true); // 반드시 new 상태에서 데몬 스레드로 설정
		t1.start(); t2.start(); // Runnable 상태
		t1.setDaemon(true); t2.setDaemon(true); // start 이후에 데몬스레드로 설정시 상태오류 발생
		Thread.sleep(2000);
		System.out.println("main 스레드 종료");
	} // 일반 스레드 종료. 동시에 데몬 스레드도 종료
}
