package chap7;
/*
 * 자손클래스의 객체를 생성할 때, 부모클래스의 객체부터 만들고 나서 자손클래스 객체를 만든다
 * => 자손클래스의 생성자에서 부모클래스의 생성자를 호출해야함.
 *    부모클래스의 매개변수가 없는 생성자가 없다면, 자손클래스의 생성자에서 super(매개변수값)로 직접 호출해야함
 *    부모클래스의 매개변수가 없는 생성자가 있다면, 자손클래스의 생성자에서 super() 생략할 수 있음    
 */
class Phone2 {
	boolean power;
	int number;
//	Phone2(){}
	Phone2(int number) {
		this.number = number;
	}
}

//부모클래스와 자식클래스에 있는 생성자 형태가 일치해야함
class SmartPhone2 extends Phone2 { //자식클래스에 매개변수잇는상황에 부모클래스에 기본생성자만 잇으면 오류발생
	SmartPhone2(){
		super(1234); //부모클래스의 생성자를 호출
	}
	void setApp(String name) {
		System.out.println(name+"앱 설치함");
	}
}
public class PhoneEx2 {
	public static void main(String[] args) {
		SmartPhone2 sp = new SmartPhone2();
		System.out.println(sp.number);
	}

}
