package test0412;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
다음 결과가 나오도록 프로그램을 작성하시오
 1 ~ 1000번까지의 번호를 가지는 복권이 있다.
 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.

  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성
  
  [결과]
3등 복권 추첨합니다.
945
123
6
2등 복권 추첨합니다.
611
404
1등 복권 추첨합니다.
797
*** 복권 추첨 결과 *** <- 여기는 정렬
1등:797,
2등:404,611,
3등:6,123,945,  
 */
public class Test1 {
	public static void main(String[] args) {
		Set<Integer> lotto = new LinkedHashSet<>();
		Random r = new Random();
		r.setSeed(System.currentTimeMillis());	
		
		while (lotto.size()<6) {
//			lotto.add(r.nextInt(1000)+1);
			if (lotto.size() == 0) // 추첨번호없음. 3등부터 추첨
				System.out.println("3등 복권 추첨합니다.");
			else if (lotto.size() == 3) // 2등부터 추첨
				System.out.println("2등 복권 추첨합니다.");
			else if (lotto.size() == 5) // 1등 추첨
				System.out.println("1등 복권 추첨합니다.");
			int num = r.nextInt(1000) + 1; 
//			boolean Set.add: 추가될 때만 true
			if (lotto.add(num)) { // set에 추가된 경우만 화면에 출력
				System.out.println(num);
			}
		}
//		System.out.println(lotto);
		
		
		List<Integer> list = new ArrayList<>(lotto); // Set을 List로 변환
		for(int i=list.size()-1;i>=0;i--) { // 역순 출력(1등부터 출력)
			if(i == list.size()-1)
				System.out.println("1등:" + list.get(i));
			else if (i == list.size()-2)
				System.out.print("2등:" + list.get(i) + ",");
			else if (i< list.size()-2 && i>=3)
				System.out.print(list.get(i) + ",");
			else if(i==2) 
				System.out.print("\n3등:" + list.get(i)+ ",");
			else
				System.out.print(list.get(i)+ ",");
		}
		
//		List<Integer> third = list.subList(0, 3);
//		List<Integer> second = list.subList(3, 5);
//		int first = list.get(5);
		
//		System.out.println("3등 복권 추첨합니다.");
//		for (Integer i:third) {
//			System.out.println(i);
//		}
//		System.out.println("2등 복권 추첨합니다.");
//		for (Integer i:second) {
//			System.out.println(i);
//		}
//		System.out.println("1등 복권 추첨합니다.");
//		System.out.println(first);
		
//		Collections.sort(third);
//		Collections.sort(second);
//		System.out.println("*** 복권 추첨 결과 ***");
//		System.out.print("1등:"+first+"\n");
//		System.out.print("2등:");
//		for (Integer i:second) {
//			System.out.print(i+",");
//		}
//		System.out.print("\n3등:");
//		for (Integer i:third) {
//			System.out.print(i+",");
//		}
/*
 * *** 복권 추첨 결과 *** <- 여기는 정렬
	1등:797,
	2등:404,611,
	3등:6,123,945,  	
 */
	}
}
