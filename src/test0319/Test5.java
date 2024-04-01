package test0319;

import java.util.Scanner;

/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=10*20 / 2
 * 소숫점 표시는 2.0 나누는걸로도 가능
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변의 길이");
		int base = sc.nextInt();
		System.out.println("높이의 길이");
		int height = sc.nextInt();
		double area = (double)(base*height/2); 
		System.out.println("넓이 : " + area);
	}
}
