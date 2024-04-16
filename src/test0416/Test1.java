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
		System.out.println("파일명을 입력하세요.");
		String name = stdin.readLine();
//		System.out.println(name);
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(name);
			int data = 0;
			byte[] buf = new byte[fis.available()];
			while ((data=fis.read(buf)) != -1) {
				System.out.print(new String(buf,0,data));
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 없습니다.");
		}
		stdin.close();
	}
}
