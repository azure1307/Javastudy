package chap12;
/*
 * Thread 생성 방법
 * 1. Thread 클래스를 상속받기. run 메서드 오버라이딩하기
 * 2. Runnable 인터페이스를 구현하기. run 메서드 오버라이딩하기. Thread 클래스에 입력하기
 * 	  (단일상속때문에 생긴 방법)
 *    Runnable 인터페이스는 Functional Interface임 => 람다식 사용 가능
 */
public class ThreadEx3 {
	public static void main(String[] args) {
		// 함수 객체
		Runnable r = () -> { // 람다식을 이용해 Runnable 객체 생성
			for (int i=1;i<=5;i++) {
				System.out.println(i+":"+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(r,"First");
		Thread t2 = new Thread(r,"Second");
		t1.start(); t2.start();
	}

}
