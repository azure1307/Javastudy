package chap13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Collection: 객체들의 모임. 
 *   List: 순서 유지. 인덱스 사용할 수 있음. 가변배열
 *   	   구현클래스 => ArrayList, Vector, LinkedList
 *    Set: 중복 불가, 인덱스 사용할 수 없음. 
 *    	   집합을 구현함
 *   	   구현 클래스
 *   		  HashSet: 중복불가. 순서모름
 *   		  TreeSet: 중복불가. 정렬함
 *   		  LinkedHashSet: 중복불가. 순서유지. 인덱스사용안됨
 *   
 *    Set의 중요한 메서드
 *        boolean add(Object): 추가에 성공하면 true, 실패(중복값)하면 false 
 */
public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"홍길동",1,"1","김삿갓","이몽룡","홍길동","성춘향","향단이",
				"홍길동","김삿갓"};
//		Set<Object> set1 = new HashSet<>();
		Set<Object> set1 = new LinkedHashSet<>(); // 추가한 순서 유지
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();
		for (int i=0;i<arr.length;i++) {
			if (!set1.add(arr[i])) {
				if (!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		// 개선된 for 구문으로 조회 가능
		for (Object o:set1) System.out.print(o+", ");
	}
}
