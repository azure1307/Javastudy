package chap8;
/*
 * (3) 매개변수도 있고, 리턴값도 있는 경우
 * - 매개변수가 1개: () 생략 가능
 * - 실행 구문이 한 문장: {} 생략 가능, return 생략 가능
 */
@FunctionalInterface
interface LambdaInterface3 {
	int method(int x, int y);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		LambdaInterface3 f = (x,y) -> {
			return x+y;
		};
//		LambdaInterface3 f = (x,y) -> x+y;
		System.out.println("두수의 합:"+f.method(2, 5));
		
		f = (x,y) -> x*y;
		System.out.println("두수의 곱:"+f.method(2, 5));
		
		f = (x,y) -> x-y;
		System.out.println("두수의 차:"+f.method(2, 5));
		
		f = (x,y) -> x/y;
		System.out.println("두수의 나누기:"+f.method(5, 2));
		
		f = (x,y) -> x%y;
		System.out.println("두수의 나머지:"+f.method(5, 2));

		f = (x,y) -> {
			if (x>y) {
				return x;
			} else if (x<y) {
				return y;
			} else {
				return 0;
			}
		};
//		f = (x,y) -> (x>y)?x:y;
		System.out.println("두수 중 큰 수:"+f.method(5, 2));

		f = (x,y) -> (x<y)?x:y;
		System.out.println("두수 중 작은 수:"+f.method(5, 2));
	}
}
