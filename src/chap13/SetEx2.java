package chap13;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * 객체의 중복판단
 * 1. equals(): true
 * 2. hashcode(): 동일
 * => 1과 2의 조건을 모두 만족해야 중복. => 오버라이딩 필요
 * 
 */
class Person {
	String name;
	int age;
	Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name+":"+age;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+10;
	}
	@Override
	public boolean equals(Object obj) { // 중복 판단 기준 작성
		// Person 객체면 값 비교, Person 객체도 아니면 무조건 false
		if (obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && age == p.age;
		} else {
			return false;
		}
	}
}
public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new String("abc"));
		// Set.add가 A.equals(B), A.hashcode()값과 B.hashcode()값 비교 후 둘 다같으면 중복판단 
		set.add(new String("abc")); // 중복 판단
		set.add(new Person("홍길동",10));
		set.add(new Person("홍길동",10)); // 중복이라 판단하지 않음
//		Person p = new Person("홍길동",10);
//		set.add(p);
//		set.add(p);
		System.out.println(set);
		
		// StringBuffer, StringBuilder는 equals()를 오버라이딩 하지않음
		// 따라서 논리적 동등을 따질 때는 String 클래스로 변경 후 중복판단해야함
		set.add(new StringBuffer("abcd"));
		set.add(new StringBuffer("abcd"));
		System.out.println(set);
		set.add(new StringBuilder("abcde").toString());
		set.add(new StringBuilder("abcde").toString());
		System.out.println(set);
	}
}
