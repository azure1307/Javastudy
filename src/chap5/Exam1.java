package chap5;

import java.util.Scanner;

/*
 * int값 5개를 저장할 수 있는 배열을 생성하고
 * 화면에서 5개의 값을 입력받아
 * 입력받은 수의 합계, 평균, 최댓값, 최솟값, 최댓값의 인덱스, 최솟값의 인덱스 출력하기
 * [결과]
 * 5개의 정수를 입력하세요
 * 1 2 3 4 5
 * 합계: 15 / 평균: 3 / 최댓값: 5 / 최솟값: 1 / 최댓값의 인덱스: 4 / 최솟값의 인덱스: 0 
 */
public class Exam1 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요.");
		int sum = 0, maxIndex = 0, minIndex = 0;
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];			
			//이렇게 간단하게 할수있다니...
			if (arr[maxIndex] < arr[i])	maxIndex=i; 
			if (arr[minIndex] > arr[i])	minIndex=i; 
		}
		double avg = (double)sum/arr.length;
		System.out.print("합계: " + sum + " / 평균: " + avg);		
		System.out.print(" / 최댓값: " + arr[maxIndex] + " / 최댓값의 인덱스: " + maxIndex);		
		System.out.print(" / 최솟값: " + arr[minIndex] + " / 최솟값의 인덱스: " + minIndex);
		
	}

}
