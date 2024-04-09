package chap11;

import java.util.Calendar;
import java.util.Date;
/*
 * Calendar 객체에 날짜 생성하기
 */
public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar day = Calendar.getInstance();
		
		// 날짜 설정 : 2024-12-25
		day.set(2024,12-1,25); // 월:0~11
		System.out.printf("날짜:%d-%02d-%02d\n",
				day.get(Calendar.YEAR),	day.get(Calendar.MONTH)+1, day.get(Calendar.DATE));
		
		// 2024년 12월 25일의 요일 출력
		String w = " 일월화수목금토";
		// day.get(Calendar.DAY_OF_WEEK): 일요일:1 ~ 토요일:7
		System.out.printf("날짜:%d-%02d-%02d %c요일\n",
				day.get(Calendar.YEAR),	day.get(Calendar.MONTH)+1,
				day.get(Calendar.DATE), w.charAt(day.get(Calendar.DAY_OF_WEEK)));
		System.out.println();
		
		// Date 객체로 Calendar 객체 생성
		Date now = new Date();
		now.setTime(now.getTime()+1000*60*60*24);
		System.out.println(now);
		
		// day 객체로 값을 설정
		day.setTime(now);
		System.out.printf("날짜:%d-%02d-%02d %c요일\n",
				day.get(Calendar.YEAR),	day.get(Calendar.MONTH)+1,
				day.get(Calendar.DATE), w.charAt(day.get(Calendar.DAY_OF_WEEK)));
		System.out.println();
		
		// Calendar 객체로 Date 객체 생성
		Date today = new Date();
		today.setTime(day.getTimeInMillis());
		System.out.println(today);
	}
}
