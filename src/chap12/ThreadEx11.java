package chap12;
/*
 * 스레드에서 사용되는 주요 메서드
 * 1. start(): 스레드의 시작. 스택 영역을 병렬화. run() 호출
 * 			   스레드를 new 상태에서 Runnable 상태로 변경
 * 2. run()	 : 스레드가 실행하는 기능(메서드). 반드시 오버라이딩해야 함
 * 3. join() : 해당 스레드가 종료할 때까지 호출한 메서드가 대기
 * 4. sleep(밀리초): static 멤버. 밀리초 동안 대기  
 * 5. setDaemon(true): true로 설정시 데몬 스레드가 됨. 기본값은 false
 * 6. interrupt(): InterruptedException 예외 발생
 * 7. setPriority(int): 우선순위 설정. 1에서 10 사이의 값으로 설정
 * 						기본값:5. 1:낮음, 10: 높음
 * 						우선순위가 높으면 스케줄러가 선택할 확률이 높아질 뿐, 반드시 높은 스레드만 실행하는 건 아님
 * 8. yield(): Running 상태를 Runnable 상태로 변경. 
 * 9. stop() : 스레드 강제 종료. 사용하지 않도록 권장(deprecated)
 */
class InterruptThread extends Thread {
	public void run() {
		System.out.println("자고 있습니다. 깨우지 마세요");
		try {
			sleep(1000000);
		} catch (InterruptedException e) {
			System.out.println("누가 깨웠나요");
			e.printStackTrace();
		}
	}
}
public class ThreadEx11 {
	public static void main(String[] args) throws InterruptedException {
		InterruptThread t1 = new InterruptThread();
		t1.start();
		Thread.sleep(2000);
		t1.interrupt(); // t1 객체에 InterruptedException 발생
	}
}
