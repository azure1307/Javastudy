package chap12;
// 동기화 영역: 동기화 메서드 방식
/*
 * 동기화 영역
 * 	1. 동기화 블럭
 * 		스레드 실행 중 synchronized(lock) { ... }
 * 	2. 동기화 메서드
 * 		synchronized void 메서드명 () { ... }
 * lock 해제 시점
 * 	1. 동기화블럭 : 동기화 블럭 종료
 * 	2. 동기화메서드: 동기화 메서드 종료
 * 	3. 동기화영역 종료시 lock 풀 대기(lock에 걸려 대기)중의 다른 스레드는 자동으로 Runnable 상태로 바뀜
 * 
 * StringBuffer	: 동기화메서드. Thread에 대해서 safe한 메서드	 
 * StringBuilder: 일반메서드. Thread에 대해서 unsafe한 메서드
 */
// TODO 동기화 메서드 예제
class PrintThread2 extends Thread {
	Printer ptr;
	char ch;
	PrintThread2(Printer ptr, char ch) {
		this.ptr = ptr;
		this.ch = ch;
	}
	@Override
	public void run() {
		for (int i=0;i<20;i++) {
//			ptr.printChar(this.ch); this라는 참조변수가 참조하고있어서 g.c가 삭제안함
			ptr.printChar(ch);
		}
	}
}
class Printer {
	public synchronized void printChar(char ch) { // 동기화 메서드. 들어온 스레드 lock 시작
		for (int i=0;i<80;i++) {
			System.out.print(ch);
		}
		System.out.println();
	} // 동기화 메서드 종료. 스레드의 lock 해제
}
public class ThreadEx8 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintThread2 t1 = new PrintThread2(ptr,'A');
		PrintThread2 t2 = new PrintThread2(ptr,'B');
		PrintThread2 t3 = new PrintThread2(ptr,'C');
		t1.start(); t2.start(); t3.start();
	}
}
