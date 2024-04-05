package chap11;
/*
 * delChar(원본문자열, 삭제대상문자열모임)
 *   => 원본문자열에서 삭제대상문자열에 속한 문자를 제거하고, 나머지만 출력하기
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)","~!@#$%^&*()")); // 12345
		System.out.println(delChar("(1!2@3^4~5)","12345")); // !@^~
		System.out.println(delChar2("(1!2@3^4~5)","~!@#$%^&*()")); // 12345
		System.out.println(delChar2("(1!2@3^4~5)","12345")); // !@^~
	}

	private static String delChar2(String s1, String s2) {
		String s = "";
		for (int i=0;i<s1.length();i++) {
			
			// String.charAt(index) : 문자열의 index에 해당하는 부분을 char로 변환
			char ch = s1.charAt(i); // s1을 한 자씩 떼서 ch에 저장
			// contains(String): 포함. 매개변수가 String 타입이라 ch에 "" 더해서 형변환
			if (!s2.contains(ch+"")) { //s2가 ch를 갖고있지 않을때만 s에 저장
				s += ch;
			}
		}
		return s;
	}

	private static String delChar(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<s1.length();i++) { // s1.length()만큼 반복
			
			// String.charAt(index) : 문자열의 index에 해당하는 부분을 char로 변환
			char ch = s1.charAt(i); // s1을 한 자씩 떼서 ch에 저장
			
			// indexOf : 특정 문자 위치 찾기
			if(s2.indexOf(ch)<0) { // index값이 -1: 해당하는 문자 없으면 sb에 한 글자씩 저장
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
