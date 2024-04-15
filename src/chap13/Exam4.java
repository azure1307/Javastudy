package chap13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * TODO HashMap 객체에 나라의 수도를 등록하기
 * 1. 대한민국=서울, 캐나다=오타와, 영국=런던 값을 저장하는 HashMap 객체를 생성하여
 *    map이라는 이름으로 참조하기
 * 2. 화면에서 나라이름을 입력받아서 수도를 출력하기. "종료" 입력될 때까지 계속 입력받기
 *    => 등록된 나라가 아닌 경우 : 등록된 나라가 아닙니다. 메세지 출력하기
 * 3. 등록된 나라가 아닌 경우 수도를 입력받아 map에 등록하기
 *    => 프로그램 종료 전에 등록된 map의 내용을 출력하기
 *       keySet(), entrySet() 이용
 */
public class Exam4 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("나라 이름을 입력하세요. 종료 시 <종료> 입력");
			String input = sc.next();
			if (input.equals("종료")) break;
			if (map.get(input)==null) {
				System.out.println(input+"(은)는 등록된 나라가 아닙니다.");
				System.out.println(input+"의 수도를 입력해주세요.");
				String cap = sc.next();
				map.put(input, cap);
			} else {				
				System.out.println(input+"="+map.get(input));								
			}			
		}
		
		System.out.println("keySet() 이용 ===");
		Set<String> keys = map.keySet();
		for (String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		
		System.out.println("entrySet() 이용 ===");
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		for (Map.Entry<String, String> e : entrys) {
			System.out.println(e.getKey() + "=" + e.getValue());				
		}

	}
}
