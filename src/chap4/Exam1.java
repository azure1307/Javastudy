package chap4;

import java.util.Scanner;
/*
 * 정수를 입력받아서
 * 1. 양수/음수/0 출력
 * 2. 짝수/홀수 출력
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		System.out.print(num + ":");
		if (num > 0) {
			System.out.print("양수");
		} else if (num < 0) {
			System.out.print("음수");
		} else {
			System.out.print("0");
		}
		System.out.println();
		System.out.println(num>0?"양수":(num<0?"음수":"0"));
		
		System.out.print(num + ":");
		if (num%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		System.out.println((num%2==0)?"짝수":"홀수");

	}

}
