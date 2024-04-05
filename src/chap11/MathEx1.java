package chap11;
/*
 * Math 클래스
 * - 수치 계산 관련된 메서드 멤버로 가짐. 상수(원주율 PI, 자연로그값 E)
 * - final 클래스
 * - 생성자의 접근제한자가 private => 객체 생성 불가
 *   => 모든 멤버가 static
 */
public class MathEx1 {
	public static void main(String[] args) {
		// abs: 절대값
		System.out.println("Math.abs(5) : "+Math.abs(5));	//5
		System.out.println("Math.abs(-5.0) : "+Math.abs(-5.0));	//5.0
		System.out.println();
		
		// ceil, floor, rint: 근사정수(현재 숫자와 가장 가까운 정수)
		// ceil: 나보다 큰 근사정수
		System.out.println("Math.ceil(5.4) : "+Math.ceil(5.4)); //6.0
		System.out.println("Math.ceil(-5.4) : "+Math.ceil(-5.4)); //-5.0
		// floor: 나보다 작은 근사정수
		System.out.println("Math.floor(5.4) : "+Math.floor(5.4)); //5.0
		System.out.println("Math.floor(-5.4) : "+Math.floor(-5.4)); //-6.0
		// rint: 크든 작든 제일 가까운 근사정수
		System.out.println("Math.rint(5.4) : "+Math.rint(5.4)); //5.0
		System.out.println("Math.rint(-5.4) : "+Math.rint(-5.4)); //-5.0
		System.out.println();
		
		// max(), min(): 최대, 최소
		System.out.println("Math.max(5.0, 4) : "+Math.max(5.0, 4)); //5.0
		System.out.println("Math.min(5.0, 4) : "+Math.min(5.0, 4)); //4.0
		System.out.println();
		
		// round(): 반올림
		System.out.println("Math.round(5.4) : "+Math.round(5.4)); //5
		System.out.println("Math.round(5.5) : "+Math.round(5.5)); //6
		System.out.println();
		
		// random(): 난수, 임의의 수. 0 <= x < 1.0
		System.out.println("Math.random() : "+Math.random());
		System.out.println();
		
		// sin(), cos(), tan(): 삼각함수. 라디안 단위
		System.out.println("Math.PI : "+Math.PI);
		System.out.println("Math.E : "+Math.E);
		System.out.println("Math.sin(Math.PI/2) : "+Math.sin(Math.PI/2)); // sin(90)
		System.out.println("Math.cos(Math.PI/2) : "+Math.cos(Math.PI/2)); // cos(90)
		System.out.println("Math.tan(Math.PI/4) : "+Math.tan(Math.PI/4)); // tan(45)
		System.out.println();
		
		// 라디안 -> 도
		System.out.println("Math.toDegrees(Math.PI) : "+Math.toDegrees(Math.PI));
		// 도 -> 라디안
		System.out.println("Math.toRadians(180) : "+Math.toRadians(180));
		// sin(90)
		System.out.println("Math.sin(90도) : "+Math.sin(Math.toRadians(90)));
		System.out.println();
		
		// log 함수
		System.out.println("Math.log(Math.E) : "+Math.log(Math.E));
		
		// 제곱근
		System.out.println("Math.sqrt(25) : "+Math.sqrt(25));
		// 제곱
		System.out.println("Math.pow(5,3) : "+Math.pow(5,3)); // 5*5*5
		
	}
}
