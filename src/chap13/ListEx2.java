package chap13;

import java.util.List;
import java.util.Vector;

/*
 * Vector 클래스
 *   - Collection 프레임워크 이전의 클래스
 *   - List 인터페이스의 구현 클래스
 *   - 구버전 메서드와 List 인터페이스의 메서드가 공존함
 *   
 * List 인터페이스 객체 특징
 *   - 추가(add)한 순서 유지
 *   - 인덱스(첨자) 사용 가능
 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
//		List<Double> list = new Vector<>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0); // 구버전 메서드. List.add와 동일한 기능
		System.out.println(list);
		
		// indexOf(): 요소의 위치 찾기
		double num = 5.0;
		int index = list.indexOf(num);
		if (index < 0) {
			System.out.println(num+"은 list의 요소가 아닙니다."+index);
		} else {
			System.out.println(num+"의 위치:"+index);
		}
		
		// contains(): 요소가 존재하는지 확인
		if (list.contains(num)) {
			System.out.println(num+"은 list의 요소임");
		} else {
			System.out.println(num+"은 list의 요소가 아님");
		}
		
		// remove(): 요소 제거 & 제거한 값 리턴
		// remove(Object): 요소값을 제거
		// remove(int): 인덱스에 해당하는 요소값을 제거
		// 모든 내용을 지우고 싶을때 0번을 계속 지워도 됨
		System.out.println(list.get(0)); // 0번 인덱스에 있는 값. 0.3
		list.remove(0.3);
		System.out.println(list);
		System.out.println(list.get(0)); // 0번 인덱스에 있는 값. Math.PI. 값의 위치가 앞으로 땡겨짐
		
		System.out.println(list.remove(0)); // Math.PI. 0번 인덱스에 있는값을 지우고 지운값 반환
	}
}
