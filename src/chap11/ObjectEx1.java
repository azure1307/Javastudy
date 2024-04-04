package chap11;
/*
 * Object 클래스: equals 메서드
 * equals 멤서드: 같은 내용인지 비교
 *            - Object 클래스의 equals 메서드는 ==와 같은 기능을 함
 *            - 내용 비교를 위해서는 오버라이딩 필요
 * ==: 같은 객체 여부 리턴 
 */
class Equal {
	int value;
	Equal(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		// obj가 참조하고 있는게 Equal 객체일 경우
		if (obj instanceof Equal) {
			Equal e = (Equal)obj;
			//참조변숫값이 아니라 Equal이 가지고 있는 내용값을 비교
			return value == e.value;
		} else {
			return false;
		}
	}
	
}
public class ObjectEx1 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		
		if (e1 == e2) {
			System.out.println("e1과 e2는 같은 객체임");
		} else {
			System.out.println("e1과 e2는 다른 객체임");
		}
		
		if (e1.equals(e2)) {
			System.out.println("e1과 e2는 같은 내용의 객체임");
		} else {
			System.out.println("e1과 e2는 다른 내용의 객체임");
		}
	}
}
