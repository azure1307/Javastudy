package test0409;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도를 입력받아 1월부터 12까지의 달력을 출력하는 프로그램 작성하기
 * [결과]
 * 년도를 입력하세요
 * 2024
 * 
 * 1월                 2월       3월   4월
 * 일 월 화 수 목 금 토  
 * 5월                                8월
 * 9월                               12월 
 * 
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
//		System.out.println(year);
		
		Calendar cal = Calendar.getInstance();
		for (int i=0;i<12;i++) {
			cal.set(year, i, 1);			
//			System.out.printf("날짜:%4d-%02d-%02d\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
			
			int firstYoill = cal.get(Calendar.DAY_OF_WEEK);
//			System.out.println("첫 날 요일 값(1.일 ~ 7.토) : "+firstYoill);
			
			int lday = cal.getActualMaximum(Calendar.DATE);
//			System.out.println("마지막 날짜값 : "+lday);
			
			System.out.println("\t"+(i+1)+"월");
			System.out.printf("%3s%4s%4s%3s%3s%4s%4s\n","일월화수목금토".split(""));
			
			int cnt = 0;
			for (int day=1,j=1;day<=lday;j++) {
				if (j<firstYoill) {
					System.out.printf("%4c",' ');
				} else {
					System.out.printf("%4d",day++);
				}
				if (j%7==0) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
		}		
	}
}