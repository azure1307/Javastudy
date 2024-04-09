package test0408;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * phoneNumArr 에서
 * 전화번호 일부를 입력받아 입력받은 번호를 포함하고 있는 번호를 찾기
   q를 입력받을때 까지 계속 반복하기
   
[결과]   
찾고자 하는 번호를 입력하세요(종료:q)
02
02-3456-7890
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
1234
051-1234-5678
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
q
 */

public class Test2 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"02-3456-7890","053-2456-7980","088-2346-9870",
				"013-3456-7890","051-1234-5678","02-1234-7890"};
//		String[] NumArr = new String[phoneNumArr.length];
//		String telPattern = "(0\\d{1,2})-(\\d{4})-(\\d{4})";
//		Pattern p = Pattern.compile(telPattern);
//		Matcher[] marr = new Matcher[phoneNumArr.length];
		
		// marr[0].group(1): 02, marr[0].group(2): 3456, marr[0].group(3): 7890 형태로 저장
		// 각각 String 타입
//		for (int i=0;i<phoneNumArr.length;i++) {
//			marr[i] = p.matcher(phoneNumArr[i]);
//		}

		// 출력
//		for (int i=0;i<phoneNumArr.length;i++) {
//			while (marr[i].find()) {
//				System.out.println(marr[i].group()+" : "+marr[i].group(1)+","
//			+marr[i].group(2)+","+marr[i].group(3));
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		while (true) {
			System.out.println("찾고자 하는 번호를 입력하세요.(종료:q)");
			String input = sc.nextLine().trim();
			if (input.equals("")) continue;
			else if (input.equalsIgnoreCase("Q")) break;
			String pattern = input;
			Pattern p = Pattern.compile(pattern);
			int cnt = 0;
			for (int i = 0; i < phoneNumArr.length; i++) {
				String phoneNum = phoneNumArr[i];
				
				// - 제거: - 사이의 번호 검색. 11 검색시 051-1234-.. 도 찾을 수 있도록
				String num = phoneNum.replace("-","");
				Matcher m = p.matcher(num);
				if (m.find()) {
					cnt++;
					System.out.println(phoneNum);
				}
			}
			if(cnt == 0)
		     	System.out.println(input + ":찾는 번호가 없습니다.");
		}
		
		// q 입력시 종료도 안됨
//		while (str != "q") {
//			System.out.println("찾고자 하는 번호를 입력하세요.(종료:q)");
//			str = sc.next();
//			for (int i=0;i<phoneNumArr.length;i++) {
//				for (int j=1;j<=3;j++) {
//					int cnt = 0;
					
					// 02-3456-7890이 3456을 포함한다면 NumArr에 추가
					// str이 ch가 아니라서 안되는 것 같음
//					if (marr[i].group().contains(str)) {
//						NumArr[cnt++] = marr[i].group();
//					}
//				}
//			}
			
			// NumArr 출력
//			for (String s : NumArr) {
//				System.out.println(s);
//			}
			
//		}
	}
}
