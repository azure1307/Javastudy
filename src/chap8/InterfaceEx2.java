package chap8;

//인터페이스끼리 상속받을 때도 다중 상속이 가능함
interface Complexerable extends Printerable, Scannerable, Faxable {

}

class Complexer2 implements Complexerable {
	int ink;
	Complexer2() {
		ink = INK;
	}
	public void print() {
		System.out.println("프린트 출력합니다. 남은 잉크량:"+ --ink);
	}
	public void scan() {
		System.out.println("이미지를 스캔합니다.");
	}
	public void send(String no) {
		System.out.println(FAX_NO+"에서"+no+"로 FAX를 보냅니다.");
	}
	public void receive(String no) {
		System.out.println(no+"에서"+FAX_NO+"로 FAX를 받았습니다.");	
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		System.out.println("기본잉크량:"+Printerable.INK);
		System.out.println("기본잉크량:"+Complexerable.INK);
		System.out.println("기본잉크량:"+Complexer.INK);
		System.out.println("기본잉크량:"+Complexer2.INK);
		
		System.out.println("FAX번호:"+Faxable.FAX_NO);
		System.out.println("FAX번호:"+Complexerable.FAX_NO);
		System.out.println("FAX번호:"+Complexer.FAX_NO);
		System.out.println("FAX번호:"+Complexer2.FAX_NO);
		
		Complexer2 com = new Complexer2();
		if (com instanceof Complexerable) {
			System.out.println("com 객체는 Complexerable 형으로 형변환이 가능함");
			Complexerable c = com;
			c.print();
			c.scan();
			c.send("02-2222-3333");
			c.receive("02-2222-3333");
//			System.out.println(c.ink); //Complexerable의 멤버가 아니라 Complexer2의 멤버라서
			System.out.println(com.ink);
		}
	}
}
