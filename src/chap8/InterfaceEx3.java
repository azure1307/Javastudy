package chap8;
/*
 * 인터페이스: 단일 상속을 보완할 때 사용
 */
abstract class Animal {
	String name;
	Animal(String name) {
		this.name =name;
	}
	abstract void eat();
}

interface Flyable {
	void fly();
}
class Dove extends Animal implements Flyable {
	Dove() {
		super("비둘기");
	}
	public void fly() {
		System.out.println(name+"는 하늘을 날 수 있다.");
	}
	void eat() {
		System.out.println(name+"는 벌레를 잡아먹는다.");
	}
}
class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}
	void eat() {
		System.out.println(name+"는 나무에서 열매를 따먹는다.");
	}
}
/*
 * 1. Animal 타입의 참조변수로 두개를 배열로 설정하여 첫번째는 Dove 객체, 두번째는 원숭이 객체를 저장함
 * [결과]
 * 비둘기는 벌레를 잡아먹는다. eat()
 * 비둘기는 하늘을 날 수 있다. fly()
 * 원숭이는 나무에서 열매를 따먹는다. eat()
 * 
 * ClassCastException: 참조변수의 자료형으로 객체 참조가 안되는 경우 발생하는 예외
 */
public class InterfaceEx3 {
	public static void main(String[] args) {
		Animal[] a = new Animal[2];
		a[0] = new Dove();
		a[0].eat();
		Flyable f = (Flyable)a[0]; //Flyable과 Animal은 아무런 관계가 없기 때문에 강제형변환 해야함
		f.fly();
		
		a[1] = new Monkey();
		a[1].eat();
	}
}
