package chap4;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이: 3
 			i	*위치
 	*		1	1
 	**		2	1,2
 	***		3	1,2,3
 				i>=j인 경우에만 * 출력
 */
public class Exam6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요.");
		int height = sc.nextInt();
		
		//i=1일 때 * 찍고 한 줄 띄고 끝
		//i=2일 때 ** 찍고 한 줄 띄고 끝
		//i=3일 때 *** 찍고 한 줄 띄고 종료
		for (int i=1; i<=height; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i=0; i<height; i++) {
			for (int j=0; j<height; j++) {
				if (i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
