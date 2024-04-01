package chap4;

import java.util.Scanner;
/*
 * 화면에서 문자를 입력받아서 대문자/소문자/숫자/기타문자 출력
 * 대문자: (ch >= 'A') && (ch <= 'Z')
 * 소문자: (ch >= 'a') && (ch <= 'z')
 * 숫자: (ch >= '0') && (ch <= '9')
 * 기타문자: else
 */
public class Exam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		//String scan.next(): 입력받은 데이터를 문자열(String)로 인식함
		//String.charAt(index): 문자열 String 안에서 index에 해당하는 char 데이터를 리턴
		//index: 0부터 시작
		char ch = scan.next().charAt(0); //입력받은 문자열의 첫번째 char 값을 ch 변수에 저장
		System.out.print(ch+":");
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("숫자");
		} else {
			System.out.println("기타 문자");
		}

		System.out.println((ch>='A'&&ch<='Z'?"대문자":(ch>='a'&&ch<='z'?"소문자":(ch>='0'&&ch<='9'?"숫자":"기타문자"))));
		
	}

}
