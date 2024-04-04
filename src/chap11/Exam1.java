package chap11;
/*
 * [결과]
 * 다른 객체임
 * 같은 숫자임
 * 
 * 참조형의 내용 비교는 equals() 메서드 사용
 */
class Number {
	int num;
	Number (int num) {
		this.num = num;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Number) {
			Number n = (Number)obj;
			// return n1.num == n2.num; n2는 (Number)obj
			return num == n.num;
		}
		return false;
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Number n1 = new Number(100);
		Number n2 = new Number(100);
		
		if (n1 == n2) {
			System.out.println("같은 객체임");
		} else {
			System.out.println("다른 객체임");
		}
		
		if (n1.equals(n2)) {
			System.out.println("같은 숫자임");
		} else {
			System.out.println("다른 숫자임");
		}
		System.out.println();
		
		Equal e = new Equal(10);
		// e값을 넣어도 obj긴 하니까 에러는 안남. Number를 참조하고있지않으니 다른 숫자라고 출력
		if (n1.equals(e)) {
			System.out.println("같은 숫자임");
		} else {
			System.out.println("다른 숫자임");
		}
		System.out.println();
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		if (s1 == s2) {
			System.out.println("같은 객체임");
		} else {
			System.out.println("다른 객체임");
		}
				
		if (s1.equals(s2)) {
			System.out.println("같은 문자열임");
		} else {
			System.out.println("다른 문자열임");
		}
		
	}
}
