package chap15;

import java.util.Arrays;
import java.util.List;

/*
 * Filter 메서드 예제
 * - Stream의 요소중 조건에 맞는 요소들로 Stream 요소 선택
 */
public class StreamEx4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
							"홍길동","김삿갓","홍길동","임꺽정","홍길동","김자바","박자바");
		
		// 1. list 요소의 중복 제거 후 출력하기
		list.stream().distinct().forEach(System.out::println);
		System.out.println();
		
		// 2. list 요소 중 성이 홍씨인 요소 후 출력하기
		list.stream().filter(s->s.startsWith("홍")).forEach(System.out::println);
		System.out.println();
		
		// 3. list 요소 중 성이 홍씨인 요소를 중복없이 출력하기
		list.stream().filter(s->s.startsWith("홍")).distinct().forEach(System.out::println);
		
		// 4. list 요소 중 이름이 자바인 요소를 중복없이 출력하기
		list.stream().filter(s->s.endsWith("길동")).distinct().forEach(System.out::println);
		
		// 5. list 요소 중 이름이 자바인 요소의 갯수를 출력하기
		System.out.println(list.stream().filter(s->s.endsWith("자바")).count());;
		
	}
}
