package chap3;

import java.util.Scanner;

/*
 *  키보드에서 초를 입력받고 몇h 몇m 몇s인지 출력
 *  
 *  1. Scanner 객체 생성: Scanner scan = new Scanner(System.in);
 *  2. 입력받은 값을 저장할 변수 생성: int second = scan.nextInt();
 *  3. 시간 저장: int h = second/3600;
 *  4. 분 저장: int m = (second%3600)/60;
 *  5. 초 저장: int s = second%3600;
 *  [결과]
 *  초를 입력하세요
 *  3662
 *  1시간 1분 2초
 */
public class Exam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("초를 입력하세요.");
		int second = scan.nextInt();
		
		int h = second/3600;
		int m = (second%3600)/60;
		int s = second%60;
		System.out.println(h + "시간 " + m + "분 " + s + "초");

	}

}
