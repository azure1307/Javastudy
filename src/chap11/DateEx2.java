package chap11;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 날짜 설정
 */
public class DateEx2 {
	public static void main(String[] args) {
		Date now = new Date(); // 현재 일시
		// getTime(): 1970년 이후부터 현재까지의 시간을 밀리초로
		System.out.println(now.getTime());
		System.out.println(System.currentTimeMillis());
		
		Date day = new Date();
		day.setTime(now.getTime()+(1000*60*60*24*5));
		System.out.println(now);
		System.out.println(day);
		
		// 현재부터 5일 이후의 날짜와 요일 (yyyy-MM-dd) 요일 출력하기
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
	}

}
