package chap4;
/*
 * 1에서 100 사이의 짝수의 합 출력하기
 * for, while, do while
 */
public class Exam4 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1;i<=100;i++) {
			if (i%2==0) { //짝수만 거르는 걸 반복문의 증감문을 i+=2;로 써도 됨
				sum += i;
			}
		}
		System.out.println("합계(for): " + sum);
	
		sum = 0;
		int i = 1;
		while (i<=100) {
			if (i%2==0) {
				sum +=i;
			}
			i++;
		}
		System.out.println("합계(while): " + sum);
		
		sum = 0;
		i = 1;
		do {
			if (i%2==0) {
				sum += i;
			}
			i++;
		} while (i<=100);
		System.out.println("합계(do while): " + sum);
	}

}
