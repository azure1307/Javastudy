package test0416;
/*
 * 화면에서 파일명을 입력받아서 해당 파일의 내용을 화면에 출력하기.
 * 만약 파일이 없는 경우는 '해당 파일 없음' 을 출력하기
 * 한글은 깨지지 않아야 함.
 * FileInputStream 사용하기
 * 
 * 1. 키보드로 파일명 입력받는 스트림 : InputStream은 한글깨져서 안됨 Reader
 * 2. 해당 파일 읽어오는 스트림 : FileInputStream
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test1 {
	public static void main(String[] args) throws IOException {
//		Reader in = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		while (true) {		
			System.out.println("파일명을 입력하세요.");
			String name = stdin.readLine();
//			System.out.println(name);
			if (name.equals("exit")) break;
			
			try {
				FileInputStream fis = new FileInputStream(name);
				int len = 0;
				// fis.available(): 읽을 수 있는 바이트수
//				System.out.println("fis.available():"+fis.available());
				byte[] buf = new byte[fis.available()];
				// fis.read(buf): 읽은 내용 버퍼에 저장. 실제로 읽은 바이트수 리턴
				while ((len=fis.read(buf)) != -1) {
					System.out.print(new String(buf,0,len));
				}
				fis.close();
			} catch (FileNotFoundException e) {
				System.out.println("해당 파일이 없습니다.");
			}
		}
	}
}
