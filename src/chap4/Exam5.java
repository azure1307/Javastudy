package chap4;

import java.util.Scanner;

/* 
 * 화면에서 숫자형 문자열을 입력받아서 각 자리수의 합을 출력하기
 * [결과]
 * 숫자를 입력하세요
 * 1234
 * 1+2+3+4 = 10
 */
public class Exam5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		String in1 = scan.next();
		//in1의 첫번째 글자: in1.charAt(0) - '0': => 숫자값1
		//in1의 두번째 글자: in1.charAt(1) - '0': => 숫자값2
		//in1의 세번째 글자: in1.charAt(2) - '0': => 숫자값3
		//자리수의 합: 숫자값1 + 숫자값2 + 숫자값3
		
		int sum = 0;
		//문자열의 길이: in1.length()
		for (int i=0;i<in1.length();i++) {
			//출력문에 삼항연산자 이용해서 마지막인 경우에만 =, 아니면 + 추가
			System.out.print(in1.charAt(i) + (i==in1.length()-1?"=":"+"));
			sum += in1.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
