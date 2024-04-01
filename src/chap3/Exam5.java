package chap3;

/*
 * 주석처리한 결과가 나오도록 프로그램 수정
 */
public class Exam5 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		char ch = 'A';
		ch = (char)(ch + 2); //ch += 2;도 가능
		float f = (float)(3.0/2); //f = 3F/2도 가능
		long l = 3000 * 3000 * 3000L;
		float f2 = (float)0.1;
		double d = 0.1F;
		boolean result = (d==f2);
		System.out.println("c=" + c);	//c=30
		System.out.println("ch=" + ch);	//ch='C'
		System.out.println("f=" + f);	//f=1.5
		System.out.println("l=" + l);	//l=27000000000
		System.out.println("result=" + result);	//result=true
		
		System.out.printf("%.20f\n",0.1f);
		System.out.printf("%.20f\n",0.1);
	}

}
