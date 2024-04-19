package chap7;
/*
 * 상속 예제: extends 예약어를 이용하여 구현
 * - 하위 클래스의 객체 생성시 상위 클래스의 객체를 먼저 만듦
 * - (자식 입장에서) 단일 상속만 가능
 * - 모든 클래스는 Object 클래스를 상속받음
 *   => 모든 클래스의 객체는 Object 객체를 포함하고 있다.
 *   => 모든 클래스의 객체는 Object 객체의 멤버를 호출할 수 있다.
 */
class Phone extends Object {
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if (power) System.out.println("전화걸기");
	}
	void receive() {
		if (power) System.out.println("전화받기");
	}
}
//SmartPhone 클래스는 Phone 클래스를 상속받음. (하위,자손,자식,Child,Sub 클래스)
//Phone 클래스는 SmartPhone 클래스에게 상속함. (상위,조상,부모,super,parent,base 클래스) 
class SmartPhone extends Phone {
	void setApp(String name) {
		System.out.println(name+"앱 설치");
	}
}
public class PhoneEx1 {
	public static void main(String[] args) {
		
//		SmartPhone sp2 = (SmartPhone) new Phone();
//		Phone p = new Object(); // Object는 power()가 없어서 p.power() 할 수 없음 
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("카카오");
	}

}
