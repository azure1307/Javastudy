package chap13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 화면에서 홀수개의 숫자를 입력받고, 입력받은 숫자의 평균과 중간값을 출력하기
 * [결과]
 * 홀수개의 숫자를 입력하세요(종료:999) => 짝수개를 입력한 경우 마지막 숫자 제거하기
 * 10 40 20 60 30 999
 * 평균: 전체합/갯수
 * 중간값: 데이터를 정렬하여 가운데값
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("홀수개의 숫자를 입력하세요(종료:999)");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		while (true) {
			// 먼저 999일 경우 break;하고 list에 추가하면 999빼고 입력됨. 999를 제거하는과정 안써도됨
//			if (sc.nextInt()==999) break;
//			list.add(sc.nextInt());
			list.add(sc.nextInt()); 
			if (list.get(list.size()-1) == 999) {
				list.remove(list.size()-1);
				break;
			}
		}
		if (list.size()%2==0) {
			list.remove(list.size()-1);
		}
		
		// for (Integer i:list) sum+=i; 개선된 for문 사용
		for (int i=0;i<list.size();i++) {
			sum += list.get(i);
		}
		System.out.printf("평균:%.2f\n",(double)sum/list.size());
		System.out.println("정렬 전 리스트 출력"+list);
		Collections.sort(list);
		System.out.println("중간값:"+list.get(list.size()/2));
		System.out.println("정렬 후 리스트 출력"+list);
	}
}
