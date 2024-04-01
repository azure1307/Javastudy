package chap7;

import chap7.test.Modifier2;
/*
 * 접근제어자: private < (default) < protected < public
 * 
 *    필드,메서드		: private < (default) < protected < public
 *    
 *    클래스   		: (default) < public
 *    -default 클래스	: 같은 패키지에서만 접근 허용
 *    -public 클래스	: 모든 접근 허용
 *    
 * 오버라이딩 조건
 *   1. 부모클래스와 자손클래스의 메서드명 일치
 *   2. 매개변수 목록 일치
 *   3. 리턴타입 일치
 *   4. 접근제한자는 일치하거나 큰 범위로 가능
 */
class Modifier3 extends Modifier2 {
	public void method() {
		System.out.println("chap7.Modifier3.method");
//		System.out.println("v1=" + v1); //private. 같클만. 다른 클래스라서
//		System.out.println("v2=" + v2); //default. 같패만. 다른 패키지라서
		System.out.println("v3=" + v3); //protected. 다른 패키지지만 상속받아서 ㄱㅊ
		System.out.println("v4=" + v4); //public.
	}
}

public class ModifierEx3 {
	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2();
		m2.method();
		
		Modifier3 m3 = new Modifier3();
		m3.method();
	}

}
