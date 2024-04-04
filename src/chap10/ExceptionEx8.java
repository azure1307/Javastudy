package chap10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 오버라이딩에서의 예외처리
 *   - 부모클래스의 메서드와 자손클래스의 메서드의 선언부분이 같아야한다
 *   - 단 접근제어자는 넓은 범위로는 가능
 *   - 단 예외처리는 좁은 범위로는 가능 => 예외클래스의 계층을 숙지하고 있어야 함
 */
class Parent {
	protected void method() throws RuntimeException {
		System.out.println("Parent 클래스의 method()");
	}
}
class Child extends Parent {
	// 부모의 접근제어자가 protected일 때 자손은 public 가능
	// 부모의 예외처리가 RuntimeException일 때 자손은 ArithmeticException 가능
	// 부모의 예외처리가 RuntimeException일 때 자손은 Exception 불가! (Exception이 더 위임)
	// 부모의 예외처리가 RuntimeException일 때 자손은 IOException 불가! (IO는 Runtime의 자손 아님)
	public void method() throws ArithmeticException,NullPointerException {
		System.out.println("Child 클래스의 method()");
		try {
			FileInputStream fi = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
	
public class ExceptionEx8 {
	public static void main(String[] args) {
		new Child().method();
	}
}
