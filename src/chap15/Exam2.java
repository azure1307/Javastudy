package chap15;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/*
 * 1부터 100까지의 임의의 수 10개를 IntStream에 저장하고
 * 저장된 수의 총합, 평균, 짝수의 평균, 홀수의 평균, 짝수의 갯수, 홀수의 갯수 출력하기
 */
public class Exam2 {
	public static void main(String[] args) {
		Random r = new Random();
		r.setSeed(System.currentTimeMillis());
		IntStream is = r.ints(10000,1,101);
		int[] arr = is.toArray();
		long stime = System.currentTimeMillis();

		// 배열 이용
		int sum=0, evenSum=0, oddSum=0, evenCnt=0, oddCnt=0;
		for (int i:arr) {
			System.out.print(i+",");
			sum += i;
			if (i%2==0) {
				evenCnt++;
				evenSum += i;
			} else {
				oddCnt++;
				oddSum += i;
			}
		}
		System.out.println();
		System.out.println("총합:"+sum);
		System.out.printf("평균:%.2f\n",(double)sum/arr.length);
		System.out.printf("짝수의 평균:%.2f\n",(double)evenSum/evenCnt);
		System.out.printf("홀수의 평균:%.2f\n",(double)oddSum/oddCnt);
		System.out.println("짝수의 갯수:"+evenCnt);
		System.out.println("홀수의 갯수:"+oddCnt);
		System.out.println("배열방식:"+(System.currentTimeMillis()-stime));
		System.out.println();

		// stream 이용
		stime = System.currentTimeMillis(); // stime 현재시각으로 초기화
		System.out.println("총합:"+Arrays.stream(arr).sum());
		System.out.printf("평균:%.2f\n",Arrays.stream(arr).average().getAsDouble());
		System.out.printf("짝수의 평균:%.2f\n",Arrays.stream(arr).filter(i->i%2==0).average().getAsDouble());
		System.out.printf("홀수의 평균:%.2f\n",Arrays.stream(arr).filter(i->i%2==1).average().getAsDouble());
		System.out.println("짝수의 갯수:"+Arrays.stream(arr).filter(i->i%2==0).count());
		System.out.println("홀수의 갯수:"+Arrays.stream(arr).filter(i->i%2==1).count());
		System.out.println("stream 방식:"+(System.currentTimeMillis()-stime));
	}
}
