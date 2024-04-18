package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스
 * Function 인터페이스의 하위 인터페이스
 *   매개변수, 리턴값 모두 존재 => 매개변수의 자료형, 리턴값의 자료형이 같다
 *   
 *   IntBinaryOperator : int형 매개변수, int 리턴값
 *   					 int applyAsInt(int, int) 
 */
public class LambdaEx5 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동",90,80,"경영"),
			new Student("김삿갓",95,70,"컴공"),
			new Student("이몽룡",85,75,"통계"));
	public static void main(String[] args) {
		System.out.print("최대 수학 점수:");
		System.out.println(maxOrMinMath((a,b)->(a>=b)?a:b));
		System.out.print("최소 수학 점수:");
		System.out.println(maxOrMinMath((a,b)->(a<=b)?a:b));
		
		System.out.print("최대 영어 점수:");
		System.out.println(maxOrMinEng((a,b)->(a>=b)?a:b));
		System.out.print("최소 영어 점수:");
		System.out.println(maxOrMinEng((a,b)->(a<=b)?a:b));
		
		System.out.print("최대 평균 점수:");
		System.out.println(maxOrMinAvg((a,b)->(a>=b)?a:b));
		System.out.print("최소 평균 점수:");
		System.out.println(maxOrMinAvg((a,b)->(a<=b)?a:b));
		
		System.out.print("최대 합계 점수:");
		System.out.println(maxOrMinTot((a,b)->(a>=b)?a:b));
		System.out.print("최소 합계 점수:");
		System.out.println(maxOrMinTot((a,b)->(a<=b)?a:b));
	}
	private static int maxOrMinTot(IntBinaryOperator op) {
		// 첫번째사람 점수 합계 저장
		int result = list.get(0).getEng()+list.get(0).getMath();
		for (Student s : list) {
			// result랑 학생들마다 점수 합계를 비교
			result = op.applyAsInt(result, s.getEng()+s.getMath());
		}
		return result;
	}
	
	private static double maxOrMinAvg(DoubleBinaryOperator op) {
		// 첫번째사람 평균점수 저장
		double result = (list.get(0).getEng()+list.get(0).getMath())/2.0;
		for (Student s : list) {
			// result랑 학생들마다 평균점수를 비교
			result = op.applyAsDouble(result, (s.getEng()+s.getMath())/2.0);
		}
		return result;
	}
	
	private static int maxOrMinEng(IntBinaryOperator op) {
		// 첫번째사람 영어점수 저장
		int result = list.get(0).getEng();
		for (Student s : list) {
			// result랑 학생들마다 수학점수를 비교
			result = op.applyAsInt(result, s.getEng());
		}
		return result;
	}
	
	private static int maxOrMinMath(IntBinaryOperator op) {
		// 첫번째사람 수학점수 저장
		int result = list.get(0).getMath();
		for (Student s : list) {
			// result랑 학생들마다 수학점수를 비교
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}
}
