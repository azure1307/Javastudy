package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력받아 양수, 음수, 0 출력
 * [결과]
 * 숫자를 입력하세요
 * -10
 * -10: 음수
 */
public class Exam4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		System.out.println(num + ": " + ((num>0)?"양수":(num==0)?"0":"음수"));
	}
}
