package chap2;
/*
 * 기본자료형의 형변환
 * 1. 기본자료형끼리 서로 형변환이 가능함(boolean 제외)
 * 2. 기본자료형과 참조자료형은 형변환 불가(Wrapper 제외)
 * 3. (1) 자동 형변환: 형변환 연산자 생략 가능. 큰 공간에 작은 값을 넣을 때
 * 	  (2) 명시적 형변환: 형변환 연산자 생략 불가능. 작은 공간에 큰 값을 넣을 때
 * 4. 자료형의 크기 순서
 * 	  byte(1) - short, char(2) - int(4) - long(8) - float(4) - double(8) 
 */
public class VarEx3 {
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		
		//자동 형변환(연산자 생략 가능)
		float f = (float)50;
		double d = (double)60;	
		System.out.println(f);
		System.out.println(d);
		
		//명시적 형변환(연산자 생략 불가)
		b = (byte)257;
		System.out.println(b);

		//예외. char는 부호 비트를 사용하지 않음. [byte, short] 와 [char] 가 오고 갈 때는 생략 불가
		char c = (char)b;
		short s2 = b;
		c = (char)s2;
		s2 = (short)c;
		
		//정수형의 기본값은 int, 실수형의 기본값은 double
		f = (float)1.0;
		d = 1.0;
		
		//접미사로 리터럴 표현
		//L: long, F: float, D: double
		f = 10.1F;
		d = 10.1D;
		l = 4000L;
		i = (int)0d;
		
	}

}
