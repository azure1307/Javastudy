package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * TODO 11. 다른 프로세스에서 전달해준 메세지 출력하기
 */
public class ProcessEx1 {
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("ping 172.16.2.16");
		Reader r = new InputStreamReader(p.getInputStream(),"EUC-KR");
		int data = 0;
		while ((data = r.read()) != -1) {
			System.out.print((char)data);
		}
	}
}
