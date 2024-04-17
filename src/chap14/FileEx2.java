package chap14;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * File 클래스의 주요 메서드
 * String getAbsolutePath() : 절대 경로
 * boolean mkdir() : 1개의 폴더 생성. 성공시 true, 실패시 false
 * boolean mkdirs() : 여러단계의 폴더 생성.(a밑의 b밑의 c..) 성공시 true, 실패시 false
 * boolean createNewFile() : 파일 생성. 안의 내용은 건드릴 수 없음. 성공시 true, 실패시 false
 * String getName() : 파일의 이름
 * long length() : 파일의 크기
 * boolean exists() : 파일(폴더 포함)의 존재 여부. 있으면 true, 없으면 false
 * boolean renameTo(File f) : 현재 File 객체를 f 객체로 변경. 파일이름 변경
 * long lastModified() : 1970년부터 파일이 마지막으로 수정된 시간까지 흐른 시간을 밀리초로 리턴
 * boolean delete() : 현재 파일을 제거. 성공시 true, 실패시 false
 * boolean isDirectory() : 현재 파일의 폴더 여부. 폴더일 경우 true, 파일일 경우 false
 * boolean isFile() : 현재 파일의 파일 여부. 파일일 경우 true, 폴더일 경우 false
 * 				      boolean isFile = !isDirectory();
 * boolean isHidden() : 숨김 파일 여부. 
 * 
 * 한꺼번에 실행시 만들고 삭제까지 끝나서 temp1 폴더 안에 아무것도 없음
 */
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		// File.getAbsolutePath(): c:/temp1
		System.out.printf("%s 폴더 생성:%b\n",f1.getAbsolutePath(),f1.mkdir());
		
		File f2 = new File("c:/temp1/test.txt");
		System.out.printf("%s 파일 생성:%b\n",f2.getAbsolutePath(),f2.createNewFile());
		System.out.printf("파일 이름:%s, 파일 크기:%d\n",f2.getName(),f2.length());
		
		File f3 = new File("c:/temp1/test2.txt"); // 없는 파일
		if (f3.exists()) {
			System.out.println(f3.getName() + "파일은 존재함");
		} else {
			System.out.println(f3.getName() + "파일은 없음");
		}
		
		System.out.printf("%s -> %s 이름 변경: %b\n",
				f2.getName(),f3.getName(),f2.renameTo(f3)); // f2 -> f3 변경
		// f3.lastModified(): 1970년부터 지금까지 흐른 시간을 밀리초로
		System.out.printf("%s 파일 최종 수정시간: %s,%d\n",
				f3.getName(),new Date(f3.lastModified()),f3.lastModified());
		System.out.printf("%s 파일 삭제:%b\n", f3.getName(),f3.delete());
	}
}
