package chap13;

import java.util.Random;
import java.util.TreeSet;

/*
 * Lotto 번호
 * 1. 중복되지않는 1에서 45 사이의 숫자 6개 선택
 * 2. 선택된 숫자를 정렬하여 출력하기
 * 
 * => TreeSet 클래스를 이용하여 1에서 45 사이의 임의의 수 6개를 선택하여 정렬
 */
public class Exam3 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		/*
		while (set.size()<6) {
			set.add((int)(Math.random()*45)+1);
		}
		*/
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		while (set.size()<6) {
			set.add(rand.nextInt(45)+1);
		}
		System.out.println(set);
	}
}
