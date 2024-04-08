package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date: 날짜 표시 클래스
 * SimpleDateFormat: 형식화 클래스. java.text 패키지의 클래스
 *  패턴 문자
 *  - yyyy	: 년도 4자리
 *  - MM	: 월 2자리
 *  - dd	: 일 2자리
 *  - HH	: 시간. 0 ~ 23시 표시
 *  - hh	: 시간. 1 ~ 12시 표시
 *  - mm	: 분 2자리
 *  - ss	: 초 2자리
 *  - E		: 요일
 *  - a		: 오전/오후
 *  
 *  주요 메서드
 *  - String format(Date d)	: Date 객체값을 받아서 패턴에 맞는 형식화된 문자열로 리턴
 *  - Date parse(String fs) : 형식에 맞는 날짜 데이터 문자열을 입력받아서, Date 객체(날짜값)로 리턴
 *  						  ParseException 예외처리 필수
 */
public class DateEx1 {
	public static void main(String[] args) {
		// new Date()는 항상 현재 날짜
		Date now = new Date();
		System.out.println("현재 날짜\t\t:"+now);
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println("형식화된 현재 날짜\t:"+f.format(now));
		System.out.println();
		
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date day = null;
		try {
			day = f2.parse("2024-12-24 10:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);
		
		// 2024년 12월 24일 화요일을 day 객체를 이용해 출력
		System.out.println(new SimpleDateFormat("yyyy년 MM월 dd일 E요일").format(day));
		System.out.println();
		
		day = new Date(124,11,24,10,0,0);
		System.out.println(day);
	}
}
