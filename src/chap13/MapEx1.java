package chap13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * TODO Map 예제
 * 
 * Collection 인터페이스 : 객체들의 모임
 * 		List 인터페이스 : 추가된 순서 유지. 인덱스 사용 가능. 가변배열
 * 			구현클래스)		   ArrayList, Vector, LinkedList
 * 		Set 인터페이스 : 중복 불가.
 * 					  HashSet, TreeSet, LinkedHashSet
 * 		Queue 인터페이스 : Queue 구조를 구현함
 * 						LinkedList
 * Map 인터페이스 : 객체를 구분할 수 있는 Key 값을 가지는 (Key, Value) 쌍의 모임
 * 				 HashMap : 순서 모름. 
 * 				 HashTable : 구버전의 클래스. 구버전의 메서드와 혼합
 * 				 TreeMap : Key를 기준으로 정렬됨
 * 
 * 주요 메서드
 *   put(키값, 객체값) : map 객체에 데이터 추가. 수정 
 *   get(키값) : 키값으로 등록된 객체의 값을 리턴
 *  			등록된 키가 없으면 null 리턴
 *   keySet() : Map에 등록된 객체 중 key값들의 목록 리턴. Set으로 리턴
 *   values() : Map에 등록된 객체 중 value값들의 목록 리턴. Collection으로 리턴
 *   entrySet() : Map에 등록된 객체를 (키, 객체)의 쌍인 객체로 리턴. Set으로 리턴
 *   			  Map.Entry<키의 자료형, 객체의 자료형> : (키,객체)의 쌍인 객체의 자료형
 *   remove(키값) : 키에 해당하는 객체를 제거함. 객체값 리턴함. 
 * 
 * 같은 Key 값 입력시 Set은 무시, Map은 Value를 수정. 
 */
public class MapEx1 {
	public static void main(String[] args) {
		/*
		 * <String, Integer>
		 * 키의 자료형, 객체의 자료형
		 */
		Map<String,Integer> map = new HashMap<>();
		map.put("홍길동", 1234);
		map.put("김삿갓", 2345);
		map.put("이몽룡", 3456);
		map.put("김삿갓", 4567);
		System.out.println(map);
		System.out.println("김삿갓의 전화번호:"+map.get("김삿갓"));
		System.out.println("홍길순의 전화번호:"+map.get("홍길순")); // 찾는 키 값 없으면 null
		
		// KeySet(): Key값들만 조회
		Set<String> keys = map.keySet();
		for (String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		// Values(): 객체값들만 조회. 중복가능, 순서 모름. value 값으로는 키값 조회 불가
		Collection<Integer> values = map.values();
		for (Integer v : values) {
			System.out.println(v);
		}
		System.out.println();
		
		// entrySet() : <키, 객체> 쌍인 객체를 조회
		// <키, 객체> 쌍인 객체의 자료형 : Map.Entry
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for (Map.Entry<String, Integer> e : entrys) {
			System.out.println(e.getKey() + " = " + e.getValue());
		} 
		System.out.println();
		
		// 홍길동 객체 제거
		Integer value = map.remove("홍길동");
		System.out.println(value);
		System.out.println(map);
		System.out.println("map의 요소의 갯수:"+map.size());
	}
}
