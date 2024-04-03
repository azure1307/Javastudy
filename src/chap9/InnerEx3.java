package chap9;
/*
 * 내부 클래스의 객체에서 사용되는 this
 */
class Pouter {
	int iv = 0;
	int iv2 = 200;
}
class Outer3 extends Pouter {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method() {
			int iv = 300;
			System.out.println("iv="+iv);
			/*
			 * 변수 접근 우선순위 (iv 기준)
			 * 1. 지역변수(300)
			 * 2. 내부클래스의 멤버변수(100)
			 * 3. 외부클래스의 멤버변수(10)
			 * 4. 외부클래스의 부모클래스의 멤버변수(0)
			 */
			System.out.println("iv2="+iv2);
			//this:자기참조변수. InstanceInner의 객체를 참조
//			       외부클래스의 멤버 접근 불가
			System.out.println("this.iv="+this.iv);
			//외부클래스의 멤버인 iv2 변수는 this로 접근불가
//			System.out.println("this.iv="+this.iv2);
			//InstanceInner의 super는 Pouter가 아니라 Object임
//			System.out.println("super.iv="+super.iv);
			
			//우선순위 낮은 10(외부의 멤버변수)을 우선해서 출력하고 싶을때
			System.out.println("Outer3.this.iv="+Outer3.this.iv);
			//우선순위 낮은 0(외부의 부모의 멤버변수)을 우선해서 출력하고 싶을때
			System.out.println("Outer3.super.iv="+Outer3.super.iv);
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		new Outer3().new InstanceInner().method();
	}

}
