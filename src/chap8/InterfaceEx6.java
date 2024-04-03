package chap8;
/*
 * jdk8.0 이후에 인터페이스에 추가된 멤버 => 구현부 존재 메서드
 *   - default 메서드
 *     - 구현부를 가짐
 *     - 인스턴스 메서드
 *     - 오버라이딩 가능
 *       (1) 필수는 아니고 할 수 있음
 *       (2) 다중구현에서 동일한 메서드가 2개 이상일 경우 구현 클래스에서 반드시 오버라이딩 해야함
 *   - static 메서드
 *     - 구현부를 가짐
 *     - 클래스 메서드, 클래스 멤버.
 *     - 다중구현에서 동일한 메서드가 2개 이상인 경우 상관 없음.
 *       호출할 때 인터페이스명.static메서드명
 */
interface MyInterface1 {
	void method();
	default void method1() {
		System.out.println("MyInterface1의 default 메서드: method1");
	}
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드: staticMethod");
	}
}
interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface2의 default 메서드: method1");
	}
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메서드: staticMethod");
	}
}
class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메서드: method2");
	}
}
//MyInterface1, MyInterface2 인터페이스의 추상메서드 오버라이딩
class Child extends Parent implements MyInterface1, MyInterface2 {
	public void method() {
		System.out.println("Child 클래스에서 오버라이딩된 메서드: method");
	}
	//my1, my2 둘 다 method1가 있는 경우에는 둘을 구현한 구현부에서 따로 오버라이딩해서 사용해야함
	public void method1() {
		System.out.println("Child 클래스에서 오버라이딩된 메서드: method1");
		MyInterface1.super.method1(); //MyInterface1의 method1 호출
		MyInterface2.super.method1(); //MyInterface2의 method1 호출
	}
}
public class InterfaceEx6 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1();
//		c.staticMethod();
//		Child.staticMethod();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}

}
