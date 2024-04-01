package chap7;
/*
 * 추상클래스간의 상속
 */
abstract class Abs1 {
	int a = 10;
	abstract int getA();
}
//추상클래스가 추상클래스를 상속할 수 있음
//추상클래스가 추상클래스를 상속받으면 추상메서드 구현안해도 ㄱㅊ음. 추상클래스는 추상메서드 가질수있어서
abstract class Abs2 extends Abs1 {
	int b = 20;
	abstract int getB();
}
//대신 얘는 추상클래스 아니라서 getA, getB 둘 다 구현해줘야됨
class Normal extends Abs2 {
	int getB() {
		return b;
	}

	int getA() {
		return a;
	}

}
public class AbstractEx2 {
	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println(n.a);
		System.out.println(n.getA());
		System.out.println(n.b);
		System.out.println(n.getB());
		System.out.println();
		
		System.out.println("Abs2 타입으로 형변환");
		Abs2 a2 = n; //부모타입의 참조변수 <= 자손타입의 참조변수 : 자동형변환.
		System.out.println(a2.a);
		System.out.println(a2.getA());
		System.out.println(a2.b);
		System.out.println(a2.getB());
		System.out.println();
		
		System.out.println("Abs1 타입으로 형변환");
		Abs1 a1 = a2;
		System.out.println(a1.a);
		System.out.println(a1.getA());
		//b와 getB는 Abs1의 멤버가 아니라서
//		System.out.println(a1.b);
//		System.out.println(a1.getB());
		System.out.println();
		
		System.out.println("Object 타입으로 형변환");
		Object o = a1;
		//a, getA(), b, getB()는 Object의 멤버가 아니라서
		System.out.println(((Abs1)o).a); //o를 Abs1으로 형변환해서 a를 호출
		System.out.println(((Abs1)o).getA());
		System.out.println(((Abs2)o).b);
		System.out.println(((Abs2)o).getB());
	}

}
