package chap7;
/*
 * 추상클래스
 * 1. 추상메서드를 멤버로 가질 수 있는 클래스 => abstract 예약어 사용
 * 2. 직접 객체화 불가 -> 상속을 통해서 자손클래스의 객체화 가능
 * 3. 그 외 일반 클래스와 동일함 (생성자,필드,메서드,초기화블럭,상속받기,...)
 * 
 * 추상메서드
 * 1. 메서드의 선언부만 존재함. 구현부{} 가 없다 => abstract 예약어 사용
 * 2. 자손 클래스에서 반드시 오버라이딩 필요
 */
abstract class Shape { //추상 클래스
	String type;
	Shape(String type) {
		this.type = type;
	}
	abstract double area(); //추상 메서드: 하위 클래스에서 반드시 오버라이딩 해야함
	abstract double length(); //추상 메서드: 하위 클래스에서 반드시 오버라이딩 해야함
	public String toString() {
		return type;
	}
}

class Circle extends Shape {
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override
	double area() {
		return r*r*Math.PI;
	}
	@Override
	double length() {
		return 2*Math.PI*r;
	}
	public String toString() {
		return super.toString()+": 반지름:"+r+",면적="+String.format("%.2f", area())
		+",둘레:"+String.format("%.2f", length());
	}
}

//사각형: 가로=10,세로=10,면적=100.0,둘레:40.0
//원: 반지름=10,면적=어쩌구,둘레:저쩌구
//abstract 추가시, override 안해도 됨. 추상 클래스가 되면 추상 메서드를 가질 수 있는 자격을 얻기때문에
class Rectangle extends Shape {
	int width,height;
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return width*height;
	}
	@Override
	double length() {
		return (width+height)*2;
	}
	public String toString() {
		return super.toString()+": 가로="+width+",세로="+height+",면적="+area()+",둘레="+length();
	}
}

public class AbstractEx1 {
	public static void main(String[] args) {
//		추상클래스는 객체로 만들 수 없다
//		Shape s = new Shape();
		
		Shape[] sarr = new Shape[2];		
		sarr[0] = new Circle(10);
		sarr[1] = new Rectangle(10,10);
		
		//전체 도형의 면적과 둘레 출력하기
		double totArea = 0, totLength = 0;
		for (int i=0;i<sarr.length;i++) {
			totArea += sarr[i].area();
			totLength += sarr[i].length();
		}
		System.out.printf("전체 도형 면적: %.2f\n",totArea);
		System.out.printf("전체 도형 둘레: %.2f\n",totLength);
		System.out.println("================");
		//각 도형의 멤버변수 출력하기
		//사각형: 가로=10,세로=10,면적=100.0,둘레:40.0
		//원: 반지름=10,면적=어쩌구,둘레:저쩌구
		System.out.println(sarr[0]);
		System.out.println(sarr[1]);
		System.out.println("================");
		
		for (Shape s:sarr) {
			System.out.print(s.type+":");
			if (s instanceof Circle) { //s가 참조하는 객체가 Circle 객체라면
				Circle c = (Circle)s;
				System.out.print("반지름="+c.r);
			} 
			if (s instanceof Rectangle) { //s가 참조하는 객체가 Rectangle 객체라면
				Rectangle r = (Rectangle)s;
				System.out.print("가로="+r.width+",세로="+r.height);
			} 
			System.out.println(",넓이="+s.area()+",둘레="+s.length());
		}
	}
}
