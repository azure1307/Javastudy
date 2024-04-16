package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * TODO 13. PrintStream 예제
 * 
 * PrintStream : 보조스트림 => 출력기능 강화
 * 1. write() 기능 강화
 *    - 모든 자료형을 출력 가능하도록 기능 강화 => println, print, printf
 *    - IOException 예외처리 필수 => 예외 처리 생략 하도록 기능 추가
 * 2. OutputStream 하위 클래스
 * 3. 표준출력(System.out), 표준오류(System.err) 객체의 자료형
 * 4. 객체 생성시 OutputStream 객체를 매개변수로 입력받아 객체 생성함
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws FileNotFoundException  {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.write(65);
		ps.write(1234);
		ps.flush();
		ps.close();
	}
}
