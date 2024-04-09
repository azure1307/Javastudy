package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월 입력시 달력 출력
 * [결과]
 * 년도와 월을 입력하세요
 * 2024 4
 * 
 * 		2024년 4월
 * 	일	월	화	수	목	금	토
 * 		1	2	3	4	5	6
 * 	7	8	9	10	11	12	13 ...
 * ...
 * 
 * 
 * 이중 반복문(일주일 반복, 그 안에 하루 증가)
 * 1. 입력한 년월의 1일로 Calendar 클래스 설정
 * 2. 첫번째 날의 요일과 월의 마지막일자 구함
 * 3. 날짜는 1일부터 마지막 일자까지 반복
 *    한줄에 7개의 값 출력시 한 줄 설정하기
 *    단 첫번째날의 요일이 되기 전까지는 공백으로 출력
 */
public class Exam9 {
	public static void main(String[] args) {
		System.out.println("년도와 월을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
//		int year = 2024;
//		int month = 4;
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		
		// 입력한 달의 첫번째 날 요일 값
		int firstYoill = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("첫 날 요일 값:"+firstYoill);
		
		// 입력한 달의 마지막 일자값
		int lday = cal.getActualMaximum(Calendar.DATE);
		System.out.println("마지막 날짜값:"+lday);
		
		System.out.println("\t"+year+"년"+month+"월");
		System.out.printf("%3s%4s%4s%3s%3s%4s%4s\n","일월화수목금토".split(""));
//		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int cnt = 0;
		
		for (int day=1,i=1;day<=lday;i++) {
			if (i < firstYoill) {
				System.out.printf("%4c",' ');
			} else {
				System.out.printf("%4d",day++);				
			}
			if (i%7==0) {
				System.out.println();
			}
		}
		System.out.println();
		
		// 2차원배열로 달력 만들기
		int[][] calarr = new int[7][7];
		// i: 날짜값
		for (int i=1;i<=lday;i++) {
			cal.set(year,month-1,i);
			int week = cal.get(Calendar.DAY_OF_WEEK); // 요일값
			int weekcnt = cal.get(Calendar.WEEK_OF_MONTH); // 월의 몇번째 주
			calarr[weekcnt-1][week-1] = i;
		}
		
		// 2차원배열로 만든 달력 출력		
		System.out.println("\t"+year+"년"+month+"월");
		System.out.printf("%3s%4s%4s%3s%3s%4s%4s\n","일월화수목금토".split(""));
		for (int i=0;i<calarr.length;i++) {
			for (int j=0;j<calarr[i].length;j++) {
				if (calarr[i][j]==0) { 
					System.out.printf("%4c",' ');
				} else {
					System.out.printf("%4d", calarr[i][j]);
				}
			}
			System.out.println();
		}
		
	}
}
