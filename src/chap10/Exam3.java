package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 1. 화면에서 1에서 10 사이의 숫자를 입력받아서 숫자만큼 * 찍기
 * 2. 입력된 숫자가 1에서 10 사이가 아니면 Exception 예외를 강제 발생시킴
 *    1에서 10 사이의 숫자만 가능합니다.
 * 3. 입력된 값이 숫자가 아니면 숫자가 입력될 때까지 계속 입력받기
 *      
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				int num = sc.nextInt();

				// 입력받은 숫자가 1에서 10 사이가 아닐 경우 예외 발생
				if (num>10 || num<1) {
					throw new Exception("1에서 10 사이의 숫자만 가능합니다.");
				}
				
				// 입력받은 숫자가 1에서 10 사이일 경우 별 출력하고 while문 탈출
				for (int i=0;i<num;i++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			} catch (InputMismatchException e) {
				//숫자가 아닌 값을 입력받았을 때의 예외 처리부
				System.out.println(sc.next()+"는 숫자가 아닙니다. 숫자만 입력하세요.");
			} catch (Exception e) {
				//1에서 10 사이가 아닌 숫자를 입력받았을 때의 예외 처리부
				System.out.println(e.getMessage()); // 예외 객체 만들때 작성한 메세지 출력
			}
		}
	}
}
