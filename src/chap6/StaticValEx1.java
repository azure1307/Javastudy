package chap6;

class Car2 {
	String color;	//인스턴스 변수. 객체화가 되어야 변수값 할당 가능
	int num;
	int sno;
	//클래스 변수 cnt는 모든 객체가 같은 값을 공유함
	static int cnt;	//클래스 변수. 클래스 정보가 로드되면 메모리 할당이 됨
	//Car2를 참조하는 참조변수 출력시 toString() 출력!
	//객체를 문자열화 하는 메서드
	public String toString() {
		return "자동차번호:"+sno+" => "+color+","+num+",자동차생산갯수:"+cnt;
	}
}
public class StaticValEx1 {
	public static void main(String[] args) {
		//args, c1, c2는 지역변수. 메인메서드 안에서만 사용 가능
		Car2 c1 = new Car2();
		c1.color = "White";
		c1.num = 1234;
		c1.sno = ++Car2.cnt;
		//참조변수 출력시 toString() 메서드 호출
		System.out.println(c1);
		
		Car2 c2 = new Car2();
		c2.color = "Black";
		c2.num = 5678;
		c2.sno = ++Car2.cnt;
		System.out.println(c1);
		System.out.println(c2);
		
		for (int i=0;i<10;i++) {
			System.out.println(i);
		}
//		System.out.println(i); //i는 for 문 안에서 선언되었기 때문에 밖에서는 사용할 수 x
	}
}
