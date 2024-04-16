package chap14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * TODO 9. 화면에서 입력받은 내용을 data.txt 파일로 저장
 * exit 입력시 종료
 * FileOutputStream 이용하고, 한글도 입력 가능하도록 프로그램 작성하기
 * [결과]
 * data.txt에 저장할 내용을 입력하세요
 * 가나다라 1234 abcd exit
 * 
 * => data.txt 내에 '가나다라 1234 abcd' 저장됨
 */
public class Exam1 {
	public static void main(String[] args) throws IOException {
		System.out.println("data.txt에 저장할 내용을 입력하세요.(종료:exit)");
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("data.txt");
		
		while (true) {
//			String str = sc.next();
			// Scanner.nextLine(): 한줄씩 입력
			String str = sc.nextLine();
			if (str.equals("exit")) break;
			// FileOutputStream.write(byte[]) : String.getBytes()를 매개변수로 사용
			// String.getBytes()이므로 띄어쓰기 출력하고싶으면 앞에서 추가
			fos.write((str + "\n").getBytes());
		}
		fos.flush();
		fos.close();
		 
	}
}
