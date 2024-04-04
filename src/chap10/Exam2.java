package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 숫자를 입력받아 숫자만큼 * 출력
 * 숫자아닌 경우 숫자만 입력하세요 메세지 출력 후 다시 입력받기
 * 숫자가 입력될때까지 계속 입력받기
 * catch 블럭: scan.next() 추가
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		// 숫자가 입력될때까지 계속 입력받기
		// 일단 무한루프 조건을 주고, 정상적인 입력이 들어왔을 때 break; 줘서 탈출
		while (true) {			
			try {
				// nextInt(): 입력받은 값을 정수로 처리
				num = sc.nextInt();
				for (int i=0;i<num;i++) {				
					System.out.print("*");
				}
				System.out.println();
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				// next(): 입력받은 값을 문자열로 처리
				// 만약 sc.next()가 없다면 다시 sc.nextInt()로 올라가 Exception 발생
				// 그럼 숫자만 입력하세요 출력 -> 다시 올라가 Exception -> 다시 출력 -> ... -> 무한반복
				sc.next();
			}
		}
	}
}
