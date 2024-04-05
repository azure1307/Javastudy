package chap11;
/*
 * String: 정적인 문자열. 변경할 수 없다
 */
public class StringEx3 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main : " + str);
		
		str = change(str);
		System.out.println("change 후 : "+str);
	}
	
	// main에서도 바뀐 값을 사용하려면 바뀐 값을 main까지 전달해줘야함.(리턴) 
	private static String change(String str) {
		str += "456";
		System.out.println("change : "+str);
		return str;
	}

//	private static void change(String str) {
//		str += "456";
//		System.out.println("change : "+str);
//	}
}
