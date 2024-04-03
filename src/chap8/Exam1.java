package chap8;
/*
 * LambdaInterface1을 이용하여 1~100까지의 짝수의 합과 홀수의 합을 출력하기
 */
public class Exam1 {
	public static void main(String[] args) {
		//람다 이전의 방식
		LambdaInterface1 f1 = new LambdaInterface1() {
			public void method() {
				int oddSum = 0;
				int evenSum = 0;
				for (int i=1;i<=100;i++) {
					if (i%2==1) {
						oddSum += i;
					} else if (i%2==0) {
						evenSum += i;
					}
				}
				System.out.println("1~100까지 짝수의 합:"+evenSum);
				System.out.println("1~100까지 홀수의 합:"+oddSum);
			}
		};
		f1.method();
		System.out.println();
		
		//람다 방식
		//람다식 = FunctionalInterface = 추상메서드1개
		//굳이 어떤 메서드인지 쓰지 않아도 1개밖에 없는 메서드를 구현하겠다~ 하는게됨
		f1 = () -> {
				int oddSum = 0;
				int evenSum = 0;
				for (int i=1;i<=100;i++) {
					if (i%2==1) {
						oddSum += i;
					} else if (i%2==0) {
						evenSum += i;
					}
				}
				System.out.println("1~100까지 짝수의 합:"+evenSum);
				System.out.println("1~100까지 홀수의 합:"+oddSum);
		};
		f1.method();
	}

}
