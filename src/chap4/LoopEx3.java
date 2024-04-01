package chap4;

import java.util.Scanner;

/*
 * 정수로 입력받아서 각 자리수의 합을 출력하기
 */
public class LoopEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int input = scan.nextInt();
		int num = input;
		int sum = 0;
		while (num > 0) {
			//1234일 경우 10으로 나눈 나머지: 4
			//몫: 123이므로 이 값을 다시 num에
			//123일 경우 10으로 나눈 나머지: 3
			//... (반복)
			sum += num % 10;
			num /= 10;
		}
		System.out.println(num +"의 자리수 합:" + sum);

	}

}
