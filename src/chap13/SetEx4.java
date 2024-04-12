package chap13;

import java.util.Comparator;
import java.util.TreeSet;
/*
 * 
 */
class PhoneNo {
	String name;
	int number;
	public PhoneNo(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return name+":"+number;
	}
	
}
public class SetEx4 {
	public static void main(String[] args) {
		// 이름 순으로 정렬 설정
		Comparator<PhoneNo> c = new Comparator<>() {
			@Override
			public int compare(PhoneNo p1, PhoneNo p2) {
				return p1.name.compareTo(p2.name);
			}
		};
//		TreeSet<PhoneNo> set = new TreeSet<>(c);
		// 이름 순으로 정렬 설정을 람다방식으로 설정
		TreeSet<PhoneNo> set = new TreeSet<>((p1,p2)->p1.name.compareTo(p2.name));
		set.add(new PhoneNo("홍길동",1234));
		set.add(new PhoneNo("김삿갓",2345));
		set.add(new PhoneNo("이몽룡",3456));
		System.out.println(set);
		
		// 이름 역 순으로 정렬 설정을 람다방식으로 설정
//		TreeSet<PhoneNo> set2 = new TreeSet<>((p1,p2)->(p1.name.compareTo(p2.name))*(-1));
		TreeSet<PhoneNo> set2 = new TreeSet<>((p1,p2)->(p2.name.compareTo(p1.name)));
		set2.add(new PhoneNo("홍길동",1234));
		set2.add(new PhoneNo("김삿갓",2345));
		set2.add(new PhoneNo("이몽룡",3456));
		System.out.println(set2);

		// 전화번호 순으로 정렬 설정을 람다방식으로 설정
		TreeSet<PhoneNo> set3 = new TreeSet<>((p1,p2)->(p1.number-p2.number));
		set3.add(new PhoneNo("홍길동",1234));
		set3.add(new PhoneNo("김삿갓",2345));
		set3.add(new PhoneNo("이몽룡",3456));
		System.out.println(set3);

		// 전화번호 역순으로 정렬 설정을 람다방식으로 설정
		TreeSet<PhoneNo> set4 = new TreeSet<>((p1,p2)->(p2.number-p1.number));
		set4.add(new PhoneNo("홍길동",1234));
		set4.add(new PhoneNo("김삿갓",2345));
		set4.add(new PhoneNo("이몽룡",3456));
		System.out.println(set4);
	}
}
