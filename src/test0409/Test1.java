package test0409;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도를 입력받아 1월부터 12까지의 달력을 출력하는 프로그램 작성하기
 * [결과]
 * 년도를 입력하세요
 2024

	2024년 1월			2024년 2월			2024년 3월			2024년 4월		
  일   월   화  수  목   금   토	  일   월   화  수  목   금   토	  일   월   화  수  목   금   토	  일   월   화  수  목   금   토	
       1   2   3   4   5   6	                   1   2   3	                       1   2	       1   2   3   4   5   6	
   7   8   9  10  11  12  13	   4   5   6   7   8   9  10	   3   4   5   6   7   8   9	   7   8   9  10  11  12  13	
  14  15  16  17  18  19  20	  11  12  13  14  15  16  17	  10  11  12  13  14  15  16	  14  15  16  17  18  19  20	
  21  22  23  24  25  26  27	  18  19  20  21  22  23  24	  17  18  19  20  21  22  23	  21  22  23  24  25  26  27	
  28  29  30  31            	  25  26  27  28  29        	  24  25  26  27  28  29  30	  28  29  30                	
                            	                            	  31                        	                            	
                            	                            	                            	                            	
	2024년 5월			2024년 6월			2024년 7월			2024년 8월		
  일   월   화  수  목   금   토	  일   월   화  수  목   금   토	  일   월   화  수  목   금   토	  일   월   화  수  목   금   토	
               1   2   3   4	                           1	       1   2   3   4   5   6	                   1   2   3	
   5   6   7   8   9  10  11	   2   3   4   5   6   7   8	   7   8   9  10  11  12  13	   4   5   6   7   8   9  10	
  12  13  14  15  16  17  18	   9  10  11  12  13  14  15	  14  15  16  17  18  19  20	  11  12  13  14  15  16  17	
  19  20  21  22  23  24  25	  16  17  18  19  20  21  22	  21  22  23  24  25  26  27	  18  19  20  21  22  23  24	
  26  27  28  29  30  31    	  23  24  25  26  27  28  29	  28  29  30  31            	  25  26  27  28  29  30  31	
                            	  30                        	                            	                            	
                            	                            	                            	                            	
	2024년 9월			2024년 10월			2024년 11월			2024년 12월		
  일   월   화  수  목   금   토	  일   월   화  수  목   금   토	  일   월   화  수  목   금   토	  일   월   화  수  목   금   토	
   1   2   3   4   5   6   7	           1   2   3   4   5	                       1   2	   1   2   3   4   5   6   7	
   8   9  10  11  12  13  14	   6   7   8   9  10  11  12	   3   4   5   6   7   8   9	   8   9  10  11  12  13  14	
  15  16  17  18  19  20  21	  13  14  15  16  17  18  19	  10  11  12  13  14  15  16	  15  16  17  18  19  20  21	
  22  23  24  25  26  27  28	  20  21  22  23  24  25  26	  17  18  19  20  21  22  23	  22  23  24  25  26  27  28	
  29  30                    	  27  28  29  30  31        	  24  25  26  27  28  29  30	  29  30  31                	 * 
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
//		System.out.println(year);
		
		Calendar cal = Calendar.getInstance();
		int[][][] calarr = new int[12][7][7];
		
		//데이터 저장
		for(int m=0; m<12;m++) {
			cal.set(year, m,1);
//			int firstWeek = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일
			int lastday = cal.getActualMaximum(Calendar.DATE); //월의 마지막 일자
			for(int i=1;i<=lastday;i++) {
				cal.set(year, m,i);
				int week = cal.get(Calendar.DAY_OF_WEEK); //요일
				int weekcnt = cal.get(Calendar.WEEK_OF_MONTH); //월의 몇번째주
				// m번째달, weekcnt-1째 주, week-1요일은 i일
				calarr[m][weekcnt-1][week-1] = i;
			}
		}
		
		//달력 출력 : 1자 출력
//		for(int m=0; m<calarr.length;m++) {
//		    System.out.println("\t" + year + "년 " + (m+1) + "월");
//		    System.out.printf("%3s%4s%4s%3s%3s%4s%4s\n", "일월화수목금토".split(""));
//		    for(int i=0;i<calarr[m].length;i++) {
//			    for(int j=0;j<calarr[m][i].length;j++) {
//			    	if(calarr[m][i][j] == 0) System.out.printf("%4c",' ');
//			    	else System.out.printf("%4d",calarr[m][i][j]);
//			    }
//			    System.out.println();
//		    }
//		}
		
		//달력 출력 : 3단 출력
		for (int k = 0; k < 12; k += 4) {
			
			// nnnn년 n월 출력
			for (int i = 0; i < 4; i++) {
				// (k,i): 0,0: 1월, 0,1: 2월, 0,2: 3월, 0,3: 4월, 4,0: 5월, ...
			    System.out.print("\t" + year + "년 " + (k+i+1) + "월\t\t");
			}
			System.out.println();
			
			// 요일 출력
			for (int i = 0; i < 4; i++) {
			    System.out.printf("%3s%4s%4s%3s%3s%4s%4s\t", "일월화수목금토".split(""));
			}
			System.out.println();
			
			// 날짜 출력
//		for (int k = 0; k < 12; k += 4) { k = 0, 4, 8
			for (int i =0; i < 7; i++) {
				// m: k월부터 k+3일까지 반복. (m,k) : 0,0:0부터 3까지, 1,4:4부터 7까지, 2,8: 8부터 11까지
				for(int m=k;m<k+4;m++) { 
					for(int j=0;j<7;j++) {
				    	   if(calarr[m][i][j] == 0) System.out.printf("%4c",' ');
				    	   else System.out.printf("%4d",calarr[m][i][j]);
					}
					System.out.print("\t");
				}
				System.out.println();
			}
		}
		sc.close();
		
		
		// 내가 씀. 한 달짜리 달력을 세로로 반복
//		for (int i=0;i<12;i++) {
//			cal.set(year, i, 1);			
//			System.out.printf("날짜:%4d-%02d-%02d\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
//			
//			int firstYoill = cal.get(Calendar.DAY_OF_WEEK);
//			System.out.println("첫 날 요일 값(1.일 ~ 7.토) : "+firstYoill);
//			
//			int lday = cal.getActualMaximum(Calendar.DATE);
//			System.out.println("마지막 날짜값 : "+lday);
//			
//			System.out.println("\t"+(i+1)+"월");
//			System.out.printf("%3s%4s%4s%3s%3s%4s%4s\n","일월화수목금토".split(""));
//			
//			int cnt = 0;
//			for (int day=1,j=1;day<=lday;j++) {
//				if (j<firstYoill) {
//					System.out.printf("%4c",' ');
//				} else {
//					System.out.printf("%4d",day++);
//				}
//				if (j%7==0) {
//					System.out.println();
//				}
//			}
//			System.out.println();
//			System.out.println();
//		}		
	}
}