package chap4;
/*
 * 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이: 3
 			i	*의 위치
 	*** 	1	1,2,3
 	 **		2	2,3
 	  *		3	3
 */
import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요.");
		int height = sc.nextInt();

		//1,1: "*" / 1,2: "*" / 1,3: "*"
		//2,1: " " / 2,2: "*" / 2,3: "*"
		//3,1: " " / 3,2: " " / 3,3: "*"
		for (int i=1; i<=height; i++) {
			for (int j=1; j<=height; j++) {
				if (i<=j) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}

}
