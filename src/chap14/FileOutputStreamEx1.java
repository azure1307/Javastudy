package chap14;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * TODO 7. FileOutputStream 예제
 * 
 * 주요 메서드
 * void write(int data) : 1 byte 출력
 * void write(byte[] buf) : buf의 내용을 출력
 * void write(byte[] buf,int start,int len) : buf의 내용을 start부터 len 길이만큼 출력
 * 
 * FileOutputStream : 파일에 데이터를 저장하는 스트림
 * 		FileNotFoundException 예외발생
 * 		out.txt : 파일이 없으면 자동 생성후 데이터 저장됨.
 * 		파일이 있으면 해당 파일에 저장
 * 
 * new FileOutputStream("out.txt") : out.txt 파일에 데이터 쓸 준비.
 * 									 출력스트림이 연결됨. 기존의 내용은 사라짐.
 * 									 마지막 출력한 내용만 남음
 * 
 * new FileOutputStream("out.txt",true) : out.txt 파일에 데이터 쓸 준비.
 * 									 출력스트림이 연결됨. 기존의 내용 남겨둠.
 * 									 기존 내용에 새로운 내용 추가됨
 */
public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 내용 저장하기");
		FileOutputStream fos = new FileOutputStream("out.txt");
		fos.write('1'); fos.write('2'); fos.write('3');
		fos.write('a'); fos.write('b'); fos.write('c');
		fos.write('가'); fos.write('나'); fos.write('다');
		fos.flush();
		fos.close();
		
		fos = new FileOutputStream("out.txt",true);
		// getBytes(): 문자열을 바이트로 바꿔줌
		byte[] buf = "\nFileOutputStream 예제입니다.\n".getBytes();
		fos.write(buf);
		fos.flush();
		fos.close();

		fos = new FileOutputStream("out.txt",true);
		fos.write(buf,5,6);
		fos.flush();
		fos.close();
	}
}
