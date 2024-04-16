package chap14;

import java.io.FileReader;
import java.io.IOException;

/*
 * TODO 6. FileReader 예제
 * 
 * 주요 메서드
 * int read() : 파일에서 1char 단위로 읽어서 데이터 리턴
 * int read(char[] buf) : 파일에서 데이터 읽어 buf 저장. 실제 읽은 char 수 리턴
 * int read(char[] buf,int start,int len)
 * 		: 파일에서 len 크기만큼 데이터 읽어 buf의 start 인덱스부터 저장.
 * 		실제 읽은 char 수 리턴
 */
public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/chap14/InputStreamEx1.java");
		int data = 0;
		System.out.println("===== read() 메서드로 읽기");
		
		while ((data=fr.read()) != -1) {
			System.out.print((char)data);
		}
		fr.close();
		
		fr = new FileReader("src/chap14/InputStreamEx1.java");
		char[] buf = new char[8096];
		System.out.println("===== read(char[]) 메서드로 읽기");
		
		while ((data=fr.read(buf)) != -1) {
			System.out.print(new String(buf,0,data));
		}
		fr.close();
		
		fr = new FileReader("src/chap14/InputStreamEx1.java");
		buf = new char[8096];
		System.out.println("===== read(char[],int,int) 메서드로 읽기");
		
		while ((data=fr.read(buf,0,buf.length)) != -1) {
			System.out.print(new String(buf,0,data));
		}
		fr.close();
	}
}
