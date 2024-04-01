package test0321;

import java.util.Scanner;
/*
 * [결과]
삼각형의 높이를 입력하세요
3						i	숫자위치		일반화
		9				0	2			2-0 ~ 2+0
	8	7	6			1	1,2,3		2-1 ~ 2+1
5	4	3	2	1		2	0,1,2,3,4	2-2 ~ 2+2

n 넣을경우 맨위는 n의제곱, 첫 줄부터 1, 3, 5, ... 식으로 쌓아야함
*/
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요.");
		int height = sc.nextInt(); //3
		int base = 2*height-1; //5
		int data = 0; //첫번째 숫자 저장
		for (int i=base;i>=1;i-=2) {
			data+=i;
		}
		
		for (int i=0;i<height;i++) {
			for (int j=0; j<base; j++) {
				if (j>=(base/2-i) && j<=(base/2+i)) {
					//9, 8, 7, ... 첫번째 숫자를 저장해서 하나씩 빼줌
//					System.out.print(data-- + "\t");					
					System.out.printf("%5d",data--);					
				} else {
//					System.out.print("\t");
					//%c: 문자출력, %d:10진 정수, %f:실수값, %s:문자열
					System.out.printf("%5c",' ');
				}
			}
			System.out.println("");
		}
	}
}