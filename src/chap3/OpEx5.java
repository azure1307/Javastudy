package chap3;

import java.util.Scanner;

/*
 * 삼항연산자
 * 1. (조건문)?참:거짓
 * 2. 조건연산자. 조건문으로 변경 가능함
 * 
 * 점수를 입력받아 60미만이면 불합격, 이상이면 합격을 출력
 */
public class OpEx5 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println(score + "점, " + ((score>=60)?"합격":"불합격"));
		
		// 70점 이상이면 통과, 60점 이상이면 재시, 60점 미만이면 탈락 출력
		System.out.println(score + "점, " + ((score>=70)?"통과":(score>=60)?"재시":"탈락"));
	}
}
