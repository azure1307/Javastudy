package chap5;

import java.util.Arrays;

/*
 * 로또번호 생성하기
 */
public class ArrEx3 {
	public static void main(String[] args) {
			int[] balls = new int[45];
			int[] lotto = new int[6];
			for (int i=0;i<balls.length;i++) {
				balls[i] = i+1;
			}				
			for(int b:balls) System.out.print(b+",");
			System.out.println();
			
			//balls 1000번 섞기
			for (int i=0;i<=1000;i++) {
				//swap(두 변수의 값을 바꾼다)
				int f = (int)(Math.random()*balls.length); //0~44, 40
				int t = (int)(Math.random()*balls.length); //0~44, 3
				int tmp = balls[f];		//tmp = balls[40], tmp: 41
				balls[f] = balls[t];	//balls[40] = balls[3], balls[40]:4
				balls[t] = tmp;			//balls[3] = tmp, balls[3]:41
			}
			for(int b:balls) System.out.print(b+",");
			System.out.println();
			
			//lotto 번호 저장하기: balls의 값 앞에서 6개
			for (int i=0;i<lotto.length;i++) {
				lotto[i] = balls[i];
			}
			for(int b:lotto)	System.out.print(b+",");
			System.out.println();	
			
			//lotto 번호 정렬하기: 
			for (int i=0;i<lotto.length;i++) { // lotto.length()=6
				// bubble 정렬 : 두 수를 비교해서 (2,1)이었으면 (1,2)로 자리 교체
				// length-1-i: 이미 마지막에 제일 큰 수가 있을거니까 마지막 케이스 빼고 진행
				// i,j : 0,0~4 / 1,0~3 / 2,0~2 / 3,0~1 / 4,0
				for (int j=0;j<lotto.length-1-i;j++) {  
					if (lotto[j] > lotto[j+1]) {
						int tmp = lotto[j];
						lotto[j] = lotto[j+1];
						lotto[j+1] = tmp;
					}
				}
			System.out.print(i + ":");
			for(int b:lotto)	System.out.print(b+",");
			System.out.println("");
			}
			
			System.out.println("다시 정렬 전");
			//Arrays 클래스를 이용한 정렬
			//Arrays: 배열 객체의 다양한 기능(정렬, ...) 제공
			//lotto 배열을 내용물은 같으나 정렬 전 상태로 변경
			for (int i=0;i<lotto.length;i++) {
				lotto[i] = balls[i];
			}
			for(int b:lotto)	System.out.print(b+",");
			System.out.println("\n정렬 후");
			Arrays.sort(lotto);
			for(int b:lotto)	System.out.print(b+",");
			System.out.println();
	}

}
