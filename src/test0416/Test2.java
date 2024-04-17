package test0416;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. 반복문을 이용하여 
  파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
  파일명에 exit 가 입력되면, 프로그램 종료.
  해당 파일이 없으면, 복사할 파일이 없습니다. 메세지 출력

[결과]
파일명을 입력하세요(종료:exit)
aaa.txt
aaa.txt=>aaa.bak 복사완료
파일명을 입력하세요(종료:exit)
bbb.txt  
복사할 파일이 없습니다.
파일명을 입력하세요(종료:exit)
exit

1. 파일명 입력받는 스트림
2. 해당 파일을 읽어오는 스트림
3. 그 내용을 다른 파일에 작성하는 스트림

// data.txt 입력시 2줄짜린데 마지막줄을 안가져옴
*/

public class Test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("파일명을 입력하세요");
			String name = stdin.readLine();
			if (name.equals("exit")) break;
			
			String newName = null;
			if (name.indexOf('.') < 0) { // 확장자 없는 경우
				newName = name + ".bak";
			} else { // 확장자 있는 경우
				// .이 나온 인덱스값 -> 그 값이 나온 위치까지 자름 -> + .bak
				newName = name.substring(0, name.indexOf('.'))+".bak";
			}
			System.out.println(newName);

			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream(name);
				fos = new FileOutputStream(newName);
				byte[] buf = new byte[8096];
				int len = 0;
				while ((len = fis.read(buf)) != -1) {
					fos.write(buf, 0, len);
				}
				System.out.println(name + "=>" + newName + " 복사완료");
			} catch (FileNotFoundException e) {
				System.out.println("복사할 파일이 없습니다.");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (fos != null)	fos.flush();
				if (fis != null)	fis.close();
				if (fos != null)    fos.close();
			}
		}
		stdin.close();
	}
}
