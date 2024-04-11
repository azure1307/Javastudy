package test0409;
/*
 * ThreadEx4.java 소스의 SumThread클래스를 Runnable 인터페이스로 구현하는 방식으로 변경하여
 * 1~1000까지 계산하는 프로그램 구현하기.
 */
//SumRunnable은 Runnable 구현 클래스니까 헷갈리지않게 이름을 SumRunnable로 짓자..
//그리고 start()와 join() 반복문 분리할 것
class SumRunnable implements Runnable { // Thread 클래스 아님
	int start,end,sum;
	SumRunnable(int start, int end) {
		this.start = start;
		this.end = end;
	}	
	@Override
	public void run() { // Thread가 실행하는 메서드 => Running 상태
		int sum = 0;
		for (int i=start;i<=end;i++) {
			sum += i;
		}
		this.sum = sum;
	}	
}
public class Test2 {
	public static void main(String[] args) throws InterruptedException {
//		Runnable r = new SumThread(1,200);
//		Runnable r2 = new SumThread(201,400);
//		Thread t = new Thread(r);
//		Thread t2 = new Thread(r2);
		
		Thread[] tArr= new Thread[5]; // Thread 객체를 참조할 참조변수의 배열
		SumRunnable[] rArr = new SumRunnable[5]; // SumRunnable 객체를 참조할 참조변수의 배열
		for (int i=0;i<5;i++) {
			rArr[i] = new SumRunnable(i*200+1,i*200+200); // SumRunnable 객체 생성
		}
		
		for (int i=0;i<5;i++) {
			tArr[i] = new Thread(rArr[i]); // Thread 객체 생성
			tArr[i].start();
		}
		
		// 모든 Thread가 종료상태가 될 때까지 main 메서드는 대기
		for (int i=0;i<5;i++) {
			tArr[i].join();
		}
		
		// 이 시점이면 모든 Thread는 종료된 상태
		int sum = 0;
		for (int i=0;i<5;i++) {
			sum += rArr[i].sum;
		}
		System.out.println("1부터 1000까지의 합:"+sum);
	}
}