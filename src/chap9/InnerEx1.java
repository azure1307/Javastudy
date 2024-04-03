package chap9;
/*
 * 내부 클래스(중첩 클래스) 예제
 *     - 클래스 내부에 존재하는 클래스
 *     - 참조 자료형으로 사용할 수 있음(클래스=사용자 정의 자료형). 객체로 만들 수 있음.
 *     - 다른 클래스를 상속받을 수 있음. Object 클래스의 하위 클래스.
 *     - 자료형으로 사용할 때: 외부클래스.내부클래스
 *     - 바이트 코드 생성
 *     - 외부 클래스는 내부 클래스를 멤버로 생각하기때문에, private 멤버 접근 가능
 *     
 * 인스턴스 내부클래스
 *     - 외부 클래스의 객체화가 되어야 클래스기능 사용 가능
 *       new 외부클래스(...).new 내부클래스(...)
 * static 내부클래스
 *     - 외부 클래스를 객체화하지 않아도 바로 사용 가능
 *       new 외부클래스명.내부클래스명(...)
*/
class Outer1 { //외부클래스
	class InstanceInner extends Object { //인스턴스 내부클래스
		int iv = 100;
		static int cv = 10;
		final static int MAX = 200;
	}
	static class StaticInner { //static 내부클래스
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		class LocalInner { //지역(로컬) 내부클래스: 메서드 내부에서만 접근가능
			int iv = 600;
			static int cv = 700;
			final static int MAX = 800;
		}
		LocalInner li = new LocalInner();
		System.out.println("LocalInner.iv="+li.iv);
		System.out.println("LocalInner.cv="+LocalInner.cv); //클래스변수라 클래스가 로드되어야 함
		System.out.println("LocalInner.MAX="+LocalInner.MAX);
	}
	static void method2() {
//		LocalInner li = new LocalInner(); //지역 내부클래스는 메서드 밖에서 접근할 수 없다
		class LocalInner { //지역(로컬) 내부클래스: 메서드 내부에서만 접근가능
			int iv = 900;
			static int cv = 1000;
			final static int MAX = 1100;
		}
		LocalInner li = new LocalInner();
		System.out.println("LocalInner.iv="+li.iv);
		System.out.println("LocalInner.cv="+LocalInner.cv); //클래스변수라 클래스가 로드되어야 함
		System.out.println("LocalInner.MAX="+LocalInner.MAX);
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		new Outer1().method();
//		Outer1 o = new Outer1();
//		o.method();
		System.out.println();
		
		Outer1.method2(); //굳이 객체화시키지 않아도 바로 쓸 수 있음
		System.out.println();
		
		//InstanceInner(인스턴스 내부클래스)의 객체화
//		Outer1.InstanceInner oi = new Outer1.InstanceInner();
		//외부 클래스가 객체화되어야 내부 클래스도 객체화할 수 있음
		Outer1.InstanceInner oi = new Outer1().new InstanceInner();
		System.out.println("InstanceInner.iv="+oi.iv);
		System.out.println("InstanceInner.cv="+Outer1.InstanceInner.cv);
		System.out.println("InstanceInner.MAX="+Outer1.InstanceInner.MAX);
		System.out.println();
		
		//StaticInner(static 내부클래스)의 객체화
		Outer1.StaticInner os = new Outer1.StaticInner();
		System.out.println("StaticInner.iv="+os.iv);
		System.out.println("StaticInner.cv="+Outer1.StaticInner.cv);
		System.out.println("StaticInner.MAX="+Outer1.StaticInner.MAX);
		
	}

}
