package chap5;
/*
 * command 라인에서 입력받은 숫자들의 자리수의 합 출력하기
 * java Exam4 123 456 789
 * [결과]
 * 123 456 789의 자리수 합: 45
 */
public class Exam4 {
	public static void main(String[] args) {
		if (args.length==0) {
			System.out.println("command 라인에 숫자를 입력하세요");
			return;
		}
		int sum = 0; //모든 숫자의 합을 저장할 변수
		//args: 123 456 789
		//args[0]: 123
		//args[1]: 456
		//args[2]: 789
		for (int i=0;i<args.length;i++) {
			char[] arr = args[i].toCharArray();
			for (char a:arr) {
//				System.out.print(a);
				sum += (a-'0');
			}
			System.out.print(args[i] + " ");
		}
		System.out.println("의 자리수 합: " + sum);
	}
}
