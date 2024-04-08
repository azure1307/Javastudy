package chap11;

import java.util.Random;

/*
 * java.util.Random 클래스 : 난수발생 클래스
 *      => Math.random() 함수를 이용하지 않고 클래스에서 난수 발생
 *      1. 자료형별로 난수 발생 가능
 *         nextInt() : 정수형 난수 
 *         nextInt(n) : 0에서 n-1까지의 정수형 난수
 *         nextDouble() : 0 <= x < 1.0 Math.random()과 동일
 *         nextBoolean() : true/false
 *      2. seed 값 설정 가능
 *      (1) 난수의 복원이 가능해진다.
 *      (2) seed 값이 변경되면 매번 다른 난수를 발생시킬 수 있다. (ex. System.currentTimeMillis() 사용)
 *         
 */
public class RandomEx1 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		// System.currentTimeMillis() => 날짜계산. 1970년 이후부터 현재까지의 시간을 밀리초로 리턴
		rand1.setSeed(System.currentTimeMillis());
		for (int i=0;i<5;i++) {
			System.out.println(i + ":" + rand1.nextInt(10));
		}
	}

}
