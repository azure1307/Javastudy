package chap14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * TODO 12. BufferedReader 예제
 * BufferedReader 보조스트림
 * - 다른 스트림을 매개변수로 입력받아 새로운 기능 추가
 * - readLine() 메서드(한줄씩 읽음) 기능 추가
 * - new BufferedReader(Reader)
 */
public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		// System.in: InputStream
		// Reader InputStreamReader(InputStream is)
		// BufferedReader BufferedReader(Reader r)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("저장할 내용을 입력하세요(종료:ctrl-z)");
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
		while ((data=br.readLine()) != null) {
			System.out.println(data);
			fw.write(data+"\n");
		}
		fw.flush();
		fw.close();
		br.close();
		
		// InputStreamEx1.java 소스에 라인번호를 출력하기
		br = new BufferedReader(new FileReader("src/chap14/InputStreamEx1.java"));
		int line = 0;
		while ((data=br.readLine()) != null) {
			System.out.println(++line+":"+data);
		}
	}
}
