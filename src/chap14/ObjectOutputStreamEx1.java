package chap14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectOutputStream 예제
 * 1. 객체를 외부로 전송할 수 있는 스트림
 * 2. 외부로 전송할 수 있는 객체는 Serializable 인터페이스를 구현해야 한다
 *    => Serializable 구현한 클래스의 객체만 외부전송이 가능 => 직렬화
 */
class Customer implements Serializable {
	private String name;
	// transient(트랜지넌): 직렬화 대상에서 제외되는 멤버변수
	private transient int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ":" + age;
	}
}
public class ObjectOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("object.ser");
		// 객체는 oos를 타고, oos는 fos를 타고 object.ser로
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("홍길동",20);
		Customer c2 = new Customer("김삿갓",30);
		System.out.println(c1 + "," + c2);
		
		// writeObject(): Serializable 인터페이스를 구현한 클래스의 객체만 가능함
		// NotSerializableException 예외 발생
		oos.writeObject(c1); 
		oos.writeObject(c2);
		oos.close();
	}
}
