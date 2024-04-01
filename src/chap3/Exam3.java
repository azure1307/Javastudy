package chap3;

import java.util.Scanner;

/*
 * 자연수 3자리를 입력받아 100자리 미만은 버리고 출력
 * [결과]
 * 세자리 자연수를 입력하세요
 * 321
 * 300
 */
public class Exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("세자리 자연수를 입력하세요.");
		int num = scan.nextInt();
		int result = num - (num%100);
		int result2 = (num/100)*100;
		System.out.println(result);
		System.out.println(result2);
	}
}