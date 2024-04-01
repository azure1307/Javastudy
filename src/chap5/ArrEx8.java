package chap5;
/*
 * 2차원 배열의 선언 생성 초기화 동시에
 */
public class ArrEx8 {
	public static void main(String[] args) {
		int[][] arr = {{10,20},{30,40},{50,60}}; //3행 2열
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+", ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("arr 배열의 행과 열의 합계 출력");
		//행은 반복문 2개로 합계 출력할 수 있지만 열은 배열을 따로 만들어야함
		//열의 합계를 저장할 배열 선언, 생성
		int[] colsum = new int[arr[0].length];
		for(int i=0;i<arr.length;i++) {
			int sum = 0;	//행의 합
			for (int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];	//행의 합
				//colsum[0]: 10 + 30 + 50
				//colsum[1]: 20 + 40 + 60
				colsum[j] += arr[i][j];
			}
			System.out.println(i+"행의 합: " + sum);
		}
		
		for(int i=0;i<colsum.length;i++) {
			System.out.println(i+"열의 합: " + colsum[i]);
		}

	}

}
