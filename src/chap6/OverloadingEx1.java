package chap6;
/*
 * 메서드 오버로딩: 메서드의 다형성
 *   1. 동일한 클래스 내부에 같은 이름을 가진 메서드가 여러 개 존재할 수 있다.
 *   2. 단, 매개변수의 목록(자료형, 갯수, 순서)이 달라야한다. 
 */
class Math2 {
	int a = 100;
	int add(int b) {
		System.out.print("1: ");
		return a+b;
	}
	//자료형이 달라야함! 이름만 다른건 존재x
//	int add(int x) {
//		System.out.print("1: ");
//		return a+x;
//	}
	double add(double b) {
		System.out.print("2: ");
		return a+b;
	}
	String add(String b) {		
		System.out.print("3: ");
		return a+b;
	}
}
public class OverloadingEx1 {
	public static void main(String[] args) {
		Math2 m = new Math2();
		System.out.println(m.add(10));
		System.out.println(m.add(10.5));
		System.out.println(m.add("번"));
		System.out.println(m.add(10L)); //double로 자동 형변환되어 2번 호출

	}

}
