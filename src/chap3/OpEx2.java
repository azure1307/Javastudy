package chap3;
/*
 * 단항 연산자(우선순위 높음)
 * 1. 논리부정연산자: !
 * 2. 부호연산자: +(부호 유지), -(부호 바꿈)
 * 3. 증감연산자
 * 4. 형변환연산자: (int)3.0
 * 
 */
public class OpEx2 {
	public static void main(String[] args) {
		System.out.println("true = " + !false);
		System.out.println("false = " + !true);
		System.out.println("!(3>5): " + !(3>5)); //true
		System.out.println();
		
		int x = -10;
		System.out.println("+x = " + +x);
		System.out.println("-x = " + -x);

		x = 10;
		System.out.println("+x = " + +x);
		System.out.println("-x = " + -x);
	}
}
