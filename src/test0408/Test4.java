package test0408;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
 * 년도를 입력받아 매월 1일과 마지막 일자의 요일을 출력하기
 * [결과]
 * 년도를 입력하세요
 * 2024
 * 2024-01-01 월요일, 2024-01-31 수요일
 * 2024-02-01 목요일, 2024-02-29 목요일
 * 2024-03-01 금요일, 2024-03-31 일요일
 * 2024-04-01 월요일, 2024-04-30 화요일
 * 2024-05-01 수요일, 2024-05-31 금요일
 * ....
 * 2024-12-01 일요일, 2024-12-31 화요일
 */
public class Test4 {
	public static void main(String[] args) throws ParseException {
		System.out.println("년도를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
//		System.out.println(year);
		
		// f = 입력받을 데이터의 형식
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		for (int i=1;i<=12;i++) {
			// 매달 1일
			Date day1 = f.parse(String.format("%4d-%02d-01",year,i));
			// 매달 마지막일 (다음달 1일 날짜값에서 하루 분량의 날짜값 빼기)
			Date day2 = f.parse(String.format("%4d-%02d-01",year,i+1));
			day2.setTime(day2.getTime()-(1000*60*60*24));
			
			// f2 = 출력할 데이터의 형식
			SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd E요일");
			System.out.print(f2.format(day1));
			System.out.print(", ");
			System.out.print(f2.format(day2));
			System.out.println();
		}
	}
}
