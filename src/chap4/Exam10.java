package chap4;
/*
 * 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이: 3
 			i	*의 위치			일반화
 	 *	 	0	2				2-0 ~ 2+0
 	***		1	1,2,3			2-1 ~ 2+1
   *****	2	0,1,2,3,4		2-2 ~ 2+2
   							=> 기준이 되는 수: 바닥의 갯수 / 2

   높이가 a면 바닥의 길이는 2*a-1
 */
import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요.");
		int height = sc.nextInt(); //3
		int base = 2*height-1; //5

		//0,0: " " / 0,1: " " / 0,2: "*" / 0,3: " " / 0,4: " "
		//1,0: " " / 1,1: "*" / 1,2: "*" / 1,3: "*" / 1,4: " "
		//2,0: "*" / 2,1: "*" / 2,2: "*" / 2,3: "*" / 2,4: "*"
		for (int i=0; i<height; i++) {
			for (int j=0; j<base; j++) {		//j를 (base/2 + i)까지 해도 가능
				if (j>=base/2-i && j<=base/2+i) { //j>=2 && j<=2, j>=1 && j<=3, j>=0 && j<=4
					System.out.print("*");					
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
