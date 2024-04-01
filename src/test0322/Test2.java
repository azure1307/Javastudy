package test0322;

import java.util.Scanner;

/*
1.  다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.
  [결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
  [결과]
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자만 입력하세요.");
		String value = sc.next();
		
		//이 밑으로 반복문. 0에서 value.length()까지
		//123 입력시 0에서 2까지... <value.length()
		//반복문 안에 들어갈 내용: value.charAt(i)-'0' 한 게 0과 9 사이가 아닐경우 숫자가 아닙니다.하고 break;
		//std = value.charAt(i)-'0'
		//std가 0부터 9 사이여야 들어온값이 숫자임.. 
		//다 0과 9 사이일 경우 그대로 빠져나와서 숫자입니다.
		
		for (int i=0;i<value.length();i++) {// 123입력시 0,1,2까지 세번도는
			int std = value.charAt(i)-'0';
			if (std<0 || std>10) {
//				System.out.println("std 값이"+std+", 숫자 아닌거 확인");
				System.out.println(value+"는 숫자가 아닙니다.");
				break;
			} 
			if (i==value.length()-1) {
				System.out.println(value+"는 숫자입니다.");
				break;
			}
		}
		
//		System.out.println(value);

		//str을 toCharArray한 char 집합 arr 생성
		//숫자인지 판별하는 boolean값 isNumber 생성
		//for each문으로 ch < '0' || ch > '9' 인 경우 isNumber false로 만들고 break;
	}
}
