package test0320;
/*
 시스템과 가위(1), 바위(2), 보(3)를 하기
  시스템은 1,2,3 중의 한개의 숫자를 저장하고, 
  한개의 숫자를 입력받아 가위바위보 게임하기 
  
  [결과]
  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  사용자 승리!

  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  시스템 승리!
*/

//0 <= x < 1
//0 <= 3*x < 3
//1 <= 3*x+1 < 4

//U \ S		가위(1)		바위(2)		보(3)
//가위(1)		비김			유저<시스템		유저<시스템(★)
//바위(2)		유저>시스템		비김			유저<시스템
//보(3)		유저>시스템(☆)	유저>시스템		비김
//
//★은 근데 이김
//☆은 근데 짐
//
//1. ☆유저>시스템 중 유저가 3이면서 시스템이 1이면 (숫자로는 이겼지만) 유저가 졌다고 출력
//2. ★유저<시스템 중 유저가 1이면서 시스템이 3이면 (숫자로는 졌지만) 유저가 이겼다 출력
//특이케이스를 먼저 작성해야함....................... 그 다음에 제외한 경우 작성

//선생님) 비긴 경우와 비기지 않은 경우를 나눔
//일단 승부판단값(boolean)을 사용자가 진걸로 초기화 (9가지중 사용자가 진 값 3가지)
//처음에 if 문으로 userNum==sysNum일 경우는 비겨서 제외 (9가지중 비긴 경우 3가지)
//else 문에서 사용자가 이겼을 경우에만 switch문 사용해서 boolean값 사용자가 이긴걸로 변경(9가지중 사용자가 이긴 값 3가지)
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int sysNum = (int)(Math.random()*3+1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 를 숫자로 입력하세요.");
//		int sysNum = sc.nextInt();
		int userNum = sc.nextInt();
			
		
		if (userNum>sysNum && (userNum==3 && sysNum==1)) {		//특이케이스
			System.out.println("시스템: " + sysNum + "(가위), 사용자: " + userNum + "(보)로 시스템 승리!");
		} else if (userNum>sysNum && (userNum==2 || userNum==3)) { 				
			System.out.println("시스템: " + sysNum + ", 사용자: " + userNum + "로 사용자 승리!");		
		} else if (userNum<sysNum && (userNum==1 && sysNum==3)) { //특이케이스
			System.out.println("시스템: " + sysNum + "(가위), 사용자: " + userNum + "(보)로 사용자 승리!");		
		} else if (userNum<sysNum && (userNum==1 || sysNum==2)) {
			System.out.println("시스템: " + sysNum + ", 사용자: " + userNum + "로 시스템 승리!");
		} else {
			System.out.println("시스템: " + sysNum + ", 사용자: " + userNum + "로 비겼습니다.");
		}	
	}

}