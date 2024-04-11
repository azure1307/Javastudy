package chap12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 타자 연습 프로그램 작성하기
public class ThreadEx10 {
	String[] data = {"태연","유리","윤아","수영","효연","서현","써니","제시카","티파니"};
	// 가변배열
	List<String> words = new ArrayList<>();
	int interval = 3*1000;
	
	// 상수값 편하게 가져다쓰려고 내부 클래스로 작성
	class DataAddThread extends Thread {
		public void run() {
			// 3초에 한번씩 data에 있는 단어 하나를 words에 추가
			while(true) {
				words.add(data[(int)(Math.random()*data.length)]);
				try {
					sleep(interval);
				} catch (InterruptedException e) {}
			}
		}
	}
	public static void main(String[] args) {
		ThreadEx10 c = new ThreadEx10();
		Scanner sc = new Scanner(System.in);
		c.words.add(c.data[0]);
		DataAddThread dt = c.new DataAddThread();
		dt.setDaemon(true);
		dt.start();
		
		while (true) {
			System.out.println(c.words);
			System.out.print(">>");
			String n = sc.next().trim();
			c.words.remove(n); // 입력한 값과 같은 단어는 삭제
			if(c.words.size() == 0) break; // words라는 공간에 아무 단어도 없을 때 종료
		}
		System.out.println("타자연습 종료");
		sc.close();
	} // main 스레드 종료. 데몬 스레드 dt도 같이 종료
}
