package chap8;
/*
 * 람다식(함수객체) 예제: jdk8 이후부터 사용가능
 *                  람다식에서 사용되는 인터페이스는 FunctionalInterface여야 한다
 * FunctionalInterface: 추상메서드가 한개만 존재하는 인터페이스
 * 
 * (1) 추상메서드의 매개변수가 없고, 리턴값도 없는 경우의 람다 표현방식
 * ()->{....}
 * 
 */
//어노테이션: 필수는 아니나 명시한 기능이 잘 작동하고있는지 확인할 때 사용
@FunctionalInterface //추상메서드가 한개인 인터페이스
interface LambdaInterface1 {
	void method();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		//람다 이전 방식
		//인터페이스는 객체화 불가. => 익명객체 방식을 사용하면 가능
		//익명의 객체 방식
		LambdaInterface1 f1 = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("익명 객체 방식으로 코딩함");
			}
		};
		f1.method();
		
		//람다 방식
		LambdaInterface1 f2 = () -> {System.out.println("람다 방식으로 코딩함");};
		f2.method();
		f2 = () -> System.out.println("람다 방식으로 코딩함(2)");
		f2.method();
		
		execute(()->System.out.println("execute 메서드로 실행"));
		//1~100까지의 합을 execute 메서드로 출력하기
		execute(()->{
			int sum = 0;
			for (int i=1;i<=100;i++) {
				sum += i;
			}
			System.out.println("1~100까지의 합:"+sum);
		});
	}
	static void execute(LambdaInterface1 f) {
		f.method();
	}
}
