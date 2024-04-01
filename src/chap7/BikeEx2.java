package chap7;
/*
 * 다형성 예제
 * 1. 자손클래스의 객체를 부모클래스형 참조변수로 참조할 수 있다.
 * 2. 부모타입의 참조변수로 자손클래스의 객체 참조시 부모타입의 멤버들만 접근할 수 있다. 
 * 3. 오버라이딩된 메서드는 부모타입의 참조변수로 호출할 수 있다. (최종 오버라이딩된 메서드로 호출)
 * 4. 모든 클래스의 객체는 Object 객체를 포함하고 있다.
 *    => 모든 클래스의 객체는 Object 타입으로 참조할 수 있다. 
 * 5. 모든 클래스의 참조변수 타입으로 Object 멤버를 호출할 수 있다.
 */
class Bike2 {
	int wheel;
	Bike2(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("페달을 밟는다.");
	}
	void stop() {
		System.out.println("브레이크를 잡는다.");
	}
}
class EvBike2 extends Bike2 {
	boolean power;
	EvBike2() {
		super(2);
	}
	void power() {
		power = !power;
	}
	@Override
	void drive() {
		System.out.println("출발 버튼을 누른다.");
	}
}
public class BikeEx2 {
	public static void main(String[] args) {
		EvBike2 ev = new EvBike2();
		Bike2 b = null;
		ev.power();
		ev.drive();
		b = (Bike2) ev; //(Bike2) 형변환 연산자 생략가능. 부모클래스의 자료형이 더 커서
		//drive를 호출할수있는것도 부모에 drive가 있기때문에 가능한것
		//근데 b가 ev의 객체를 참조하고있기때문에 ev의 drive 실행
		b.drive(); 
		//부모는 부모의 멤버만 쓸 수 있어서 불가능
//		b.power(); 
		Object o = b;
//		power는 Object의 멤버가 아니라서 오류
//		o.power();
//		o.drive();
//		o.stop();
		System.out.println(ev.toString());
		System.out.println(b.toString());
		System.out.println(o.toString());
	}

}
