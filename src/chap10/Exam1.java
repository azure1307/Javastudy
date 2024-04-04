package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 화면에서 숫자를 입력받아 * 출력하기
 * 입력값이 숫자가 아닌 경우 InputMismatchException 예외 발생함
 * InputMismatchException 예외 발생시 숫자만 입력하세요 출력하기
 * [결과]
 * 숫자를 입력하세요
 * 5
 * *****
 * 
 * 숫자를 입력하세요
 * a
 * 숫자만 입력하세요
 */
public class Exam1 {
	public static void main(String[] args) {		
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			for (int i=0;i<a;i++) {
				System.out.print("*");
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
		}
	}
}
