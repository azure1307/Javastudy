package chap7;
/*
 * final 클래스: 종단클래스. 변경불가 클래스. 다른 클래스의 부모 클래스가 될 수 없다.
 * final 의미: 변경불가
 * 대표적인 final 클래스: String, Math 클래스
 */
// class MyString extends String {}
final class Final { //다른 클래스의 부모 클래스가 될 수 없다.
	
}
//class FinulSub extends Final { //Final 클래스가 final(종단) 클래스임
//	
//}
public class FinalClassEx1 {
	public static void main(String[] args) {
		Final f = new Final(); //객체화 가능

	}

}
