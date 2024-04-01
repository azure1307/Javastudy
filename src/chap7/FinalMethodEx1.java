package chap7;
/*
 * final: 변경불가
 * final 메서드: 재정의 불가. 오버라이딩 불가 함수
 * abstract: 무조건 오버라이딩해야함
 * final: 오버라이딩하면 절대안됨
 * 그래서 둘을 같이 쓸 수 없다 ! 
 */
class FinalMethod {
	final void method() {
		System.out.println("FinalMethod의 method");
	}
	void method1() {
		System.out.println("FinalMethod의 method1");		
	}
}
class FinalMethodSub extends FinalMethod {
//	void method() { //부모클래스에 있는 final method를 오버라이딩하고있기때문에.. 에러남
//		System.out.println("FinalMethodSub의 method");
//	}
	void method1() {
		System.out.println("FinalMethodSub의 method1");
	}
} 
public class FinalMethodEx1 {
	public static void main(String[] args) {
		FinalMethodSub f = new FinalMethodSub();
		f.method(); //자식클래스에는 method()가 없으니까 부모클래스의 method() 호출
		f.method1();
	}

}
