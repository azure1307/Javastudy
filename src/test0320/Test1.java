package test0320;

import java.util.Scanner;

//char 타입에서 대문자와 소문자의 차이: 32
//(int)'1': 49, (int)'0': 48

/*
1.   한개의 문자를 입력받아 ch 변수에 저장하고
     ch 문자가 
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을  출력하기
     그외의 문자는 기타 문자 를 출력하세요 
     
[결과]
한개의 문자를 입력하세요
A : a

b : B

1 : 21

- :기타문자
*/
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한개의 문자를 입력하세요.");
		char ch = sc.next().charAt(0);
		
		if (ch>='A' && ch<='Z') {			//대문자
			System.out.println((char)(ch+32));	//소문자로 출력	
		} else if (ch>='a' && ch<='z') {	//소문자
			System.out.println((char)(ch-32));	//대문자로 출력
		} else if (ch>='0' && ch<='9') {	//숫자
			System.out.println(ch-'0'+20);		//정수형으로 변형 + 20
		} else {							//기타 문자
			System.out.println("기타 문자");
		}
	}
}