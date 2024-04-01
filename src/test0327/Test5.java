package test0327;
/*
 * Test2.java 소스의 Coin 클래스를 이용하기.
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 * 앞면이 연속해서 3번 나오면 승리. => myCoin 승리, youCoin 승리, 비김.
 * [결과]
 * myCoin	youCoin
 * 앞면	앞면
 * 뒷면	앞면
 * 앞면	뒷면
 * 뒷면	앞면
 * 뒷면	앞면
 * 앞면	앞면
 * youCoin 승리  
 */
public class Test5 {
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		int mycnt=0,youcnt=0;
		System.out.println("myCoin\tyouCoin");
		
		//몇번을 반복해야할지 모르니까 while문 사용. 하나라도 3점을 넘기면 그 때 탈출
		while(mycnt < 3 && youcnt < 3) {
			myCoin.flip();
			youCoin.flip();
			
			if(myCoin.side == 0) {
				mycnt++;
			} else { //한번이라도 뒷면이 나올 경우 초기화.
				mycnt=0;
			}
			
			if(youCoin.side == 0) { 
				youcnt++;
			} else { //한번이라도 뒷면이 나올 경우 초기화.
				youcnt=0;
			}
			System.out.println((myCoin.side==0?"앞면":"뒷면")
					+"\t"+(youCoin.side==0?"앞면":"뒷면"));
		}
		
		//while문을 탈출했다는 거: mycnt 또는 youcnt가 둘, 또는 하나가 3인 경우
		if(mycnt == youcnt) {
			System.out.println("비김");
		} else if (mycnt == 3) {
			System.out.println("myCoin 승리");
		} else { 
			System.out.println("youCoin 승리");
		}
		
//		Coin[] carr = new Coin[2];
//		int[][] result = new int[6][2];
//		
//		System.out.println("myCoin\tyouCoin");
//		for (int i=0;i<6;i++) {			
//			for (int j=0;j<carr.length;j++) {
//				carr[j] = new Coin();
//				carr[j].flip();
//				result[i][j] = carr[j].side;
//				System.out.print((result[i][j]==0?"앞면":"뒷면")+"\t");
////				System.out.print(result[i][j]+"\t");
//			}
//			System.out.println();				
//		}
//		
//		String winner = "";
//		for (int j=0;j<result[0].length;j++) { 	//2번
//			for (int i=0;i<4;i++) {
//				if (result[i][j]==0 && result[i+1][j]==0 && result[i+2][j]==0) {
//					//근데 이렇게하면 둘 다 000 떳을때 마지막에 이긴사람이 덮어씌워서 이긴걸로 나옴....
//					//비겼을때도 비겼다고 안뜸..
//					if (j==0) {
//						winner = "myCoin 승리";
////						System.out.println("myCoin 승리");
//					} else if (j==1) {
//						winner = "youCoin 승리";
////						System.out.println("youCoin 승리");
//					} else {
//						winner = "비김";						
//					}
//				}
//			}
//		}
//		
//		System.out.println(winner);
		
		//배열 만들어서 두명, 6번 side값 저장
		//0이 연속으로 3번 나오면 승리?
		//i가 0, i+1가 0, i+2가 0이면서, i가 0부터 3까지만 반복, j는 고정
		//0,0 1,0 2,0 비교 -> 1,0 2,0 3,0 비교 -> 2,0 3,0 4,0 비교 -> 3,0 4,0 5,0
		//0,1 1,1 2,1 비교 -> 1,1 2,1 3,1 비교 -> 2,1 3,1 4,1 비교 -> 3,1 4,1 5,1
		//j가 바깥쪽, j는 0에서 1까지 1씩 증가
		//i는 안쪽, i는 0에서 3까지 1씩 증가
	}
}
