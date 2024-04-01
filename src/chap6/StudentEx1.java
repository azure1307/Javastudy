package chap6;
/*
 * 추상화 : 클래스 생성 단계
 * - 클래스 : 사용자 정의 자료형. 객체 생성 도구 => 객체지향언어에서 가장 중요한 개념
 *   - 속성 : 필드, 멤버변수
 *   - 기능 : 메서드, 멤버함수
 *   
 * 하나의 파일에 여러개의 클래스 존재가능
 * - 파일의 이름은 반드시 public 클래스의 이름과 같아야 한다.
 * - 그리고 public 클래스도 한 개만 있어야 한다.
 * 
 * Java Application
 *   - main 함수가 프로그램의 시작(main 메서드가 존재하지않으면 자바 어플리케이션으로 실행할 수 없음)
 *   - main 함수를 포함하고 있는 클래스를 구동 클래스라고 부름
 *   - 구동 클래스를 public 클래스로 선언함
 */
class Student {
	String studno;
	String name;
	String major;
	void study() {
		System.out.println("열심히 공부합니다.");
	}
}

public class StudentEx1 {
	public static void main(String[] args) {
		//객체화(인스턴스화)
		Student st1 = new Student();
		/*
		 * new 키워드
		 * 1. 힙영역에 메모리 할당 => 객체 생성
		 * 2. 필드값을 기본값으로 초기화
		 *    (정수형은 0, 실수형은 0.0, boolean은 false, 그 외는 null)
		 * 3. 생성자 호출
		 * 
		 * 대입 연산자를 이용하여 객체의 참조값을 참조변수에 대입
		 */
		st1.studno = "A240101";
		st1.name = "홍길동";
		st1.major = "컴퓨터공학";
		System.out.printf("학번: %s, 이름: %s, 전공: %s\n",st1.studno,st1.name,st1.major);
		st1.study();
		System.out.println();
		
		// A240102, 김삿갓, 경영인 학생의 객체 생성하기
		Student st2 = new Student();
		st2.studno = "A240102";
		st2.name = "김삿갓";
		st2.major = "경영학";
		System.out.printf("학번: %s, 이름: %s, 전공: %s\n",st2.studno,st2.name,st2.major);
		st2.study();
		System.out.println();
		
		System.out.println("st2 = st1 실행 이후");
		st2 = st1;
		st1.name = "이몽룡";
		System.out.printf("학번: %s, 이름: %s, 전공: %s\n",st1.studno,st1.name,st1.major);
		st1.study();
		System.out.printf("학번: %s, 이름: %s, 전공: %s\n",st2.studno,st2.name,st2.major);
		st2.study();
	}
}
