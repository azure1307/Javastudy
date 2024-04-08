package chap11;

import java.util.Random;

/*
 * getRand(f,t) 함수 구하기
 * f~t 또는 t~f까지 범위에 속한 숫자를 임의의 수로 return하는 함수
 * f,t 값 포함
 * 
 * getRand(1,-3) : -3 ~ 1 사이의 임의의 수 리턴
 * getRand(-1,3) : -1 ~ 3 사이의 임의의 수 리턴
 */
public class Exam6 {
	public static void main(String[] args) {
		for (int i=0;i<20;i++) {
			System.out.print(getRand(1,-3) + (i!=19?",":""));
		}
		System.out.println();
		
		for (int i=0;i<20;i++) {
			System.out.print(getRand(-1,3) + (i!=19?",":""));
		}
	}

	// 0 <= x < 1 . 
	// 0 <= 5x < 5
	// -1 <= 5x-1 < 4 : -1 ~ 3
	
	// 0 <= x < 1
	// 0 <= 5x < 5
	// -3 <= 5x-3 < 2 : -3 ~ 1
	
	// 1 ~ 7
	// 0 <= x < 1
	// 0 <= 7x < 7
	// 1 <= 7x+1 < 8 : 1 ~ 7
	private static int getRand(int f, int t) {
		int min = 0, max = 0;
		min = Math.min(f, t);
		max = Math.max(f, t);
//		if (f > t) {
//			max = f;
//			min = t;
//		} else {
//			max = t;
//			min = f;
//		}
		int d = (int)(Math.random()*(max-min+1))+min;
		return d;
//		int cha = max - min;
//		Random r = new Random();
//		return r.nextInt(cha+1)+min; //0~cha 변수까지의 임의의 수
	}
}
