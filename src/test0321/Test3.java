package test0321;

/*
(1)+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+
 (1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+
(1+2+3+4+5+6+7+8+9+10)=220 한줄로 출력하기
*/

public class Test3 {
	public static void main(String[] args) {
		int smallSum = 0;
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=i;j++) {
				System.out.println(j);
				smallSum += j;
			}
		}
		System.out.println("(1)+(1+2)+...+(1+2+...+9+10)=" + smallSum);
	}
}
