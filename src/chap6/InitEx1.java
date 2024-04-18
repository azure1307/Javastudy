package chap6;
/*
 * 초기화 블럭 예제
 * - static 초기화 블럭
 *   - 기능: 클래스변수를 초기화해줌.
 *   - 실행시점: 클래스정보 로드시 딱 1번! 실행함. 메인메서드보다 먼저 실행
 * - 인스턴스 초기화 블럭
 *   - 기능: 인스턴스변수를 초기화해줌. 근데 생성자랑 기능이 겹쳐서 잘 안쓴다
 *   - 실행시점: 객체를 만들때마다 생성자 호출전에 실행
 *   
 * 순서) static 초기화블럭 > 메인 메서드 >
 *      객체 생성 후 호출 > 인스턴스 초기화블럭 > 생성자   
 */
public class InitEx1 {
	static int cv;
	int iv;
	InitEx1() {
		System.out.println("5. 생성자 호출됨");
	}
	
	static { //static 초기화 블럭. 클래스 변수를 초기화. 메인메서드보다 먼저 실행
		cv = (int)(Math.random()*100);
		System.out.println("1. static 초기화 블럭 실행. cv="+cv);
	}
	
	{ //인스턴스 초기화 블럭. 생성자보다 먼저 실행. 객체를 만들때마다 초기화해줌
		iv = (int)(Math.random()*100);
		System.out.println("4. 인스턴스 초기화 블럭 실행. iv="+iv);		
	}
	
	public static void main(String[] args) {
		System.out.println("2. main 메서드 시작");
		System.out.println("3. main 메서드에서 init1 객체 생성 cv="+cv);
		InitEx1 init1 = new InitEx1();
		System.out.println("3. main 메서드에서 init2 객체 생성 cv="+cv);
		InitEx1 init2 = new InitEx1();
		System.out.println("6. main 메서드 종료");
	}
}
