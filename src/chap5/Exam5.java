package chap5;
/*
 * arr 배열의 행과 열의 합 출력
 * (1,2)
 * (1,2,3,4,5)
 * (10,20)
 * (100)
 */
public class Exam5 {
	public static void main(String[] args) {
		int[][] arr = {{1,2},{1,2,3,4,5},{10,20},{100}};
		
		//가장 긴 열의 길이를 찾아서 저장하는 maxcol 변수 생성
		int maxcol = 0;
		for (int i=0;i<arr.length;i++) { //5번 반복
			if (maxcol < arr[i].length) {
				maxcol = arr[i].length;
			}
		}
		//최종 maxcol은 2열의 길이 5개가 가장 많으므로 5
		
		int sum = 0;
		int[] colsum = new int[maxcol];
		
		//i행 j열인 2차원 배열
		for (int i=0;i<arr.length;i++) {
			sum = 0;
			for (int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
				colsum[j] += arr[i][j];
			}
			System.out.println(i+"행의 합: " + sum);
		}
		System.out.println();
		
		for (int i=0;i<colsum.length;i++) {
			System.out.println(i+"열의 합: " + colsum[i]);
		}
	}
}
