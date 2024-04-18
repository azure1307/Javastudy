package chap15;

import java.util.Arrays;
import java.util.List;

/*
 * mapXXX 메서드 : 스트림의 요소를 변경하는 메서드
 *   mapToInt : Stream -> IntStream
 *   map	  : Stream -> Stream
 */
public class StreamEx5 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동전","춘향전","구운몽","전우치전");
		
		// 전체 글자의 갯수 출력하기
		/*
		 * list.stream(): 홍길동전,춘향전,구운몽,전우치전					 => 자료형: String
		 * mapToInt(String::length):
		 * 			String형을 입력받아 length()메서드의 결과(IntStream) => 자료형: int
		 */
		System.out.println(list.stream().mapToInt(String::length).sum());
		
		List<Student> list2 = Arrays.asList(
				new Student("홍길동",55,90,"경영"),
				new Student("이몽룡",95,90,"컴공"),
				new Student("김삿갓",75,80,"심리"),
				new Student("임꺽정",65,70,"전자"),
				new Student("성춘향",55,80,"컴공")
				); 	
		
		// 이름만 출력하기
		/*
		 * list2.stream() 			: 요소의 자료형 : Student
		 * map(Student::getName)    : 요소의 자료형 : String
		 * 
		 * Stream<Student> => Stream<String>
		 */
		list2.stream().map(Student::getName).forEach(System.out::println);
		
		// 영어점수 목록 출력하기
		// void forEach(): 최종단계 메서드
		list2.stream().map(Student::getEng).forEach(s->System.out.print(s+" "));
		// 영어점수 총합 출력하기
		System.out.println(list2.stream().mapToInt(Student::getEng).sum());;
		
		// 영어점수 목록과 합계 같이 출력하기
		System.out.println(list2.stream().
				mapToInt(s->s.getEng()).peek(s->System.out.print(s+" ")).sum());
		
		System.out.println("peek 메서드: 중간단계 메서드");
//		list2.stream().mapToInt(s->s.getEng()).peek(s->System.out.print(s+" ")); // 출력안됨
		list2.stream().mapToInt(s->s.getEng()).peek(s->System.out.print(s+" ")).sum();
		System.out.println();
		
		// 영어, 수학 점수 합계의 목록과 총합계 같이 출력하기
		System.out.println(list2.stream().mapToInt(s->s.getEng()+s.getMath())
							.peek(s->System.out.print(s+" ")).sum());
		
	}
}
