package test0415;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
1.궁합음식의 키를 입력받아 해당되는 음식을 출력하기. 
  종료가 입력될때 까지 계속 출력하기
  등록안된 경우 오류 발생. => 등록여부 판단필요
2.종료 입력시 등록된 내용 출력하기
  등록된음식 :
    떡볶이 : 오뎅
    짜장면 : 단무지
3. 등록이 안된경우 
   등록여부를 입력받아, 등록하는 경우 궁합음식을 입력받기  
   등록하시겠습니까(y)? 
     y입력 : foods객체에 추가.
            궁합음식 입력받아서 foods에 추가함
     y가아닌경우 :
            음식을 다시 입력하기   

Map 사용
[결과]
음식명을 입력하세요(종료:종료)
떡볶기
떡볶기의 궁합음식이 등록되어 있지 않습니다.등록하시겠습니까?
n
음식명을 입력하세요(종료:종료)
떡볶이
떡볶이의 궁합음식:오뎅
음식명을 입력하세요(종료:종료)
치킨
치킨의 궁합음식이 등록되어 있지 않습니다.등록하시겠습니까?
y
치킨의 궁합음식을 등록하세요
맥주
음식명을 입력하세요(종료:종료)
종료
{치킨=맥주, 떡볶이=오뎅, 라면=김치}
*/
public class Test1 {
	public static void main(String[] args) {
		Map<String, String> combi = new HashMap<>();
		combi.put("떡볶이", "오뎅");
		combi.put("라면", "김치");
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("음식명을 입력하세요(종료:종료)");
			String input = sc.next();
			if (input.equals("종료")) break;
			if (combi.get(input)==null) {
				System.out.println(input+"의 궁합음식이 등록되어 있지 않습니다. 등록하시겠습니까?");
				String isEnroll = sc.next();
//				if (isEnroll.equalsIgnoreCase("y")) { // 대소문자 무시
				if (isEnroll.equals("y")) {
					System.out.println(input+"의 궁합음식을 등록하세요");
					String input2 = sc.next();
					combi.put(input, input2);
				}
			} else {
				System.out.println(input+"의 궁합음식:"+combi.get(input));
			}
		}
		
		Set<Map.Entry<String, String>> entrys = combi.entrySet();
		for (Map.Entry<String, String> e : entrys) {
//		for (Map.Entry<String, String> e : combi.entrySet()) { // entrys 안만들어도됨
			System.out.print(e.getKey()+":"+e.getValue());
			System.out.println();
		}
	}
}
