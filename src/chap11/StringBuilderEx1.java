package chap11;
/*
 * StringBuilder/StringBuffer 클래스 : 동적 문자열
 *    - 두 개의 클래스는 같은 메서드를 멤버로 가짐
 *    - equals 메서드를 오버라이딩하지 않음 => 내용비교 안됨
 *      => 내용을 비교하려면 문자열(String)로 변경하여 비교함
 *      => toString() 로 문자열로 변환 가능
 */
public class StringBuilderEx1 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println("sb1==sb2 : "+(sb1==sb2)); // 참조변수비교
		// 내용비교. String이었으면 됐는데 얘는 안됨. equals 메소드를 오버라이딩하지 않아서
		System.out.println("sb1.equals(sb2) : "+(sb1.equals(sb2))); 
		
		// 그래서 비교하려면 toString() 써서 문자열로 변환 후 equals()로 비교해야 한다
		System.out.println("sb1.toString().equals(sb2.toString()) : "
		 +(sb1.toString().equals(sb2.toString())));
		
		// 시험에서 나왔던 부분
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a, b);
		System.out.println(a + "," + b);
	}
	static void operate(StringBuffer x, StringBuffer y) {
		x.append(y);
		System.out.println("x:"+x);
		y = x;
		System.out.println("y:"+y);
	}
}
