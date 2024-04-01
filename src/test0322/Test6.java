package test0322;

import java.util.Arrays;

/*
 * 1부터 9까지의 숫자 중 중복되지 않는  숫자 3개를 선택하고, 정렬하여 출력하기.
 * 
 * 1. 1 ~ 9 저장한 배열 생성.
 * 2. 선택 숫자를 저장할 배열 선언. 3개 값
 * 3. 1 ~ 9 배열을 섞기.
 * 4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
 * 5. 선택된 배열을 정렬하여 출력
 */
public class Test6 {
	public static void main(String[] args) {
		int num[] = new int[9];
		for (int i=0;i<num.length;i++) {
			num[i] = (int)(Math.random()*9+1);			
		}		
		
		//랜덤
		for (int i=0;i<num.length;i++) {
			System.out.print(num[i]+ (i!=num.length-1?", ":""));
		}
		System.out.println();
		
		//배열 만들고 3개 값 대입
		int selectedNum[] = new int[3];
		for (int i=0;i<selectedNum.length;i++) {
			selectedNum[i] = num[i];			
		}		
		
		//출력
		for (int i=0;i<selectedNum.length;i++) {
			System.out.print(selectedNum[i]+ (i!=selectedNum.length-1?", ":""));
		}
		System.out.println();
		
		//정렬
		Arrays.sort(selectedNum);
		
		//다시 출력
		for (int i=0;i<selectedNum.length;i++) {
			System.out.print(selectedNum[i]+ (i!=selectedNum.length-1?", ":""));
		}
		
	}
}
