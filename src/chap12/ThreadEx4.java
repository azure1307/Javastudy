package chap12;
/*
 * 1부터 1000까지의 합을 Thread를 사용해서 구하기
 * t1: 1 ~ 200까지의 합을 계산
 * t2: 201 ~ 400까지의 합을 계산
 * t3: 401 ~ 600까지의 합을 계산
 * t4: 601 ~ 800까지의 합을 계산
 * t5: 801 ~ 1000까지의 합을 계산
 * main에서 모든 합계를 더하여 출력하기
 */
class SumThread extends Thread {
	int start,end,sum;
	SumThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public void run() {
		for (int i=start;i<=end;i++) {
			sum += i;
		}
	}
}
public class ThreadEx4 {
	public static void main(String[] args) throws InterruptedException {
		SumThread t1 = new SumThread(1,200);
		SumThread t2 = new SumThread(201,400);
		SumThread t3 = new SumThread(401,600);
		SumThread t4 = new SumThread(601,800);
		SumThread t5 = new SumThread(801,1000);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		// t1.join(): t1 스레드가 종료할 때까지 현재 메서드(main)는 대기해야함
		// t2.join(): t2 스레드가 종료할 때까지 현재 메서드(main)는 대기해야함
		t1.join(); t2.join(); t3.join(); t4.join(); t5.join();
		System.out.println("1에서 1000까지의 합:"+(t1.sum+t2.sum+t3.sum+t4.sum+t5.sum));
	}
}
