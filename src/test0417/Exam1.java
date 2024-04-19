package test0417;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) throws IOException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String rootPath = "c:/project/";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		PrintStream ps = null;
		Date date = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자 아이디를 입력하세요 >> ");
		String name = sc.next();
		rootPath += name; // 입력받은 아이디로 rootPath 갱신
		File f = new File(rootPath);
		System.out.println(rootPath);
		f.mkdir();
		
		while (true) {
			System.out.print("메뉴번호를 선택하시오(1:종료, 2:달력조회, 3:이벤트추가,"
					+ "4:이벤트조회, 5:이벤트변경, 6:이벤트삭제 >> ");
			int menu = sc.nextInt();
			if (menu==1) { // 종료
				System.out.println("종료합니다.");
				break;
			} else if (menu==2) { // 달력조회
				System.out.print("조회할 달력의 년도를 입력하시오 >> ");
				int year = sc.nextInt();
				System.out.print("조회할 달력의 월을 입력하세요 >> ");
				int month = sc.nextInt();
				cal.set(year, month-1, 1);
				
				int firstYoill = cal.get(Calendar.DAY_OF_WEEK);
//				System.out.println("첫 날 요일 값:"+firstYoill);
				
				int lday = cal.getActualMaximum(Calendar.DATE);
//				System.out.println("마지막 날짜값:"+lday);
				
				System.out.printf("\t%04d년%02d월\n",year,month);
				System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat   ");
				for (int day=1,i=1;day<=lday;i++) {
					// firstYoill이 3(화)일 경우 일,월은 공백 출력
					if (i<firstYoill) { 
						System.out.printf("%6c",' ');
					// 여기서부터 진짜 날짜(day) 출력
					} else {
						String calDay = year+"/"+(month<10?"0"+month:month)
								+"/"+(day<10?"0"+day:day);
						try {
							date = sdf.parse(calDay);
//							System.out.println(sdf.format(date));
							String eventPath = rootPath + "/" + calDay;
//							System.out.println(eventPath);
							
							File f2 = new File(eventPath);
							if (f2.exists()) { // 입력한 날짜에 파일 존재
								String[] files = f2.list();
								System.out.printf("%-2d(%1d)%1c",day++,files.length,' ');
							} else { // 입력한 날짜에 파일 존재x
								System.out.printf("%-2d%4c",day++,' ');
							}
						} catch (ParseException e) {
							e.printStackTrace();
							System.out.println("예외1");
						}
					}
					if (i%7==0) {
						System.out.println();
					}
				}
				
				System.out.println();
			} else if (menu==3) { // 이벤트 추가
				System.out.println("3번. 이벤트 추가 선택 선택");
				System.out.print("이벤트 제목을 입력하시오 >> ");
				String eventName = sc.next();
				System.out.println("이벤트제목:"+eventName);
				
				// TODO 이벤트 세부사항. 파일 안에 저장해야함
				System.out.print("이벤트 세부사항을 입력하시오 >> ");
				String eventDetail = sc.next();
				System.out.println("이벤트세부사항:"+eventDetail);
				
				System.out.print("이벤트가 있는 날을 입력하시오 (yyyy/MM/dd) >> ");
				String day = sc.next();
				System.out.println("이벤트날:"+day);
				
				String eventPath = rootPath + "/" + day;
				File f2 = new File(eventPath);
				f2.mkdir();
								
				eventPath = eventPath+"/"+eventName+".txt";
				try {
					fos = new FileOutputStream(eventPath);
					ps = new PrintStream(fos);
					ps.print(eventDetail);
					ps.println();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					System.out.println("예외2");
				}
				ps.flush();
				ps.close();
				System.out.println("이벤트 저장 완료");
			} else if (menu==4) { // 이벤트 조회
				System.out.print("조회할 이벤트 날짜를 입력하시오(yyyy/MM/dd) >> ");
				String day = sc.next();
				System.out.println("이벤트날:"+day);
				
				// 반복문
				// 제목 : 파일명
				// 기간 : 이벤트날
				// 상세 : 파일내용
				
				String eventPath = rootPath + "/" + day;
				System.out.println("날짜추가이벤트날"+eventPath);
					
				File f2 = new File(eventPath);
				if (f2.exists()) { // 입력한 날짜에 파일 존재
					String[] files = f2.list();
					for (String file : files) {
						File f3 = new File(eventPath,file);
						String title = f3.getName();
						System.out.println(title);
						System.out.println("eventPath:"+eventPath);
						String content = "";
						
						// FileNotFoundException 났던 이유
						// FileInputStream은 지금 이 java파일 있는 위치에서 찾음
						fis = new FileInputStream("C:/project/hong/2024/04/01/"+title); 
						byte[] buf = new byte[fis.available()];
						int len = fis.read(buf);
						System.out.println(len);
						if (len == -1 || len == 0) {
							System.out.println("내용 없음");
						} else {
							// TODO 여기 수정중.. 무한루프
							while (len != -1) {
								System.out.println(new String(buf, 0, len));
							}													
						}
					}
				} else { // 입력한 날짜에 파일 존재x
					System.out.println("조회할 데이터가 없습니다.");
				}
					
				// 2024/04/01 입력시 그 폴더 안에 있는 파일 갯수 세기
				// 반복문, i는 0부터 갯수 미만, 제목이랑 내용, 날짜 표시
			} else if (menu==5) { // 이벤트 변경
				// 2024/04/01 입력시 그 폴더 안에 있는 파일 제목 리네임
				// 2024/04/01 입력시 그 폴더 안에 있는 파일 내용 변경
			} else if (menu==6) { // 이벤트 삭제
				// 2024/04/01 입력시 그 폴더 안에 있는 파일 삭제
			}
			
		}
	}
}
