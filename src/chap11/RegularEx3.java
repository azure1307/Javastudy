package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {
	public static void main(String[] args) {
		String source = "핸드폰:010-1111-1111,집:02-123-45678"
				+"이메일:regular111@aaa.bbb,계좌번호:301-01-123456"
				+"이메일2:limehyun15@gmail.com";
		
		// ()는 그룹
		// \\d{4}에 들어갈 값이 45678이면 그냥 4567만 들고옴
		String telPattern = "(0[0-9]{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(telPattern);
		Matcher m = p.matcher(source);
		int i = 0;
		System.out.println("===전화번호===");
		// source에서 Pattern에 맞는 문자열을 검색
		while (m.find()) {
			System.out.println(++i+":"+m.group()+"=>"+m.group(1)
			+","+m.group(2)+","+m.group(3));
		}
		System.out.println();
		
		System.out.println("===이메일===");
		String emailPattern = "(\\w+)@(\\w+).(\\w+)";
		p = Pattern.compile(emailPattern);
		m = p.matcher(source);
		i = 0;
		while (m.find()) {
			System.out.println(++i+":"+m.group()+"=>"+m.group(1)
			+","+m.group(2)+","+m.group(3));
		}
		System.out.println();

		System.out.println("===계좌번호===");
		String accountPattern = "(\\d{3})-(\\d{2})-(\\d{6})";
		p = Pattern.compile(accountPattern);
		m = p.matcher(source);
		i = 0;
		while (m.find()) {
			System.out.println(++i+":"+m.group()+"=>"+m.group(1)
			+","+m.group(2)+","+m.group(3));
		}
		
	}
}
