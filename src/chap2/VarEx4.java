package chap2;
/*
 * 문자 데이터
 */

public class VarEx4 {
	public static void main(String[] args) {
		char ch1 = 'A';
		int num = ch1;
		System.out.println("ch1 = " + ch1 + ", num = " + num);
		num = ch1 + 1;
		System.out.println("num = " + num + " = " + (char)num);
		
		// byte, short, char 3개의 자료형이 혼합된 연산 결과는 int
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);
		num = b1 + b2;
	}
}
