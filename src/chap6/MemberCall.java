package chap6;
/*
 * 클래스
 * - 변수(필드)
 *     - 클래스 변수
 *     - 인스턴스 변수
 * - 메서드
 *     - 클래스 메서드
 *     - 인스턴스 메서드
 *     
 * 클래스 멤버: 클래스 변수, 클래스 메서드.		클래스명.멤버명
 * 인스턴스 멤버: 인스턴스 변수, 인스턴스 메서드		참조변수명.멤버명
 * 
 * 클래스 멤버끼리 클래스 멤버 호출: 정상
 * 인스턴스 멤버끼리 인스턴스 멤버 호출: 정상
 * 클래스 멤버에서 인스턴스 멤버 호출: 객체화가 필요
 * 인스턴스 멤버에서 클래스 멤버 호출: 정상
 * 
 * 같은 멤버들 간에는 클래스명, 참조변수명 생략 가능
 * 단, 클래스 멤버에서 인스턴스 멤버 호출할 때는 참조변수명 사용해야함
 */
public class MemberCall {
	static int cv1 = 10;	//클래스변수
	static int cv2 = 20;	//클래스변수
	int iv1 = 100;			//인스턴스변수
	int iv2 = iv1;			//인스턴스변수
	int iv3 = cv1;			//MemberCall 변수 생성시 iv3에 값 부여
//	static int cv3 = iv1;	//cv3은 로드됨. 근데 iv1는 객체생성돼야 사용가능해서 에러
	static int cv3 = new MemberCall().iv1;	//객체화 필요. 참고로 얘는 참조변수가 없어서 걍 한 번 쓰고버림,,
	void method1() {		//인스턴스메서드
		System.out.println("cv1+cv2="+(cv1+cv2));
		System.out.println("iv1+iv2="+(iv1+iv2));
	}
	static void method2() {	//클래스메서드
		System.out.println("cv1+cv2="+(cv1+cv2));
//		System.out.println("iv1+iv2="+(iv1+iv2)); //클래스메서드에서 인스턴스변수 직접 호출x!! 객체화 필요
		MemberCall m = new MemberCall();
		System.out.println("iv1+iv2="+(m.iv1+m.iv2));		
	}
	void method3() { //인스턴스메서드
		method1(); 	//인스턴스메서드
		method2();	//클래스메서드. 이미 준완
	}
	static void method4() { //클래스메서드
//		method1();	//인스턴스메서드.
		new MemberCall().method1();	//인스턴스메서드.
		method2();	//클래스메서드.
	}
	public static void main(String[] args) {	//main도 static 붙었으니까 클래스메서드
		MemberCall m = new MemberCall();
		m.method1(); //인스턴스메서드라 객체 생성해줘야함
		method2(); //클래스메서드라 이미 준완
		//원래는 MemberCall.method2(); 인데 같은 멤버라 클래스명 생략가능
		m.method3(); //인스턴스메서드라 객체 생성해줘야함
		method4(); //클래스메서드라 이미 준완
	}
}
