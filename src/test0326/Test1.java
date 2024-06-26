package test0326;
/*
 * int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
 * score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기. 6행 4열
 * score 배열의 내용을 result에 저장하고,
 * 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
 * [결과]
   90   80   70  240
   95   85   75  255
   70   80   75  225
   75   70   85  230
   70   75   80  225
  400  390  385  (전체합산)
  
 */
public class Test1 {
	public static void main(String[] args) {
		int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
		int[] rowsum = new int[score.length]; //5
		int[] colsum = new int[score[0].length]; //3
		int sum = 0;
		int total = 0;
		
		int[][] result = new int[score.length+1][score[0].length+1];
		for (int i=0;i<result.length-1;i++) {
			sum = 0;
			for (int j=0;j<result[i].length-1;j++) {
				result[i][j] = score[i][j];
				sum += result[i][j];
				colsum[j] += result[i][j];
//				result[i][score[i].length]+= score[i][j]; 행의 합
//				result[score.length][j] += score[i][j]; 열의 합
			}
			rowsum[i] = sum;
		}

		//행의 합
		for (int i=0;i<score.length;i++) { //5번반복 
			result[i][score[i].length] = rowsum[i]; 
		}
		
		//열의 합
		for (int i=0;i<score[0].length;i++) { //3번반복
			result[score.length][i] = colsum[i];
			total += colsum[i];
		}
		
		result[result.length-1][result[0].length-1] = total;
				
		//result 출력
		for (int i=0;i<result.length;i++) {
			for (int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}

	}
}
