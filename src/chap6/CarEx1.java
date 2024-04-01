package chap6;
/*
 * 선언 위치에 따른 변수의 종류
 * 					선언 위치		선언 방법				메모리 할당 시점		메모리 할당 위치
 * - 클래스 변수		클래스 내부		static 자료형 변수명;	클래스 정보 로드시	class 영역
 * 				=>  객체화될 필요가 없음. 바로 사용할 수 있으니까 / 모든 객체의 공통변수로 사용됨
 * 				=>  클래스명.변수명		ex) Car.color
 * 				=>  기본값으로 초기화 된 상태
 * 
 * - 인스턴스 변수		클래스 내부			   자료형 변수명;	객체화시			heap 영역
 * 				=>  객체화 필요. 객체별로 다른 메모리 할당
 * 				=>  참조변수명.변수명		ex) c1.color
 * 				=>  기본값으로 초기화 된 상태
 * 
 * - 지역 변수			메서드 내부		자료형 변수명;			선언문 실행시		stack 영역
 * 				=>  메서드, 블럭 내에서만 사용가능
 * 				=>  기본 값으로 초기화 안 되어있음. 반드시 해줘야함!
 * 				=>  매개변수도 지역변수에 속함
 */
class Car {
	//인스턴스 변수
	String color;
	int number;
	//static: 객체 생성하기 전부터 메모리할당
	//클래스 변수
	static int width = 200;
	static int height = 120;
	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}
public class CarEx1 {
	//args는 지역변수(매개변수를 포함함)
	public static void main(String[] args) {
		System.out.println(Car.width + "," + Car.height);
		//c1, c2는 지역변수
		Car c1 = new Car();
		c1.color = "White";
		c1.number = 1234;
		System.out.println("c1: "+c1.toString());
		
		Car c2 = new Car();
		c2.color = "Red";
		c2.number = 5678;
		System.out.println("c2: "+c2.toString());
		
		//static 지정한 값은 static 으로만 접근할 수 있다
		//근데 니 왜 객체로 접근함?(warning) 근데 바꿔주긴 한다
		Car.width = 80; //c1.width = 80; 하면 warning
		Car.height = 50; //c2.height = 50; 하면 warning
		System.out.println("c1: "+c1.toString());
		System.out.println("c2: "+c2.toString());
		
		//지역변수는 반드시 초기화 해줘야함!
		int num = 0;
		System.out.println(num);
		
		int i;
		boolean b = true;
		if (b) {
			i = 10;
		} else {
			i = 20;
		}
		System.out.println(i);
		
		int j,k;
		j = 1;
		switch (j) {
		case 1: k = 10;
		case 2: k = 20;
		default: k = 0;	//어떤 경우에도 실행
		}
		System.out.println(k);
	}
}
