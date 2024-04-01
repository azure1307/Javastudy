package chap4;

import java.util.Scanner;
/*
 * do while 구문 예제: 한번은 문장 실행. 문장 실행 이후 조건문 검증
 * 컴퓨터가 저장한 1~100 사이의 임의의 정수를 맞추기 
 * 시스템: 37 가정
 * [결과]
 * 1~100 사이의 숫자를 입력하세요
 * 50 -> 50보다 작은 수입니다.
 * 25 -> 25보다 큰 수입니다.
 * 40 -> 40보다 작은 수입니다.
 * 37 -> 정답입니다. 프로그램을 종료합니다.
 * 
 * 0 <= x < 1
 * 0 <= 100x < 100 				0 ~ 99.9
 * 0 <= (int)100*x < 100		0 ~ 99
 * 1 <= (int)(100*x)+1 < 101	1 ~ 100 
 */
public class LoopEx8 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);		
		int userNum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~100 사이의 숫자를 입력하세요.");
		do {
			userNum = sc.nextInt();
			if (num > userNum) {
				System.out.println(userNum + "보다 큰 수 입니다.");
			} else if (num < userNum){
				System.out.println(userNum + "보다 작은 수 입니다.");
			} else {
				System.out.println("정답입니다. 프로그램을 종료합니다.");
			}
		} while (num!=userNum);
		
	}

}
