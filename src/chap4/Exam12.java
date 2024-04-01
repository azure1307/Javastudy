package chap4;

import java.util.Scanner;
/*
 * while 구문 예제 -> 몇 번 실행해야 할 지 모를 때! 사용
 * 컴퓨터가 저장한 1~100 사이의 임의의 정수를 맞추기 
 * 시스템: 37 가정
 * [결과]
 * 1~100 사이의 숫자를 입력하세요
 * 50 -> 50보다 작은 수입니다.
 * 25 -> 25보다 큰 수입니다.
 * 40 -> 40보다 작은 수입니다.
 * 37 -> 정답입니다. 프로그램을 종료합니다.
 * ==========
 * 입력 횟수가 5번 이하인 경우: 입력횟수 4번 => 빠르시네요.
 * 입력 횟수가 6번 이상 10번 이하인 경우: 입력횟수 7번 => 보통입니다.
 * 입력 횟수가 11번 이상인 경우: 입력횟수 14번 => 노력하세요.
 * 
 * 0 <= x < 1
 * 0 <= 100x < 100 				0 ~ 99.9
 * 0 <= (int)100*x < 100		0 ~ 99
 * 1 <= (int)(100*x)+1 < 101	1 ~ 100 
 */
public class Exam12 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		int userNum = 0;
//		System.out.println(num);		
		System.out.println("1~100 사이의 숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);

		int count = 0;
		while (true) {
			userNum = sc.nextInt();
			count++;
			if (num > userNum) {
				System.out.println(userNum + "보다 큰 수입니다.");
			} else if (num < userNum) {
				System.out.println(userNum + "보다 작은 수입니다.");
			} else {
				System.out.println("정답입니다.");
//				System.out.print("입력횟수: "+count+"=>");
//				System.out.println((count<=5?"빠르시네요":(count<=10)?"보통입니다.":"노력하세요"));
				if (count <= 5) {
					System.out.println("입력 횟수: "+count+"=> 빠르시네요.");
				} else if (count >= 6 && count <= 10) {
					System.out.println("입력 횟수: "+count+"=> 보통입니다.");					
				} else {
					System.out.println("입력 횟수: "+count+"=> 노력하세요.");					
				}
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
