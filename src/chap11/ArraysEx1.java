package chap11;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Arrays 클래스: 배열의 복사, 비교, 정렬 기능을 포함하고 있는 클래스
 */
public class ArraysEx1 {
	public static void main(String[] args) {
		String[] arr1 = {"홍길동", "이몽룡", "성춘향", "향단이"};
		for (String s : arr1) {
			System.out.print(s+",");
		}
		System.out.println();
		
		// arr1 배열의 모든 요소값을 김길동으로 채우기
		Arrays.fill(arr1, "김길동");
		for (String s : arr1) {
			System.out.print(s+",");
		}
		System.out.println();
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		
		// arr1 배열의 1번, 2번 인덱스의 값을 홍길동전으로 변경
		// 1,3 -> 1번부터 2번까지
		Arrays.fill(arr1, 1,3, "홍길동전");
		System.out.println(Arrays.toString(arr1));
		
		// arr1 배열의 값 정렬
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		// arr1 배열의 값 내림차순 정렬
		Arrays.sort(arr1,Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		
		// arr1 배열을 복사
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr2[1] = "이몽룡";
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		// numarr의 모든 요소값을 10으로 저장
		int[] numarr = new int[100];
		Arrays.fill(numarr, 10);
		System.out.println(Arrays.toString(numarr));
		
	}
}
