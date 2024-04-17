package chap14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/*
 * File 클래스를 이용해서 파일 읽기
 */
public class FileEx3 {
	public static void main(String[] args) throws IOException {
		File f = new File("data.txt");
		if (!f.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return; // main 메서드 종료
		}
		
		FileInputStream fis = new FileInputStream(f);
		int len = 0;
		byte[] buf = new byte[8096];
		while ((len=fis.read(buf)) != -1) {
			System.out.print(new String(buf,0,len));
		}
		fis.close();
		// 두번째 실행시 삭제되어 파일이 존재x 출력
		f.delete();
	}
}
