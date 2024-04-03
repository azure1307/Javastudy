package chap8;
/*
 * (2) 추상메서드가 매개변수를 가지면서 리턴타입이 없는경우
 *   (매개변수) -> {...}
 *   매개변수가 한개인 경우 () 생략가능
 *   실행구문의 문장이 한개인 경우 {} 생략 가능
 */
@FunctionalInterface
interface LambdaInterface2 {
	void method(int a);
}
public class LambdaEx2 {
	public static void main(String[] args) {
		//LambdaInterface2의 method는 매개변수로 받은 값에 5배해서 출력한다~ 고 구현
		LambdaInterface2 f = (i) -> {	//i변수의 자료형은 int
			System.out.println(i*5);
		};
		f.method(5); //25
		f.method(2); //10
//		f.method("a"); //매개변수는 int형이어야 함
		
		//LambdaInterface2의 method는 매개변수로 받은 값을 자기 자신과 더해서 출력한다~ 고 구현
		f = i -> System.out.println(i+i);
		f.method(10); //20
		System.out.println();
		
		//calc 함수는 인터페이스와 숫자를 입력받아서 그 숫자로 method 실행하는 함수
		calc(f,50); //calc 함수 구현: i+i 값을 출력
		System.out.println();
		
		//calc 함수를 이용해서 입력된 숫자까지의 합을 출력하는 프로그램 구현
		f = a -> {
			int sum = 0;
			for (int i=1;i<=a;i++) {
				sum += i;
			}
			System.out.println(sum);
		};
		calc(f,4); //10
		calc(f,10); //50
		calc(f,100); //5050
	}
	static void calc(LambdaInterface2 f,int a) {
		f.method(a);
	}

}
