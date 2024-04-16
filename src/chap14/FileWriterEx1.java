package chap14;

import java.io.FileWriter;
import java.io.IOException;

/*
 * TODO 8. FileWriter 예제
 * 
 * 주요 메서드
 * void write(int data) : 1 byte 출력
 * void write(char[] buf) : buf의 내용을 출력
 * void write(char[] buf,int start,int len) : buf의 내용을 start부터 len 길이만큼 출력
 * void write(String str) : str 내용을 출력
 * 
 * new FileWriter("out2.txt") 기존 내용 사라지고, 최근 내용만 남음
 * new FileWriter("out2.txt", true) 기존 내용에 최근 내용이 추가
 */
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out2.txt 파일에 내용 저장하기");
		FileWriter fw = new FileWriter("out2.txt",true);
		fw.write('1'); fw.write('2'); fw.write('3');
		fw.write('a'); fw.write('b'); fw.write('c');
		fw.write('가'); fw.write('나'); fw.write('다');
		char[] buf = "\nFileWriter 예제입니다.".toCharArray();
		fw.write(buf);
		fw.write(buf,5,6);
		fw.write("\nFileWriter 예제입니다. String 객체를 직접 출력 가능합니다.\n");
		fw.flush();
		fw.close();
	}
}
