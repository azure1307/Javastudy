package chap3;
/*
 * 이항 연산자
 * 1. 산술 연산자: +, -, *, /, %(나머지)
 */
public class OpEx3 {
	public static void main(String[] args) {
		int x = 10, y = 8;
		double d = x/y;
		System.out.println(d);
		
		System.out.println("10.0/8 = " + (10.0/8)); //1.25
		System.out.println("10/8 = " + (10/8)); //1
		System.out.println("-10/8 = " + (-10/8)); //-1
		System.out.println("10/-8 = " + (10/-8)); //-1
		System.out.println("-10/-8 = " + (-10/-8)); //1
		System.out.println();
		
		// %연산은 나눠지는 수의 부호를 따름
		System.out.println("10%8 = " + (10%8)); //2
		System.out.println("-10%8 = " + (-10%8)); //-2
		System.out.println("10%-8 = " + (10%-8)); //2
		System.out.println("-10%-8 = " + (-10%-8)); //-2

	}

}
