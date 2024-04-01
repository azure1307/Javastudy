package chap8;
/*
 * 인터페이스 
 * 1. 멤버: 상수, 추상메서드, default 메서드, static 메서드
 * 2. 접근제한자는 무조건 public
 * 3. 객체 생성 불가 => 구현 클래스(인터페이스를 구현)를 통해 객체 생성해야함
 * 4. 클래스와 인터페이스는 구현으로 표현함 => implements
 *    => 다중 구현 가능함
 * 5. 인터페이스끼리도 상속할 수 있음 => 다중 상속 가능
 * 6. 참조 자료형임
 * 
 * 인터페이스 멤버
 * - 상수				: [public static final] int NUM = 100;
 * - 추상메서드			: [public abstract] int method(int a);
 * (JDK 8 이후 추가됨) 구현부가 있어도 됨
 * - default 메서드	: default int method(...) {  } 	=> 인스턴스 멤버
 * - static 메서드	: static int method(...) {  } 	=> 클래스멤버
 */
interface Printerable {
	//public final static int 100;
	int INK = 100; //상수지만 final 생략됨
	//public abstract void print();
	void print(); //추상메서드지만 abstract 생략됨
	// 반드시 구현클래스에서 오버라이딩해야함
}
interface Scannerable {
	void scan();
}
interface Faxable {
	String FAX_NO = "02-1111-2222";
	void send(String no);
	void receive(String no);
}
//다중 구현 클래스
class Complexer implements Printerable, Scannerable, Faxable {
	int ink;
	Complexer() {
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
public class InterfaceEx1 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
//		Faxable.FAX_NO = "02-2222-3333"; //상수. 변경할 수 없음
//		Printerable.INK = 200; //상수. 변경할 수 없음
		System.out.println("Faxable.FAX_NO="+Faxable.FAX_NO); //static 상수
		System.out.println("Printerable.INK="+Printerable.INK); //static 상수
		System.out.println();
		System.out.println("Complexer.FAX_NO="+Complexer.FAX_NO); //static 상수
		System.out.println("Complexer.INK="+Complexer.INK); //static 상수
		
		com.print();
		com.scan();
		com.send("02-2222-3333");
		com.receive("02-2222-3333");
		System.out.println();
		
		if (com instanceof Printerable) {
			System.out.println("com 객체는 Printerable 형으로 형변환 가능함");
			Printerable p = com; //인터페이스타입이 더 큰 자료형이라 형변환연산자(Printerable) 생략
			p.print();
//			p.scan(); //scan()은 Scannerable의 메서드. Printerable에는 없음
//			p.send("02-2222-3333"); //send()는 Faxable의 메서드.
//			p.receive("02-2222-3333"); //send()는 Faxable의 메서드.
		} 
		System.out.println();
		if (com instanceof Scannerable) {
			System.out.println("com 객체는 Scannerable 형으로 형변환 가능함");
			Scannerable s = com;
//			s.print();
			s.scan();
//			s.send("02-2222-3333");
//			s.receive("02-2222-3333");
		}
		System.out.println();
		if (com instanceof Faxable) {
			System.out.println("com 객체는 Faxable 형으로 형변환 가능함");
			Faxable f = com;
//			f.print();
//			f.scan();
			f.send("02-2222-3333");
			f.receive("02-2222-3333");
			System.out.println("남은 잉크량:"+com.ink);
//			System.out.println("남은 잉크량:"+f.ink); //ink는 Complexr의 상수
		}
		System.out.println();
	}
}
