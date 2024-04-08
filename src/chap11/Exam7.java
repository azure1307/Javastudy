package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아 년월의 1일과 마지막 일자의 요일을 출력하기
 * [결과]
 * 년도와 월을 입력하세요
 * 2024 4
 * 2024-04-01 월요일
 * 2024-04-30 화요일
 */
public class Exam7 {
	public static void main(String[] args) throws ParseException {
		System.out.println("년도와 월을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
//		System.out.println(year+"년도"+month+"월");
		
		// 입력받을 날짜 형식 설정
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		// 4를 입력해도 04로 들어가도록 String.format에서 %02d 형식 사용
		Date day1 = f.parse(String.format("%4d-%02d-01",year,month));
//		System.out.println(day1);
		
		// month가 12일 경우 2024.13로 들어감 -> 알아서 2024.01로 바꿔줌
		Date day2 = f.parse(String.format("%4d-%02d-01",year,month+1));
		day2.setTime(day2.getTime()-1000*60*60*24);
//		System.out.println(day2);
		
		// 출력할 날짜 형식 설정
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(f2.format(day1));
		System.out.println(f2.format(day2));
	}
}
