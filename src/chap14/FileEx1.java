package chap14;

import java.io.File;

/*
 * File 클래스 : 파일이나 폴더의 정보를 관리하는 클래스
 * => 없는 파일도 관리. 
 * 폴더 구분자
 *     윈도우 : \\, /
 *     리눅스 : /
 */
public class FileEx1 {
	public static void main(String[] args) {
		String filePath = "c:/"; // c:\\ 도 같은 결과
		// f1 : c드라이브의 root 폴더 관리
		File f1 = new File(filePath);
		// String[] File.list(): 하위 폴더, 파일의 이름 목록
		String[] files = f1.list(); 
		for (String f : files) {
			// c 드라이브의 하위 파일(폴더) 1개의 이름
			File f2 = new File(filePath,f); // File(부모 파일, 파일의 이름)
			if (f2.isDirectory()) { // f2 파일이 폴더인지 여부
				System.out.printf("%s:디렉토리\n",f);
			} else { //%,d : f2.length()를 3자리마다 , 찍어서 출력
				// f2.length() : 파일의 크기
				System.out.printf("%s:파일(%,dbyte)\n",f,f2.length());
			}
		}
	}
}
