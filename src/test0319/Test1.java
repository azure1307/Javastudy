package test0319;

import java.util.Scanner;

/*
 * 화면에서 금액입력받아서 500,100,50,10,1원 동전으로 바꾸기.
 * 필요한 동전의 갯수 출력하기. 전체동전은 최소 갯수로 바꾼다.
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원  : 0개
 * 10원 : 4개
 * 1원  : 1개
 * money/500 -> (money%500)/100 -> (money%100)/50 -> (money%50)/10 -> (amt%10)
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		int coin500 = money/500;
		int coin100 = (money - coin500*500)/100;
		int coin50 = (money - coin500*500 - coin100*100)/50;
		int coin10 = (money - coin500*500 - coin100*100 - coin50*50)/10;
		int coin1 = (money - coin500*500 - coin100*100 - coin50*50 - coin10*10);
		System.out.println("500원 : " + coin500 + "개");
		System.out.println("100원 : " + coin100 + "개");
		System.out.println("50원 : " + coin50 + "개");
		System.out.println("10원 : " + coin10 + "개");
		System.out.println("1원 : " + coin1 + "개");
		
	}
}
