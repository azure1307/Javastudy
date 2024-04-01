package chap8;
/*
 * 인터페이스형을 리턴 타입으로 사용
 */
class Lazerzet implements Printerable {
	public void print() {
		System.out.println("레이저젯 프린터로 프린트함");
	}
}
class Inkzet implements Printerable {
	public void print() {
		System.out.println("잉크젯 프린터로 프린트함");
	}
}
class PrinterManager {
	//Printerable 리턴: Printerable 인터페이스의 구현클래스를 리턴
	public static Printerable getPrint(String type) {
		//입력받은 type이 INK일 경우 Inkzet 객체 생성
		if (type.equals("INK")) {
			return new Inkzet();
		//입력받은 type이 INK가 아닐 경우 Lazerzet 객체 생성
		} else {
			return new Lazerzet();
		}
	}
}
public class InterfaceEx4 {
	public static void main(String[] args) {
		Printerable p = PrinterManager.getPrint("INK");
		p.print(); //Inkzet 객체
		p = PrinterManager.getPrint("Lazer");
		p.print(); //Lazerzet 객체
	}

}
