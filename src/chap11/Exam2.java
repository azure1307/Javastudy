package chap11;
/*
 * count 메서드 구현하기
 * count("문자열","찾는문자열"): 문자열에서 찾는문자열의 갯수를 리턴
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB45AB12","12"));	// 2
		System.out.println(count("12345AB12AB45AB","AB"));	// 3
		System.out.println(count("12345","AB"));			// 0
	}
	
	public static int count(String s1, String s2) {
		int[] arr = new int[s1.length()];
		int cnt = 0, index = 0;
		while (s1.indexOf(s2,index)!=-1) {
			arr[cnt++] = s1.indexOf(s2,index);
			index = s1.indexOf(s2,index)+1;
		}	
//		while (true) {
//			// s2에서 index가 어디에 있는지 찾고, 다음 반복에서는 찾은 부분부터 찾기
//			index = s1.indexOf(s2,index); 
//			// 값을 못찾을 때
//			if (index < 0) {
//				break;
//			}
//			// 값을 찾았을 때
//			cnt++;
//			index++;
//		}
		return cnt;
	}
}
