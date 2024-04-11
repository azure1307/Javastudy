package chap12;
// 동기화 예제: 동기화 블럭
// TODO 동기화블럭 예제
class PrintThread1 extends Thread {
	char ch;
	static Object lock = new Object(); // 객체만 가능함. 기본자료형 안됨
//	static int lock = 0; // 기본형은 lock 사용 불가
	// Wrapper 클래스: 기본자료형을 객체화하기 위해 사용
//	static Integer lock = 0; // 객체이므로 가능함	
	PrintThread1(char ch) {
		this.ch = ch;
	}
	@Override
	public void run() { // t1 -> t2 -> t1
		for (int i=0;i<20;i++) { // i=0 -> i=0 -> i=40..
			// 동기화영역: 동기화블럭
			// lock: 모든 스레드 객체가 공유하는 공유객체가 되어야함(static 필수)
			// t1이 사용중(lock)일때는 t2는 못들어오고 대기상태(Runnable). lock이 풀리면 그때 t2가 사용가능
			synchronized(lock) { // lock : t1 -> t2, 못들어가고 대기상태 -> A1 여전히 lock
				for (int j=0;j<80;j++) {
					System.out.print(ch); // A를 한 30개 찍음 -> B 못찍음 -> A 마저찍음
				}
				System.out.println();
			} // 동기화영역 종료. 여기까지 와야 lock 해제
		}
	}
}
public class ThreadEx7 {
	public static void main(String[] args) {
		PrintThread1 t1 = new PrintThread1('A');
		PrintThread1 t2 = new PrintThread1('B');
		PrintThread1 t3 = new PrintThread1('C');
		t1.start(); t2.start(); t3.start();

	}

}
