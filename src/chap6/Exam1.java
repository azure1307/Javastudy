package chap6;
/*
 * 1. 직사각형(Rectangle) 클래스 구현하기
 *    - 필드: 가로(width), 세로(height)
 *    - 메서드: void area() => 넓이 출력. 넓이=가로*세로
 *    - 메서드: void length() => 둘레 출력. 둘레=(가로+세로)*2
 * 2. 구동클래스(Exam1) 구현.     구동 클래스: main 메서드를 가진 클래스
 *    - Rectangle 클래스의 객체 생성하기 => r1 참조변수로 참조하기
 *    - 가로(10),세로(5)로 값 초기화
 *    - r1 사각형의 넓이, 둘레 출력
 *    
 */
class Rectangle {
	int width;
	int height;
	void area() {
		System.out.println("넓이: " + width*height);
	}
	void length() {
		System.out.println("둘레: "+(width+height)*2);
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		r1.area();
		r1.length();
		
		Rectangle r2 = new Rectangle();
		r2.width = 10;
		r2.height = 10;
		r2.area();
		r2.length();		
	}
}
