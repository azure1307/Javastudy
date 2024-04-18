package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동",55,90,"경영"),
			new Student("이몽룡",95,90,"컴공"),
			new Student("김삿갓",75,80,"심리"),
			new Student("임꺽정",65,70,"전자"),
			new Student("성춘향",55,80,"컴공")
			);
	public static void main(String[] args) {
		// list.stream() : Stream 객체로 변경
		Stream<Student> st = list.stream();
		// forEach : 내부반복자. 내부에서만, 객체 하나당만 반복해서 s는 Student 타입
//		int mathSum = 0;
		st.forEach(s->{
			System.out.print(s); // Student.toString() 호출
			int sum = s.getEng() + s.getMath();
			double avg = sum/2.0;
			System.out.printf(",총점:%3d,평균:%.2f\n",sum,avg);
			// 내부 클래스에서 사용하는 변수는 상수화되어야한다
//			mathSum += s.getMath(); 
		});
		
		// st는 내부반복자라 forEach로 한번 쭉 반복하고나선 다시 쓸 수 없다
//		System.out.println("수학점수총점:"+ st.mapToInt(s -> s.getMath()).sum());
		
		// mapToInt : Stream 형식을 IntStream으로 변경
		// mapToInt(s -> s.getMath()) : list에 있는 s에서 수학점수만 모아서 IntStream으로 변경
		// sum() : IntStream 내부 요소들의 합
		System.out.println("수학점수총점:"
						+list.stream().mapToInt(s -> s.getMath()).sum());
		System.out.println("영어점수총점:"
						+list.stream().mapToInt(s -> s.getEng()).sum());
		// OptionalDouble.getAsDouble(): 값 가져오기
		System.out.println("수학점수평균:"
						+list.stream().mapToInt(s -> s.getMath()).average().getAsDouble());
		System.out.println("영어점수평균:"
						+list.stream().mapToInt(s -> s.getEng()).average().getAsDouble());
		// long Stream.count(): int 아니고 long 타입 주의 
		System.out.println("인원수:"+list.stream().count());
	}
}
