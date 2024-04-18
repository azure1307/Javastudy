package chap15;

import java.util.Arrays;
import java.util.Random;

/*
 * Random 클래스로 Stream 생성
 */
public class StreamEx3 {
	public static void main(String[] args) {
		System.out.println("int 형 난수 3개로 스트림 생성");
		new Random().ints(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		
		System.out.println("0~2 사이의 int형 난수 10개로 스트림 생성");
		new Random().ints(10,1,3).forEach(s->System.out.print(s+" "));
		System.out.println();
		
		System.out.println("long 형 난수 3개로 스트림 생성");
		new Random().longs(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		
		System.out.println("0~9 사이의 long형 난수 10개로 스트림 생성");
		new Random().longs(10,0,10).forEach(s->System.out.print(s+" "));
		System.out.println();

		System.out.println("A~Z 사이의 char형 난수 3개로 스트림 생성");
		new Random().ints(3,'A','Z'+1).forEach(s->System.out.print((char)s+" "));
		System.out.println();
		
		System.out.println("double형 난수 3개로 스트림 생성");
		new Random().doubles(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		
		// 1에서 100 사이의 임의의 정수 100개를 저장한 배열 생성
		int[] arr = new Random().ints(10,1,11).toArray();
		for (int a : arr) System.out.print(a+" ");
		System.out.println();
		
		// 중복된 값을 제외한 갯수 출력하기
		// distinct() : Stream의 요소 중 중복을 제거 후 다시 Stream으로 생성
		arr = Arrays.stream(arr).distinct().toArray();
		for (int a : arr) System.out.print(a+" ");
		System.out.println();
		System.out.println("갯수:"+arr.length);
		
		// arr 배열에서 가장 큰 수 출력
		System.out.println("가장 큰 수:"+Arrays.stream(arr).max().getAsInt());
		// arr 배열에서 가장 작은 수 출력
		System.out.println("가장 작은 수:"+Arrays.stream(arr).min().getAsInt());
		// arr 배열에서 짝수 중 가장 큰 수 출력
		System.out.println("짝수 중 가장 큰 수:"
					+Arrays.stream(arr).filter(i->i%2==0).max().getAsInt());
		// arr 배열에서 홀수 중 가장 큰 수 출력
		System.out.println("홀수 중 가장 큰 수:"
					+Arrays.stream(arr).filter(i->i%2==1).max().getAsInt());
	}
}
