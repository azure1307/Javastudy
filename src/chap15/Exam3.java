package chap15;

import java.util.Arrays;
import java.util.List;

class Member {
	private String name;
	private int gender; // 1:남, 2:여
	private int age;
	public Member(String name, int gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
}
public class Exam3 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동",1,30), new Member("장옥정",2,20),
				new Member("이몽룡",1,45), new Member("성춘향",2,27));
		System.out.println("남자나이의 평균 출력하기");
		System.out.println("여자나이의 평균 출력하기");
		System.out.println("남자회원의 이름 출력하기");
		System.out.println("여자회원의 이름 출력하기");
	}

}
