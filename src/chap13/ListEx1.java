package chap13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 * 컬렉션 프레임워크 - 객체들의 모임. 기본자료형은 Wrapper 클래스로 사용해야함
 * List 인터페이스
 * 1. 순서 유지
 * 2. 인덱스(첨자) 사용 가능
 * 3. 구현 클래스: ArrayList, Vector, LinkedList 등
 * 	  ArrayList는 끝부분에 추가할 때 용이, LinkedList는 중간중간에 추가할 때 용이
 */
public class ListEx1 {
	public static void main(String[] args) {
		// <Integer>: 제네릭.
		//			  요소(Element)의 자료형 지정
//		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list = new ArrayList<>(); // jdk 8.0 이후버전에서 가능함
//		List<Integer> list = new Vector<>(); // 벡터로도 같은 결과
		List<Integer> list = new LinkedList<>(); // LinkedList로도 같은 결과
		list.add(1); list.add(2); list.add(5);
		list.add(4); list.add(3); list.add(0);
//		list.add("3"); // Integer 객체만 저장 가능
		System.out.println(list);
		// list.size(): 저장된 요소의 갯수
		for (int i=0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
		
		// 개선된 for문 사용 가능
		for (Integer i:list) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 정렬하기
		// Collections: 클래스. Collection 객체들의 보조기능 수행
		// Collection: 인터페이스. List, Set의 상위 인터페이스
		// sort(): 정렬하기
		System.out.print("오름차순 정렬 : ");
		Collections.sort(list); // list 객체 정렬
		System.out.println(list);
		System.out.print("내림차순 정렬 : ");
		Collections.sort(list,Comparator.reverseOrder()); 
		System.out.println(list);
		
		// shuffle(): 객체를 임의의 순서로 섞기
		System.out.print("요소들을 섞기 : ");
		Collections.shuffle(list);
		System.out.println(list);
		
		// subList(시작인덱스,종료인덱스(포함x)): 부분리스트
		// subList(1,4) : 1번 인덱스부터 3번 인덱스까지를 부분리스트로 리턴
		System.out.print("부분리스트 : ");
		List<Integer> list2 = list.subList(1, 4);
		System.out.println(list2);
		
		list.set(1, 100); // 1번 인덱스의 값을 100으로 변경
		System.out.println(list);
		System.out.println(list2);
		System.out.println();
		
		// new 예약어 사용해서 새로 만듦. 기존 list, list2와 연결 끊어짐
		List<Integer> list3 = new ArrayList<>(list.subList(1, 4));
		list.set(2, 200);
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list3);
	}
}
