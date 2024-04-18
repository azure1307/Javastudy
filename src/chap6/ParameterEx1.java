package chap6;
/*
 * 매개변수 예제
 * - 기본형 매개변수: 호출된 메서드(change1)에서 호출한 메서드(main)의 변수값 변경 불가
 * - 참조형 매개변수: 호출된 메서드(change2)에서 호출된 메서드(main)의 변수값 변경 가능
 */
class Value {
	int val;
}
public class ParameterEx1 {
	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		change1(v.val);
		System.out.println("change1 함수 호출후: "+v.val);
		
		change2(v);
		System.out.println("change2 함수 호출후: "+v.val);
	}

	//v.val 값을 복사해서 상수 val에 저장
	private static void change1(int val) {
		val += 100;
		System.out.println("change1 함수 내부: " + val);
	}

	//실제 v.val 값 사용
	//Value v -> 메인에서 만들어놓은 v와 같은 객체를 참조 <<
	private static void change2(Value v) {
		v.val += 100;
		System.out.println("change2 함수 내부: " + v.val);		
	}

}
