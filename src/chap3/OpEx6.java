package chap3;
/*
 * 대입 연산자
 * 1. =, +=, -=, *=, /=, %=, …
 * 2. 왼쪽 변수를 lvalue, 오른쪽 변수/값/수식을 rvalue
 *    lvalue는 1개만. 오른쪽의 값을 왼쪽에 대입
 */
public class OpEx6 {
	public static void main(String[] args) {
		int num = 200;
		System.out.println(num);
		num = num + 10;		//num 변숫값에 10을 더한 후 다시 대입
		System.out.println(num);
		num += 10;			//Line12와 같음
		System.out.println(num);
		num -= 10;
		System.out.println(num);
		num *= 2;
		System.out.println(num);
		num /= 10;
		System.out.println(num);
		num %= 3;
		System.out.println(num);
		System.out.println();
		
		num += 10 + 5;
		System.out.println(num);
		num *= 2 * 3;
		System.out.println(num);
		System.out.println();
		
		byte b = 1;
		b = (byte) (b * 2);
		System.out.println(b);
		b *= 2;
		System.out.println(b);
		b += 2;
		System.out.println(b);
	}

}
