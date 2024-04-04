package test0404;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고,값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기
  1 부터 100까지의 숫자가 아닌 경우 : 1과 100사이의 숫자만 입력하세요 메세지출력. 
                              MyInputNumberException 클래스로 예외발생시킴 
  숫자가 입력이 안된 경우 :  숫자만 입력하세요 메세지 출력
  
  숫자를 맞출때 까지 계속 입력을 받는다.
  
  몇번의 입력만에 숫자를 맞추었는지 출력하기.
  단 입력 오류된 입력도 입력 건수에 포함된다.

1. 임의의 수를 저장
2. 반복문으로 데이터 입력 받기. 입력한 수보다 큰지, 작은지 출력
   정답과 비교
3. 입력횟수 증가         
*/
public class Test2 {
	public static void main(String[] args) {
		int cnum = (int)(Math.random()*100)+1;
		int cnt = 0;
		System.out.println("컴퓨터가 저장한 숫자="+cnum);
		System.out.println("1부터 100 사이의 숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				int unum = sc.nextInt();
				if (unum>100 || unum<1) {
					throw new MyInputNumberException("1부터 100 사이의 숫자만 입력하세요.");
				}
				
				if (unum > cnum) {
					System.out.println(unum+"보다 작은 숫자입니다.");
					cnt++;
				} else if (unum < cnum) {
					System.out.println(unum+"보다 큰 숫자입니다.");
					cnt++;
				} else {
					cnt++;
					System.out.println("정답입니다. "+cnt+"번만에 맞추셨습니다.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println(sc.next()+"는 숫자가 아닙니다. 숫자만 입력하세요.");
				cnt++;
			} catch (MyInputNumberException e) {
				System.out.println(e.getMessage());
				cnt++;
			}
		}
	}
}
