package chap5;

import java.util.Scanner;

/*
 * 10진수를 입력받아서 8진수로 변환
 */
public class Exam2 {
	public static void main(String[] args) {
		int arr[] = new int[32];
		Scanner sc = new Scanner(System.in);
		System.out.println("8진수로 변환할 10진수 정수를 입력하세요.");
		int num = sc.nextInt();
		int divNum = num;
		int index = 0;
		
		while (divNum > 0) {
			arr[index++] = divNum%8;
			divNum /= 8;
		}
		System.out.print(num + "을 8진수로 변환하면 ");
		for (int i=index-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		System.out.println("2진수 변환:" + Integer.toBinaryString(num));
		System.out.println("8진수 변환:" + Integer.toOctalString(num));
		
//		for (int a:arr) {
//			System.out.println(a);
//		}
	}

}
