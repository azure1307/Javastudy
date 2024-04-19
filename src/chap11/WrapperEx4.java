package chap11;
/*
 * switch 구문에서 사용되는 조건값
 * switch (조건값)
 * 
 * 시험에 나왔던 부분
 * 조건값으로 사용할 수 있는 자료형: byte, short, int, char, String
 * 		Wrapper 클래스도 가능 : Byte, Short, Int, Character
 * 조건값으로 사용할 수 없는 자료형: boolean, long, float, double
 */
public class WrapperEx4 {
	public static void main(String[] args) {
		int num = 5;
		switch(num) {
			case 1: System.out.println("1"); break;
			default: System.out.println(num);
		}
	}
}
