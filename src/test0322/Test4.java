package test0322;

import java.util.Arrays;

/* 
  1부터 100까지 임의의 수 10개를  배열에 저장하고, 정렬하여 출력하기
    1. 배열 선언, 생성.
    2. 임의의 수를 10개 배열에 저장
    3. 정렬
    4. 출력
 */
public class Test4 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
//		for (int i = 0; i < num.length; i++) {
//			boolean sorted = true;
//			for (int j = 0; j < num.length - 1 - i; j++) {
//				//swap 알고리즘. 
//				if (num[j] > num[j + 1]) { 
//					int temp = num[j];
//					num[j] = num[j + 1];
//					num[j + 1] = temp;
//					sorted = false; 
//				}
//			}
//			if(sorted) break;	//이미 정렬된 배열일 경우 반복하지말고 탈출
//			for(int n : num)
//				System.out.print(n+" ");
//			System.out.println();
//		}
		
		Arrays.sort(arr);
		
		System.out.println("정렬 후");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
