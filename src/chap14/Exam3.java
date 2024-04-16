package chap14;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
 * 화면에서 파일명을 입력받아 출력을 시작하는 라인번호와 출력 라인을 입력받기
 * 파일에서 시작 번호부터 라인수만큼만 화면 출력하고, subfile.txt 파일에도 저장
 * 1. Scanner 사용x
 * 2. subfile.txt에 저장할 때 println() 이용
 * 
 * [결과]
 * 파일명을 입력하세요.
 * src/chap14/InputStreamEx1.java
 * 시작라인을 입력하세요.
 * 1
 * 라인수를 입력하세요.
 * 3
 * 
 * 1:package chap14;
 * 2:
 * 3:import java.io.IOException;
 */
public class Exam3 {
	public static void main(String[] args) throws IOException {
		// 키보드 입력을 위한 스트림
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요.");
		String name = stdin.readLine();
		System.out.println("시작라인을 입력하세요.");
		int start = Integer.parseInt(stdin.readLine());
//		System.out.println(start);
		System.out.println("라인수를 입력하세요.");
		int len = Integer.parseInt(stdin.readLine());
//		System.out.println(len);

		// 파일을 읽기 위한 입력 스트림
		BufferedReader br = new BufferedReader(new FileReader(name));
		
		// 파일을 쓰기 위한 출력 스트림
		PrintStream ps = new PrintStream(new FileOutputStream("subfile.txt"));
		String data = null;
		int line = 0, cnt = 0; // line은 출력할 line number
		char[] buf = new char[8096];
		while ((data=br.readLine()) != null) {
			++line;
			if (line < start) continue; // start가 6일경우 line 5까지는 그냥 넘김
			if (cnt >= len) break;
			cnt++;
			System.out.println(line+":"+data); // 화면출력
			ps.println(line+":"+data); // 파일에 출력
		}
		stdin.close();
		br.close();
		ps.close();
		stdin.close();
	}
}
