package test0319;

import java.util.Scanner;

//  반지름을 입력받아 원의 둘레와 면적을 소숫점이하 2자리로 출력하기
public class Test6 {
	public static void main(String[] args) {
		double pi = 3.141592;
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요");
		int radius = sc.nextInt();
		double d = (int)(2*radius*pi*100)/100.0;
		System.out.println("둘레:" + d);
		System.out.printf("%.2f\n", 2*radius*pi);
		double m = (int)(pi*radius*radius*100)/100.0;
		System.out.println("면적:" + m);
		System.out.printf("%.2f\n", radius*radius*pi);
	}
}
