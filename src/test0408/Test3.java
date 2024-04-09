package test0408;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2024-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2024-01-03
2024-01-03 -2024-01-01 일자의 차이 : 2  
 */
public class Test3 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd)");
		String day1 = sc.nextLine();
//		System.out.println(date1);
		System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd)");
		String day2 = sc.next();
//		System.out.println(date2);
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = f.parse(day1);
		Date date2 = f.parse(day2);
		
		long cha = Math.abs(date2.getTime()-date1.getTime());
		System.out.println(day1+"과 "+day2+"는 "+cha/(1000*60*60*24)+"일 차이가 납니다.");
	}
}
