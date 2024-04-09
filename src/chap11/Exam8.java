package chap11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서 년월의 첫번째 날과 마지막 날의 요일을 출력
 * Calendar 객체 이용
 * [결과]
 * 년도와 월을 입력하세요
 * 2024 4
 * 2024-04-01 월요일
 * 2024-04-30 화요일
 */
public class Exam8 {
	public static void main(String[] args) {
		System.out.println("년도와 월을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
//		System.out.println("년도:"+year+",월:"+month);
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd E요일");
		Date date = new Date();
		
		Calendar day = Calendar.getInstance();
		day.set(year, month-1, 1); // 입력한 년도, 월의 첫번째 날로 설정
		date.setTime(day.getTimeInMillis());
		System.out.println(f.format(date));
		
		day.set(year, month, 1);
		date.setTime(day.getTimeInMillis()-1000*60*60*24);
		day.setTime(date);
		System.out.println(f.format(date));
		
//		int lday = day.getActualMaximum(Calendar.DATE);
//		day.set(year,month-1,lday);
//		date.setTime(day.getTimeInMillis());
//		System.out.println(f.format(date));

	}

}
