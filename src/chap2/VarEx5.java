package chap2;
/*
 *  서로 다른 자료형끼리 연산
 *  : 큰 자료형 + 작은 자료형 = 큰 자료형
 *  예외) int보다 작은 자료형의 연산 결과는 int
 *  
 *  String 클래스
 *  1. 참조 자료형. 문자열을 담을 수 있음
 *  2. 대입 연산자로도 객체를 생성할 수 있음(클래스 중 유일. 다른 클래스는 new 키워드로만 가능)
 *  3. 더하기 연산 할 수 있음(클래스 중 유일) 
 */
public class VarEx5 {
	public static void main(String[] args) {
		int i1 = 100;
		long l1 = 200;
		long l2 = i1 + l1;
		int i2 = (int) (i1 + l1);
		System.out.println(l2);
		
		byte b = 10;
		short s = 20;
		short s2 = (short)(b + s);
		
		String str = "번호";
		System.out.println(1+2+str);
		System.out.println(str+1+2);
		System.out.println(1+2+"");
		System.out.println(""+1+2);
		
		str = "1" + false;
		System.out.println(str);
		System.out.printf("%s",str);
	}
}
