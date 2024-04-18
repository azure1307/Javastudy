package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
/*
 * [결과]
[name=홍길동, eng=55, math=90, major=경영],총점=145,평균=72.50
[name=이몽룡, eng=95, math=90, major=컴공],총점=185,평균=92.50
[name=김삿갓, eng=75, math=80, major=심리],총점=155,평균=77.50
[name=임꺽정, eng=65, math=70, major=전자],총점=135,평균=67.50
[name=성춘향, eng=55, math=80, major=컴공],총점=135,평균=67.50
수학점수총점:410
영어점수총점:345
 */
public class Exam1 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동",55,90,"경영"),
			new Student("이몽룡",95,90,"컴공"),
			new Student("김삿갓",75,80,"심리"),
			new Student("임꺽정",65,70,"전자"),
			new Student("성춘향",55,80,"컴공")
			);
	public static void main(String[] args) {
		for (Student s : list) {
			System.out.print(s+", 총점=");
			System.out.print(s.getMath()+s.getEng());
			System.out.print(", 평균=");
			System.out.printf("%.2f\n",(s.getMath()+s.getEng())/2.0);
		}
		System.out.print("수학점수총점:");
		printTot(s->s.getMath());
		System.out.print("영어점수총점:");
		printTot(s->s.getEng());
	}
	
	private static void printTot(ToIntFunction<Student> f) {
		int sum = 0;
		for (Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
}
