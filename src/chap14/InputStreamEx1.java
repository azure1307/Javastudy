package chap14;

import java.io.IOException;
import java.io.InputStream;
/*
 * TODO 1. InputStream 예제
 * 
 * 입출력 스트림 : 데이터의 이동 통로. 단방향(입력, 출력 구분)
 * 
 * 입력 스트림
 *    바이트형 : 1byte 단위로 읽기. 동영상, 이미지, 텍스트 등의 데이터 처리(비정형 데이터) -> InputStream
 *    		   하위 클래스 : FileInputStream, ObjectInputStream...
 *    문자형 : 2byte(1char) 단위로 읽기. 텍스트데이터 처리 					   -> Reader
 *    		   하위 클래스 : FileReader, StringReader...
 * 출력 스트림
 *    바이트형 : 1byte 단위로 쓰기. 동영상, 이미지, 텍스트 등의 데이터 처리(비정형 데이터) -> OutputStream
 *    		   하위 클래스 : FileOutputStream, ObjectOutputStream, PrintStream...
 *    문자형 : 2byte(1char) 단위로 쓰기. 텍스트데이터 처리						  -> Writer
 *    		   하위 클래스 : FileWriter, StringWriter, PrintWriter...
 *    
 * InputStreamReader(InputStream) : Reader의 하위 클래스
 * OutputStreamWriter(OutputStream) : Writer의 하위 클래스
 * 
 * 자바에서 제공하는 표준 스트림
 * 표준입력객체 : InputStream System.in : 키보드 입력
 * 			  키보드에서 입력된 값을 자바 어플리케이션으로 이동하는 통로
 * 표준출력객체 : PrintStream System.out : 화면 출력
 * 			  자바프로그램의 데이터를 화면으로 데이터 이동.
 * 표준오류객체 : PrintStream System.err : 
 * 
 * InputStream : 바이트형 입력 스트림의 최상위 클래스
 *    바이트형 : 1바이트 단위로 데이터를 처리
 */
public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in; // 표준입력스트림. 키보드 입력
		int data = in.read();
		// in.read() : 1바이트단위로 읽기. 한글은 2바이트짜리라 깨짐
		while (data != -1) { // ctrl+z (EOF:end of file)
//			while ((data = in.read()) != -1) { // ctrl+z (EOF:end of file)
			System.out.print((char)data+ " ");
		}
	}
}
