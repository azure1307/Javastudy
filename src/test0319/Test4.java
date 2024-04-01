package test0319;

import java.util.Scanner;
/*
 *  화면에서 두 수를 입력받아서 더 큰 수를 출력하기 
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println("입력한 수: " + n1+","+n2);
		System.out.println("더 큰 수: " + (n1>n2?n1:(n1<n2)?n2:"두 수는 같음"));
	}
}

