package test0322;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt(); 	//121
		int tmp = num;
		int result = 0;	//입력받은 num을 뒤집은 수
		
		//대칭수인 경우)
		//result = 0 > 1 > 12 > 121
		//tmp = 121 > 12 > 1 > 0
		
		//대칭수가 아닌 경우)
		//result = 0 > 3 > 32 > 321
		//tmp = 123 > 12 > 1 > 0
		while (tmp!= 0) {	//1
			result *= 10; 	//320
			result += tmp%10; //321
			tmp /= 10;
		}
		
		//num이 123인 경우 result는 321이 나오므로 서로 달라서 대칭수아님 출력
		if (num == result) {
			System.out.println(num+":대칭수");
		} else {
			System.out.println(num+":대칭수아님");			
		}
		
		//방법2.
		//받은 숫자에 ""를 더해서 문자열로 만들고, rsnum += sum.charAt(i); 해서 대입
		//equals 메서드 써서 비교
		//String 클래스는 참조클래스이므로 배열을 비교하는 것이 아니라 배열 안의 값을 비교해야 함에 주의
		
		//방법3.
		//하나는 앞에서부터, 하나는 뒤에서부터 char 비교
//		String snum=""+num;
//		boolean flag=true;
		//초기식에 문자를 2개 사용할 수 있음, 조건은 1개만 걸 수도 있음
//        for(int i=0,j=snum.length()-1;i<snum.length();i++,j--){
//          if(snum.charAt(i)!=snum.charAt(j)){
//            flag=false;
//          }
//        }
//        if(flag){
//          System.out.println(snum+": 대칭수");
//        }else{
//          System.out.println(snum+": 대칭수 아님");
//        }
		
	}
}
