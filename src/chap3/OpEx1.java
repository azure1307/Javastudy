package chap3;
/*
 * 단항연산자: 피연산자가 1개인 경우
 * 1. 증감연산자: ++, --
 *    ++: 변수의 값 1 증가, --: 변수의 값 1 감소
 */
public class OpEx1 {
	public static void main(String[] args) {
		int x = 5, y = 5;
		x++; //x=6
		y--; //y=4
		System.out.println("x = " + x + ", y = " + y);
		
		++x; //x=7
		--y; //y=3
		System.out.println("x = " + x + ", y = " + y);
		
		x = y = 5; 
		y = ++x; // x의 값 1 증가 먼저 --> y에 x값 대입, x=6 y=6
		System.out.println("x = " + x + ", y = " + y);

		x = y = 5;
		y = x++; // y에 x값 대입 먼저 --> x의 값 1 증가, y=5 x=6
		System.out.println("x = " + x + ", y = " + y);
		
		y = ++x; // x=7 y=7
		System.out.println("x = " + x + ", y = " + y);
		System.out.println();
		
		
		x = y = 5;
		System.out.println("x = " + x++);
		System.out.println("x = " + x);
		System.out.println("x = " + ++x);
		System.out.println("y = " + y--);
		System.out.println("y = " + y);
		System.out.println("y = " + --y);
	}
}
