package test0405;
/*
 * 다음 결과가 나오도록 프로그램 수정하기
 * [결과]
 * basket
 * basketball
 */

public class Test2 {
	public static void main(String[] args) {
		String str = "base"; 
		str = str.replace('e', 'k') + "et";
		System.out.println(str);
		str += "ball"; 
		System.out.println(str);
	}
}
