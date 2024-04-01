package test0321;

import java.util.Scanner;
/*
삼각형의 높이를 입력하세요
4		i	*위치				일반화
*******	0	0,1,2,3,4,5,6 	3 ~ (2*3-1)-i
 *****	1	1,2,3,4,5		3 ~ 3+2
  ***	2	2,3,4			3-1 ~ 3+1
   *	3	3				3-0 ~ 3+0
   
3		i	*위치				일반화
*****	0	0,1,2,3,4		2-2 ~ 2+2
 ***	1	1,2,3			2-1 ~ 2+1
  *		2	2				2-0 ~ 2+0

n을 입력하면 n층 쌓아야함, 맨 윗줄은 *가 2n-1개
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("높이를 입력하세요.");
		int height = sc.nextInt(); //3
		int ceiling = 2*height-1; //5
		
		//0,0: "*" / 0,1: "*" / 0,2: "*" / 0,3: "*" / 0,4: "*"
		//1,0: " " / 1,1: "*" / 1,2: "*" / 1,3: "*" / 1,4: ""
		//2,0: " " / 2,1: " " / 2,2: "*" / 2,3: " " / 2,4: " "
		for (int i=0;i<height;i++) {
			for (int j=0;j<ceiling-i;j++) { //
				if(i<=j) {
					System.out.print("*");					
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
