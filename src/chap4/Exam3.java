package chap4;
/*
 * 임의의 수 1~3을 선택하여 가위바위보 중 한 개 출력하기 
 * 1: 가위 / 2: 바위 / 3: 보
 */
public class Exam3 {
	public static void main(String[] args) {
		//0 <= x < 1.0
		//0 <= 3*x < 3.0
		//1 <= 3*x+1 < 4.0
		//소숫점 버릴때는 int
		int num = (int)(Math.random()*3+1);
		System.out.println(num);
		
		switch (num) {
		case 1: System.out.println("가위"); break;
		case 2: System.out.println("바위"); break;
		case 3: System.out.println("보"); break;
		}

	}

}
