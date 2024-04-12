package test0411;
/*
 * ThreadEx7.java  소스의 PrintThread1 클래스를 Runnable 인터페이스를 구현하는 방식으로 수정하기
 * PrintRunnable1 : Runnable 인터페이스 구현 클래스
 * 구동클래스도 구현하기.
 */
class PrintRunnable1 implements Runnable {
	char ch;
	static Object lock = new Object();
	PrintRunnable1(char ch) {
		this.ch = ch;
	}
	public void run() {
		for (int i=0;i<20;i++) {
			synchronized(lock) {
				for (int j=0;j<80;j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
}
public class Test1 {
	public static void main(String[] args) {
		PrintRunnable1 pr1 = new PrintRunnable1('A');
		PrintRunnable1 pr2 = new PrintRunnable1('B');
		PrintRunnable1 pr3 = new PrintRunnable1('C');
//		Thread t1 = new Thread(new PrintRunnable1('A')); 이렇게하면 pr1 참조변수 안만들어도됨
		Thread t1 = new Thread(pr1);
		Thread t2 = new Thread(pr2);
		Thread t3 = new Thread(pr3);
		t1.start(); t2.start(); t3.start();
	}
}
