package chap14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * TODO 10. 화면에서 한줄씩 입력받은 내용을 data2.txt 파일로 저장
 * exit 입력시 종료
 * FileWriter 이용해 프로그램 작성하기
 * [결과]
 * data2.txt에 저장할 내용을 입력하세요
 * 가나다라 1234 abcd
 * exit
 * 
 * => data2.txt 내에 '가나다라 1234 abcd' 저장됨
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("data2.txt에 저장할 내용을 입력하세요");
		FileWriter fw = new FileWriter("data2.txt");			
		while (true) {
			String str = sc.nextLine();
			if (str.equals("exit")) break;
			fw.write(str+"\n");
		}
		fw.flush();
		fw.close();
	}
}
