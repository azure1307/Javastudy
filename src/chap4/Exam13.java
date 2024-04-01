package chap4;

import java.util.Scanner;

/*
 * 화면에서 999 숫자가 입력될때까지 숫자를 입력받아서 입력받은 수의 합을 출력하기
 * [결과]
 * 숫자들을 입력하세요(종료:999)
 * 1 5 6 9 7 999
 * 합)1+5+6+9+7=28
 */
public class Exam13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		System.out.println("숫자들을 입력하세요(종료:999)");
		
		while (true) {
			num = sc.nextInt();
			if (num==999) {
				break;
			}
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println("=> 입력받은 수의 합:" + sum);
	}
}
