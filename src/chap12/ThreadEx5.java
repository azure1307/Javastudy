package chap12;
/*
 * ThreadEx4.java의 구동클래스를 배열로 변경하기
 */
public class ThreadEx5 {
	public static void main(String[] args) throws InterruptedException {
		SumThread[] sumArr = new SumThread[5];
		for (int i=0;i<sumArr.length;i++) {
			sumArr[i] = new SumThread(i*200+1,(i+1)*200);
			sumArr[i].start();
		}
		for (int i=0;i<sumArr.length;i++) {
			sumArr[i].join();
		}
		
		int sum = 0;
		for (int i=0;i<sumArr.length;i++) {
			sum += sumArr[i].sum;
		}
		System.out.println("1에서 1000까지의 합:"+sum);
	}
}
