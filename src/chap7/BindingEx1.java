package chap7;
/*
 * 부모클래스의 멤버와 자손클래스의 멤버가 동일한 경우
 * - 변수(필드): 참조변수의 자료형을 따름
 * - 메서드: 최종 오버라이딩된 메서드를 호출함
 */
class Parent2 {
	int x = 10;
	void method() {
		System.out.println("Parent2.method()");
	}
}
class Child2 extends Parent2 {
	int x = 20;
	void method() {
		super.method(); //부모의 method() 실행
		System.out.println("Child2.method()");
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
		System.out.println();
	}
}
public class BindingEx1 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
		System.out.println("c.x="+c.x);
		System.out.println();

		Parent2 p = c;
		p.method();
		//Child2 객체로 가도 p가 가진 변수만 호출가능. 메서드만 최종오버라이딩된 애 쓰는거임
		System.out.println("p.x="+p.x);		
	}

}
