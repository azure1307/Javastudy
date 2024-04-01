package test0320;

import java.util.Scanner;
/*
 * 윤년 구하기
 *  윤년은 4의 배수 중  100의 배수인경우는 평년, 100의 배수가 아닌 경우는 윤년, 
 *  단 400의 배수는 윤년. 
 *  년도를 입력받아서 윤년, 평년 인지를 출력하기.
 *  [결과]
 *  년도를 입력하세요
 *  2020
 *  윤년
 *  
 *  년도를 입력하세요
 *  2100
 *  평년
 */
//1. 반드시 4의 배수
//2. 그 중 100의 배수가 아니면 윤년
//3. 그런데 100의 배수이지만 400의 배수일 경우 윤년

//선생님) if (400의배수 || 4의배수이면서 100의배수아님) : 윤년
//		else : 평년

public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요.");
		int year = scan.nextInt();
		
		if (year%4==0) {
			if (year%100!=0) {
				System.out.println("윤년");
			} else if (year%400==0) {
				System.out.println("윤년");
			} else {
				System.out.println("평년");
			}
		} else {
			System.out.println("평년");
		}
	}
}