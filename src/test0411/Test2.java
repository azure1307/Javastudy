package test0411;
/*
 * ThreadEx8.java  소스의 PrintThread2 클래스를 Runnable 인터페이스를 구현하는 방식으로 수정하기
 * PrintRunnable2 : Runnable 인터페이스 구현 클래스
 * 구동 클래스 구현하기
 */
class PrintRunnable2 implements Runnable {
	Printer ptr;
	char ch;
	PrintRunnable2(Printer ptr, char ch) {
		this.ptr = ptr;
		this.ch = ch;
	}
	@Override
	public void run() {
		for (int i=0;i<20;i++) {
			ptr.printChar(ch);
		}
	}
}
class Printer {
	// 동기화 메서드
	public synchronized void printChar(char ch) { // 스레드 lock 시작
		for (int i=0;i<80;i++) {
			System.out.print(ch);
		}
		System.out.println();
	} // 스레드의 lock 해제
}
public class Test2 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintRunnable2 pr21 = new PrintRunnable2(ptr,'A');
		PrintRunnable2 pr22 = new PrintRunnable2(ptr,'B');
		PrintRunnable2 pr23 = new PrintRunnable2(ptr,'C');
		Thread t1 = new Thread(pr21);
		Thread t2 = new Thread(pr22);
		Thread t3 = new Thread(pr23);
		t1.start(); t2.start(); t3.start();
	}
}
