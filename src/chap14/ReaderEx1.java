package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
/*
 * TODO 2. Reader 예제
 *   Reader : 문자형 입력 스트림. 2byte(1char) 단위로 데이터 읽기
 */
public class ReaderEx1 {
	public static void main(String[] args) throws IOException {
		/*
		 * InputStreamReader : InputStream 객체를 Reader로 변경 기능의 스트림
		 */
		// 키보드에서 데이터를 받아서 2바이트 단위로 읽음
		Reader in = new InputStreamReader(System.in);
		int data = 0;
		while ((data=in.read()) != -1) {
			System.out.print((char)data);
		} 
	}
}
