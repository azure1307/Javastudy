package chap3;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int x = 10;
		//++ 연산자를 사용하여 x = 10의 결과가 나오도록 코딩하기
		System.out.println("x = " + x++);
	
		//-- 연산자를 사용하여 x = 10의 결과가 나오도록 코딩하기
		System.out.println("x = " + --x);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		x = scan.nextInt(); //입력받은 값을 x에 대입
		System.out.println("x = " + x++);
		System.out.println("x = " + --x);
		
	}
}
