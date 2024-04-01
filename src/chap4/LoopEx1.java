package chap4;
/*
 * 반복문: 조건문의 결과가 참인 동안 {} 내부의 문장들을 반복 수행
 * 		 반복문의 끝을 만나면 다시 반복문의 처음으로 이동
 * 		 조건문의 결과가 거짓이 되면 반복 종료
 */
public class LoopEx1 {
	public static void main(String[] args) {
		//1~5까지의 숫자를 출력하기
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		
		System.out.println("for구문을 이용하여 1~5까지 출력하기");
		//1. int i=1: 초기화. i변수는 for 구문 내부에서만 사용이 가능한 지역변수임
		//2. i<=5	: 조건문. 조건문이 참인 경우만 반복실행. 거짓인 경우 반복 종료
		//3. System.out.print(i);
		//4. i++	: 증감식.
		//5. 2번의 조건문 실행
		for (int i=10;i<=5;i++) {
			System.out.print(i);
		}
//		System.out.println(i); i는 for문 내부에서만 사용가능한 지역 변수.
		
		System.out.println("while문을 이용하여 1~5까지 출력하기");
		//1. int i=1: 초기화.
		//2. i<=5	: 조건문. 참일 경우 내부 문장 실행, 거짓일 경우 반복문 종료
		//3. System.out.print(i); i++;
		//4. 2번의 조건문 실행
		int i = 1;
		while (i<=5) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println("i=" + i);
		
		System.out.println("do-while문을 이용하여 1~5까지 출력하기");
		//1. System.out.print(i); i++;
		//2. while (i<5): 조건문. 참일 경우 내부 문장 실행, 거짓일 경우 반복문 종료
		i = 10;
		do {
			System.out.print(i);
			i++;
		} while (i<=5);
		System.out.println();
		System.out.println("i="+i);
		
		
	} 

}
