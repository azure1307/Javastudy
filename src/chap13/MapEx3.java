package chap13;

import java.util.Comparator;
import java.util.TreeMap;
/*
 * TreeMap : Key 값으로 정렬됨. 따라서 Comparable 구현되어있어야 함
 */
public class MapEx3 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
//		SortedMap<Integer, String> scores = new TreeMap<Integer, String>();
		// Key 역순으로 정렬
//		TreeMap<Integer, String> scores = new TreeMap<Integer, String>
//											(Comparator.reverseOrder());
		scores.put(87, "홍길동"); scores.put(98, "이몽룡");
		scores.put(75, "임꺽정"); scores.put(94, "김삿갓");
		scores.put(80, "성춘향"); scores.put(88, "향단이");
		System.out.println(scores);
		
		System.out.println("첫번째 key:"+scores.firstKey());
		System.out.println("첫번째 entry:"+scores.firstEntry()); // Map.Entry 객체
		System.out.println("최저 점수를 받은 사람:"+scores.get(scores.firstKey()));
		System.out.println("최저 점수를 받은 사람:"+scores.firstEntry().getValue());
		
		System.out.println("마지막 key:"+scores.lastKey());
		System.out.println("마지막 entry:"+scores.lastEntry());
		System.out.println("최고 점수를 받은 사람:"+scores.get(scores.lastKey()));
		System.out.println("최고 점수를 받은 사람:"+scores.lastEntry().getValue());
		System.out.println();
		
		System.out.println("94점 앞 점수:"+scores.lowerEntry(94));
		System.out.println("94점 뒤 점수:"+scores.higherEntry(94));
		System.out.println("94점 포함 앞 점수:"+scores.floorEntry(94));
		System.out.println("94점 포함 뒤 점수:"+scores.ceilingEntry(94));
	}
}
