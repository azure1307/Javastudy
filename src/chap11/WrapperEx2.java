package chap11;
/*
 * 
 */
public class WrapperEx2 {
	public static void main(String[] args) {
		Integer i1 = (Integer)100;
		Integer i2 = 100;
		System.out.println("i1==i2 : "+(i1==i2));
		
		Integer i3 = new Integer(100);
		Integer i4 = new Integer(100);
		System.out.println("i3==i4 : "+(i3==i4));
		
		int i5 = new Integer(100); // unBoxing 발생
		
		// i5는 값, i4는 객체. 둘을 비교할 때에는 unBoxing이 발생해 값만 비교함 
		System.out.println("i5==i4 : "+(i5==i4)); // i4: unBoxing 발생
		System.out.println();
		
		// int 형
		System.out.println("int 형의 최대값: " + Integer.MAX_VALUE);
		System.out.println("int 형의 최소값: " + Integer.MIN_VALUE);
		System.out.println("int 형의 bit 크기: " + Integer.SIZE);
		System.out.println();
		
		// Byte 형
		System.out.println("byte 형의 최대값: " + Byte.MAX_VALUE);
		System.out.println("byte 형의 최소값: " + Byte.MIN_VALUE);
		System.out.println("byte 형의 bit 크기: " + Byte.SIZE);
		System.out.println();
		
		// 문자열 값을 숫자로 변경
		int i = Integer.parseInt("100");
		float f = Float.parseFloat("100.5");
		Double d = Double.parseDouble("123.567");
		Long l = Long.parseLong("100");
		
		// 10진수를 2,8,16진수로 변경
		System.out.println("255의 2진수 : "+Integer.toBinaryString(255));
		System.out.println("255의 8진수 : "+Integer.toOctalString(255));
		System.out.println("255의 16진수 : "+Integer.toHexString(255));
		System.out.println();
		
		// 2,8,16진수에서 10진수로 변경
		i = Integer.parseInt("FF",16);
		System.out.println("16진수:FF => 10진수:"+i);
		i = Integer.parseInt("377",8);
		System.out.println("8진수:377 => 10진수:"+i);
	}
}
