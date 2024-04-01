package chap2;
//주석 : 실행 영역이 아님. 자바 문법에서 제외
//한 줄 주석: // 이후 한 줄이 주석임
/*
 *  여러 줄 주석: / * 부터 * / 까지 주석임
 *  문법과 상관없이 소스의 설명 등을 기술함
 */
/*
 * 자바 실행 단계
 * 1. 소스 코딩: VarEx1.java
 * 2. 컴파일: 파일 저장하면 자동 컴파일됨. 오류는 빨간 x로 표시됨.
 * 			javac VarEx1.java 를 이클립스가 실행함 --> 바이트코드 생성
 * 3. 실행: java VarEx1 를 이클립스에서 실행함
 * 		   (1) JVM 환경 생성 
 * 		   (2) 바이트코드 메모리에 로드
 * 		   (3) main 메서드를 찾아서 실행
 * */
public class VarEx1 {

	public static void main(String[] args) { //프로그램의 시작
		int num; //변수 선언 : 메모리 4바이트 할당
		num = 100; //변수의 초기화 : num 변수에 100이라는 값을 대입
		System.out.println(num); //화면 출력
		num = 200;
		System.out.println(num);
		
		int num2 = 100;
		System.out.println(num2);
		
		//double 타입 변수 d 선언 후 10.5라는 값을 저장하고 출력
		double d = 10.5;
		System.out.println(d);
		
		//문자(char): 'A', 문자열(String): "A"
		//char 타입 변수 c 선언 후 A라는 문자를 저장하고 출력
		char c = 'A';
		System.out.println(c);
		
		//boolean 타입 변수 b 선언 후 false라는 값을 저장하고 출력
		boolean b = false;
		System.out.println(b);
	}

}
