package chap13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/*
 * TODO Iterator 인터페이스 예제
 * Iterator 인터페이스: 반복자
 *   Collection 객체를 Iterator 인터페이스의 객체로 변경 가능함 => iterator() 메서드 이용
 *   
 * 멤버 메서드
 * 	 boolean hasNext()	: 조회 가능한 객체 존재여부
 *   Object next()		: 객체를 조회해서 리턴
 *   void remove()		: 조회된 객체를 제거. next() 실행 후 호출해야 함
 *   
 * Enumeration 인터페이스 : Iterator 이전에 사용되던 반복자
 * 						 Vector, Hashtable만 사용가능함
 * 
 * 멤버 메서드
 * 	 boolean hasMoreElement()	: 조회 가능한 객체 존재여부
 *   Object nextElement()		: 객체를 조회해서 리턴
 */
public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator<Integer> it = null;
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		Map<Integer,Integer> map = new HashMap<>();
		for (int i=1;i<=5;i++) {
			list.add(i+10); // [11,12,13,14,15]
			set.add(i*10); // [10,20,30,40,50]
			map.put(i,i*100);
		}
		System.out.println(list);
		System.out.println(set);
		
		it = list.iterator(); // List를 Iterator 형태의 객체로 변경
		printnremove(it);
		it = set.iterator(); // Set를 Iterator 형태의 객체로 변경
		printnremove(it);
		it = map.keySet().iterator();
		printnremove(it);
		System.out.println("print & remove 한 후 list: "+list);
		System.out.println("print & remove 한 후 set: "+set);
		System.out.println("print & remove 한 후 map: "+map);
	}

	private static void printnremove(Iterator<Integer> it) {
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
			it.remove(); // next()로 리턴된 객체 제거
		}
		System.out.println();
	}
}
