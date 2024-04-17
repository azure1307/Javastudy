package chap14;

import java.io.File;
/*
 * c:/windows 폴더의 하위 폴더 갯수. 파일의 갯수, 파일의 총 크기 출력하기
 */
public class Exam4 {
	public static void main(String[] args) {
		String filepath = "c:/windows";
//		String filepath = "c:/windows/Firmware";
		File f1 = new File(filepath);
		String[] files = f1.list();
		int dcnt = 0, fcnt = 0;
		long size = 0; // File.length()의 리턴타입에 맞게
		for (String f : files) {
			File f2 = new File(filepath,f);
			if (f2.isDirectory()) { 
				dcnt++;
			} else {
				fcnt++;
				size += f2.length();
			}
		}
		System.out.println("디렉토리 갯수: "+dcnt);
		System.out.println("파일 갯수: "+fcnt);
		System.out.printf("파일의 총 크기: %,dbyte",size);
	}
}
