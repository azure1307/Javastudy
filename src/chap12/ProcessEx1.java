package chap12;

import java.io.IOException;
/*
 * Process 예제
 *    Process : OS(window환경) 상에서 실행되는 프로그램
 *    멀티프로세스환경 : 프로세스를 동시에 여러 개 실행 가능한 환경
 *    Runtime Runtime.getRuntime() : OS의 프로세스 실행 권한을 받음
 *    Process Runtime.exec(명령어) : OS 상에서 현재 실행중인 프로그램
 */
public class ProcessEx1 {
	public static void main(String[] args) {
		try {
			Process p1 = Runtime.getRuntime().exec("calc.exe");
			Process p2 = Runtime.getRuntime().exec("notepad.exe");
			p2.waitFor(); // p1 프로세스 종료시까지 main이 대기함
//			p1.destroy();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
