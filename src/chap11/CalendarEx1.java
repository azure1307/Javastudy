package chap11;

import java.util.Calendar;

/*
 * Calendar 클래스 : 추상클래스 (객체화 불가) => new Calendar() 형태로 객체화가 안되는 것.
 * - static 메서드 : getInstance() 메서드로 객체를 리턴
 */
public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // 현재 일시
		
		// Calendar.getInstance()가 제공해주는 클래스명 출력
		System.out.println(now.getClass().getName()); // java.util.GregorianCalendar
		System.out.println(now);
		
		// get : 일자, 시간 관련 정보 제공 메서드
		// Calendar.특정 상수값이 지정되어 있어 해당 값으로 Calendar.get(int) 출력해도 다 나옴
		System.out.println("년도: "+now.get(Calendar.YEAR)); // 2024
//		System.out.println("년도: "+now.get(1)); // 2024
		System.out.println("월(0~11): "+now.get(Calendar.MONTH));
		System.out.println("년도 기준 몇째 주: "+now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월 기준 몇째 주: "+now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일자: "+now.get(Calendar.DATE));
		System.out.println("일자: "+now.get(Calendar.DAY_OF_MONTH));
		System.out.println("년 기준 일자: "+now.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1:일~7.토): "+now.get(Calendar.DAY_OF_WEEK));
		// 오늘은 화요일, 이번 달 들어 몇번째 화요일인지
		System.out.println("월 기준 몇 번째 요일:" +now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전(0), 오후(1) 여부:" +(now.get(Calendar.AM_PM)==0?"오전":"오후"));
		
		System.out.println("시간(0~11):"+now.get(Calendar.HOUR));
		System.out.println("시간(0~23):"+now.get(Calendar.HOUR_OF_DAY));
		System.out.println("분:"+now.get(Calendar.MINUTE));
		System.out.println("초:"+now.get(Calendar.SECOND));
		System.out.println("밀리초:"+now.get(Calendar.MILLISECOND));
		System.out.println("TimeZone:" + now.get(Calendar.ZONE_OFFSET/(1000*60*60)));
		
		// 마지막일자
		System.out.println("이번 달의 마지막 일자: "+now.getActualMaximum(Calendar.DATE));
	}
}
