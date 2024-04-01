package chap3;

public class OpEx7 {
	public static void main(String[] args) {
		//printf: format을 지정해서 출력
		//%d는 10진수 정수
		int num = 100;
		System.out.printf("%d,%d\n",num,12345);
		
		//10진수 정수, 최소 10자리 출력
		System.out.printf("%10d,%10d\n",num,12345);
		
		//10진수 정수, 최소 10자리, 왼쪽 정렬해서 출력
		System.out.printf("%-10d,%-10d\n",num,12345);

		//10진수 정수, 최소 10자리, 왼쪽 정렬해서 ,(컴마) 출력
		System.out.printf("%-,10d,%-,10d\n",num,12345);

		//10진수 정수, 최소 10자리, 빈자리는 0으로 채워서 출력
		System.out.printf("%010d,%010d\n",num,12345);
		System.out.println();
		
		//%f: 실수(부동소숫점) 형태로 출력
		System.out.printf("%f\n",12345.145);
		
		//10자리 확보, 소숫점 이하 2자리 출력
		System.out.printf("%10.2f\n",12345.145);

		//소숫점 이하 2자리 출력
		System.out.printf("%.2f\n",12345.145);
		
		//10자리 확보, 소숫점 이하 2자리, 세마디마다 ,(컴마) 출력
		System.out.printf("%,10.2f\n",12345.145);
		
		//10자리 확보, 소숫점 이하 2자리, 세마디마다 ,(컴마), 왼쪽 정렬 출력
		System.out.printf("%-,10.2f\n",12345.145);
	}
}
