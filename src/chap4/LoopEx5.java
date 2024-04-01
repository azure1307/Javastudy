package chap4;
/*
 * break	: switch,반복문(for,while,dowhile) 밖으로 이동
 * continue : 반복문의 head로 이동
 */
public class LoopEx5 {
	public static void main(String[] args) {
		for (int i=2;i<=9;i++) {	
			System.out.println("\n"+i+"단");
			for (int j=2;j<=9;j++) {
//				if (j==5) break; //break가 속한 반복문 종료
				if (j==5) continue; //아래의 내용을 실행하지 않고 다시 반복문으로 이동
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}

}
