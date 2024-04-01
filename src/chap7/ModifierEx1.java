package chap7;
/*
 * 접근제어자(접근제한자)
 *   private < (default) < protected < public
 * 제어자(제한자)
 *   static, abstract, final
 *   
 * [접근제어자] [제어자] 리턴타입 메서드명(매개변수타입 매개변수명) {}
 */
class Modifier {
	private int v1 = 100;
	        int v2 = 200;
	protected int v3 = 300;
	public int v4 = 400;
	public void method() {
		System.out.println("chap7.Modifier 클래스의 메서드");
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
	}
}
public class ModifierEx1 {
	public static void main(String[] args) {
		Modifier m = new Modifier();
//		m.v1=10; //private 멤버 => 같클에서만 접근가능
		m.v2=20; //default 멤버 => 같패에서만 접근가능
		m.v3=30; //protected 멤버 => 같패 + 같패 아니더라도 상속관계면 접근가능
		m.v4=40; //public 멤버 => 모두 접근가능
		m.method();
	}

}
