package chap14;

import java.io.IOException;
import java.io.InputStream;
/*
 * TODO 1. InputStream 예제
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
