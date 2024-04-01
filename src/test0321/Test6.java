package test0321;


import java.util.Scanner;
/*

삼각형의 높이를 홀수로 입력하세요
5			i		j
*****		0		0,1,2,3,4		j:  i ~ (h-i), i<=j: *
 ***		1		1,2,3
  *			2		2
 ***		3		1,2,3			j: 0~i, h-i-1<=j : *	5-3-1=1
*****		4		0,1,2,3,4								5-4-1=0

n 입력할 경우 n층 쌓여야함, 첫줄과 마지막줄은 n개, 홀수...
 */
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = 0;
		System.out.println("삼각형의 높이를 홀수로 입력하세요.");
		len = sc.nextInt();
		
		for (int i=0;i<=len/2;i++) {
			for (int j=0;j<len-i;j++) {
				if (i >j) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		for (int i =len/2+1; i<len; i++) {
			for (int j =0;j<=i;j++) {
				if (j>=len-i-1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
