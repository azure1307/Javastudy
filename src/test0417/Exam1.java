package test0417;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String rootPath = "c:/project/";
		
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
				
				int cnt = 0;
				System.out.printf("\t%04d년%02d월\n",year,month);
				System.out.println("   Sun   Mon   Tue   Wed   Thu   Fri   Sat");
				for (int day=1,i=1;day<=lday;i++) {
					if (i<firstYoill) {
						System.out.printf("%6c",' ');
					} else {
						System.out.printf("%6d",day++);
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
//				System.out.print("이벤트 세부사항을 입력하시오 >> ");
//				String eventDetail = sc.next();
//				System.out.println("이벤트세부사항:"+eventDetail);
				
				System.out.print("이벤트가 있는 날을 입력하시오 (yyyy/MM/dd) >> ");
				String day = sc.next();
				System.out.println("이벤트날:"+day);
				String[] dayArr = day.split("/");
				String inputYear = dayArr[0];
				String inputMonth = dayArr[1];
				String inputDay = dayArr[2];
				
				String eventPath = rootPath + "/" + inputYear;
				File f2 = new File(eventPath);
				f2.mkdir();
				
				eventPath += "/" + inputMonth;
				File f3 = new File(eventPath);
				f3.mkdir();

				eventPath += "/" + inputDay;
				File f4 = new File(eventPath);
				f4.mkdir();
								
				File f5 = new File(eventPath+"/"+eventName+".txt");
				try {
					f5.createNewFile();
					System.out.println("이벤트 저장 완료");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (menu==4) { // 이벤트 조회
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
