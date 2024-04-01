package chap6;
//추상화: 클래스를 만드는 과정
//클래스: 객체를 만듦 
//static이 붙어있으면 클래스 변수/메서드가 된다 -> 클래스멤버: 클래스정보 로드시 준완. 클래스명.멤버명 
//static 안붙어있으면 인스턴스 변수/메서드가 된다 -> 인스턴스멤버: 객체 생성시 준완. 참조변수명.멤버명
//클래스멤버에서 인스턴스멤버를 직접 호출할 수 없음.
/*
 * 재귀함수 : Recursive call => 메서드 내에서 자신의 함수를 호출하는 함수
 */
public class FactorialEx1 {
	public static void main(String[] args) {
		System.out.println("4!=" + new FactorialEx1().factorial(4));
	}

	//static 지우면 error
	//static지우면 인스턴스메서드가 됨. 얘는 객체를 만들어야 사용할 수 있다. 
	private int factorial(int i) {
		return (i==1)?1:factorial(i-1)*i;
	}

}
