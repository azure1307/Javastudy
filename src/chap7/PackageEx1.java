package chap7;
/*
 * package 예제
 * package
 * - 클래스, 인터페이스들의 모임 => 주로 기능이 비슷한 클래스, 인터페이스들의 모임
 * - 클래스명은 패키지명을 포함한다.
 * - 패키지의 설정은 파일마다 한번만, 코드 맨 첫 줄에 구현해야 함
 *   => 같은 파일에 존재하는 클래스는 같은 패키지에 속한 클래스임
 *   => 패키지가 다른 클래스는 다른 파일에 구현해야 함
 *   
 * import 예약어
 *   - 다른 패키지의 클래스를 불러올 때, import 기능을 사용하면 패키지명 생략하고 클래스명만 쓸 수 있음
 *   
 * 클래스의 패키지명을 생략할 수 있는 경우
 * 1. 같은 패키지에 속한 클래스를 사용할 때
 * 2. java.lang 패키지에 속한 클래스를 사용할 때
 * 3. import 구문에서 선언된 클래스를 사용할 때
 *    => 패키지명.클래스명 => 해당 클래스만 생략가능
 *    => 패키지명.*     => 패키지에 속한 모든 클래스 생략 가능
 */
//import java.util.Date;
//import java.util.Scanner;
import java.util.*; //java.util에 속한 클래스 다 불러오기

public class PackageEx1 { //chap7.PackageEx1
	public static void main(String[] args) {
		//java.lang에 속한 클래스들은 패키지명 생략 가능
		//ex. String (java.lang.String)
		
//		java.util.Date now = new java.util.Date();
		Date now = new Date(); // import 구문 설정으로 패키지명 생략 가능
		A a = new A(); // 같은 패키지에 속한 클래스는 패키지명 생략 가능
		Scanner scan = new Scanner(System.in);
		
		Pack1 p = new Pack1();
		p.method();
//		p.methodp(); //methodp의 접근제어자가 private(같클만 가능)이므로 접근 불가
		p.method2(); //원래는 안되는 methodp를 method2 거쳐서 가능
	}
}

//package a7; //파일마다 한번만, 코드 맨 첫 줄에
class A {} //chap7.A
class Pack1 {
	private void methodp() { // private 접근제어자
		System.out.println("chap1.Pack1.methodp 메서드");
	}
	void method() { //default 접근제어자 
		System.out.println("chap1.Pack1.method 메서드");
	}
	void method2() {
		methodp();
	}
}
