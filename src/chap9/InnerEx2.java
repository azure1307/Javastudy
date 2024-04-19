package chap9;
/*
 * 내부 클래스에서 외부 클래스의 private 멤버에 접근
 */
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner { //private이어도 같은 멤버라서 접근 가능하다
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner {
		//siv에 붙은 static이 아니라 StaticInner에 붙은 static때문...
//		static int siv = outeriv; //siv가 초기화되는 시점에 outeriv는 존재x.
		int siv = new Outer2().outeriv;
		int siv2 = outercv;
		static int scv = outercv;
	}
	void method(int pv) {
//		pv--;
		final int lv = 500;
//		lv += 10;
		class LocalInner { //지역 내부 클래스
			int liv = outeriv;
			int liv2 = outercv;
			/*
			 * 지역내부클래스의 멤버메서드(method(int num))에서 외부메서드(method(int pv))의 지역변수는
			 * 상수화되어야 접근가능
			 * 외부 메서드의 지역변수가 변경없으면 상수로 판단
			 * 외부 메서드의 지역변수가 변경있으면 내부 클래스의 멤버메서드에서 오류 발생
			 */
			void method(int num) {
				num++;
				outeriv++;
				outercv++;
				liv++;
				liv2++;
				System.out.println("outeriv="+outeriv);
				System.out.println("outercv="+outercv);
				System.out.println("liv="+liv);
				System.out.println("liv2="+liv2);
//				pv++; //외부메서드의 
				System.out.println("pv="+pv); //상수화 필요
				System.out.println("num="+num);
			}
		}
		LocalInner li = new LocalInner();
		li.method(3);
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
		//외부 클래스의 객체 생성
		Outer2 out = new Outer2();
		//private멤버를 InnerEx2클래스에서 접근x
//		System.out.println("out.outeriv="+out.outeriv); 
//		System.out.println("Outer2.outercv="+Outer2.outercv);
		
		//InstanceInner, StaticInner 객체 생성해서 모든 멤버값 출력하기
		Outer2.InstanceInner oii = new Outer2().new InstanceInner();
		System.out.println("Outer2.InstanceInner.iiv = "+oii.iiv);
		System.out.println("Outer2.InstanceInner.iiv = "+oii.iiv2);
		System.out.println();
		
		// 시험에 나왔던 부분
		Outer2.StaticInner osi = new Outer2.StaticInner();
		System.out.println("osi.siv = "+osi.siv);
		System.out.println("osi.siv2 = "+osi.siv2);
		System.out.println("osi.scv2 = "+Outer2.StaticInner.scv);
		System.out.println();
		
		out.method(1000);
		System.out.println();
		
		int lv = 100;
//		lv++;
		Runnable r = () -> {
			System.out.println(lv);
		};
		r.run();
	}
}
