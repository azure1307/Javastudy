package chap7;
/*
 * super 예약어
 *   - super() 생성자
 *     - 자손클래스에서 부모클래스의 생성자를 호출할 때 사용
 *     - 자손클래스의 생성자 첫 줄에 구현해야 함
 *     - 부모클래스의 생성자 중 매개변수가 없는 생성자가 있다면 생략 가능: super()
 *     - 부모클래스의 생성자 중 매개변수가 없는 생성자가 있다면 생략 가능: super(...)
 *   - super 참조변수
 *     - 부모클래스의 객체를 참조하는 참조변수 (this는 나.. super는 부모)
 *     인스턴스 메서드에서만 사용 가능함
 */
class Parent {
	int x = 10;
	Parent(int x) {
		System.out.println("Parent 클래스의 생성자1");
		this.x = x;
	}
	Parent() {
	    System.out.println("Parent 클래스의 생성자2");
	}
}

class Child extends Parent {
	int x = 20;
	Child() {
		super(100);
		System.out.println("Child 클래스의 생성자");
	}
	void method() {
		int x = 30;
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		//부모에 x가 없으면 super.x 사용할 수 없음
		System.out.println("super.x="+super.x);
	}
}

public class SuperEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
		c.method();
	}
}
