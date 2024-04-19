package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
 * flatMap 예제
 * 
 * flatMap : Stream의 구조를 변경
 *   flatMap(Function<T, Stream<U>>) : Stream의 구조를 새로운 Stream 형태로 변경
 *   flatMapToInt(Function<T, IntStream<U>>) : Stream의 구조를 새로운 IntSteram 형태로 변경
 */
public class StreamEx7 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("자바 8 버전에","추가된 스트림을","열심히 공부하자");
		/*
		 * data : String
		 * flatMap : "자바 8 버전에 추가된 스트림을 열심히 공부하자" 를 공백으로 분리
		 * list에 들어간 String을 다시 String으로 꺼내서 list로 만들어줌..
		 */
		list1.stream().flatMap(data->Arrays.stream(data.split(" ")))
								.forEach(i -> System.out.print(i+","));
		System.out.println();
		
		List<String> list2 = Arrays.asList("10,20,30","40,50,60");
		IntStream isr = list2.stream().flatMapToInt(data-> {
			// data : String. "10,20,30"
			String[] strarr = data.split(","); // strarr:{"10","20","30",...}
			int[] intarr = new int[strarr.length];
			for (int i=0;i<strarr.length;i++) {
				intarr[i] = Integer.parseInt(strarr[i].trim());
			}
			return Arrays.stream(intarr); // 리턴값: IntStream
		});
//		isr.forEach(n->System.out.print(n+"."));
		
		// 한개씩 출력해야함
		// 숫자의 합계 출력
//		System.out.println("합계:"+isr.sum());
		// 숫자의 평균 출력
//		System.out.println("평균:"+isr.average().getAsDouble());
		// 숫자의 갯수 출력
//		System.out.println("갯수:"+isr.count());
		
	}
}
