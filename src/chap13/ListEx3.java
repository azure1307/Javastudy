package chap13;
// TODO List 객체 정렬하기

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 *   Collection.sort(List)
 *    => List의 요소의 자료형이 Comparable 인터페이스로 형변환이 가능해야함.
 *       Comparable 인터페이스의 구현 클래스의 객체여야 한다.
 * 
 *   Comparable 인터페이스: compareTo() 추상메서드를 가짐.
 *   => 객체의 기본정렬 방식을 사용
 *   Comparator 인터페이스: compare() 추상메서드를 가짐
 *   => 실행중 정렬 방식을 개발자가 직접 설정할 때 사용
 *   => Comparator Comparator.reverseOrder(): 기본 정렬 방식을 역순으로 다시 설정
 *   							   Comparator 인터페이스의 static 메서드임
 *   
 *   // static 메서드의 특징..: 구현부를 가진다
 *   
 *   정렬 관련 인터페이스
 *   1. Comparable<T> : 요소의 기본정렬방식 설정할 때 사용. 클래스에서 구현함
 *   			int compareTo(T o) // 비교대상 - 현재객체
 *   			양수값이라면 현재 객체 뒤에 배치, 음수값이라면 현재 객체 앞에 배치
 *   2. Comparator<T,T> : 기본 정렬 방식과 무관하게 실행 중 다른 정렬 방식을 설정할 때 객체화하여 설정
 *   			동적정렬방식 구현할 때 사용.
 *   			int compare(T o) // 비교대상 - o1
 *   			양수값이라면 o1 객체 뒤쪽, 음수값이라면 o1 객체 앞쪽
 *   			
 */
class Data1 implements Comparable<Data1> {
	int value;
	Data1(int value) {
		this.value = value;
	}
	public String toString() {
		return "["+value+"]";
	}
	@Override
	public int compareTo(Data1 o) { // Comparable 구현부
		return value-o.value; // 음수: 현재객체가 더 앞쪽, 양수: 현재객체가 더 뒷쪽
	}
}
class Data2 {
	int value;
	Data2(int value) {
		this.value = value;
	}
	public String toString() {
		return "("+value+")";
	}
}
public class ListEx3 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("a"); list1.add("c"); list1.add("d");
		list1.add("b"); list1.add("f");
		System.out.println(list1);
		
		// Collections 클래스: Collection 객체의 보조기능 담당
		Collections.sort(list1); // 정렬
		System.out.println(list1);
		Collections.sort(list1,Comparator.reverseOrder()); // 역순으로 정렬
		System.out.println(list1);
		
		// 사용자클래스의 객체를 정렬
		List<Data1> list2 = new ArrayList<>();
		list2.add(new Data1(3));
		list2.add(new Data1(1));
		list2.add(new Data1(2));
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);		
		Collections.sort(list2,Comparator.reverseOrder());
		
		List<Data2> list3 = new ArrayList<>();
		list3.add(new Data2(3));
		list3.add(new Data2(1));
		list3.add(new Data2(2));
		System.out.println(list3);
		Comparator<Data2> c = new Comparator<>() { // 정렬방식 지정
			@Override
			public int compare(Data2 o1, Data2 o2) {
				return o1.value - o2.value; // 음수 리턴시 o1 객체가 앞쪽, 양수 리턴시 o2 객체가 앞쪽
			}
		};
		Collections.sort(list3, c); // c객체가 설정된 방식으로 정렬
		System.out.println(list3); // 오름차순 정렬
		
		// Comparator를 람다식으로 구현
		Collections.sort(list3,(o1,o2)->o2.value-o1.value); // c객체가 설정된 방식으로 정렬
		System.out.println(list3); // 오름차순 정렬
	}
}
