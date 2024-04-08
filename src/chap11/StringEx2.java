package chap11;
/*
 * String 클래스의 주요 메서드
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		
		// charAt(4): 문자열에서 4번 인덱스(5번째)의 문자 리턴
		System.out.println("s.charAt(4) : "+s.charAt(4)); // E
		
		/*
		 * s.compareTo(문자열): 정렬에 사용되는 메서드. 둘을 비교해서 아스키값의 차이를 반환함
		 * 			결과 양수: s문자열이 뒷쪽
		 * 			결과 음수: s문자열이 앞쪽  
		 */
		// 정렬시 ABCDEFGH가 abc보다 앞쪽에 있다(대문자 먼저)
		System.out.println("s.compareTo(\"abc\") : "+s.compareTo("abc"));
		System.out.println("s.compareTo(\"AAA\") : "+s.compareTo("AAA"));
		
		// s.compareToIgnoreCase(문자열): 대소문자 상관없이 정렬
		// 근데 비교하려는 문자랑 기존 문자가 포함관계일 경우 길이 차이 출력
		System.out.println("s.compareToIgnoreCase(\"abc\") : "+s.compareToIgnoreCase("abc"));
		
		// s.endsWith(문자열): s 문자열의 끝이 GH로 끝나는지 boolean으로 리턴
		System.out.println("s.endsWith(\"GH\") : "+s.endsWith("GH"));

		// s.startsWith(문자열): s 문자열이 AB로 시작하는지 boolean으로 리턴
		System.out.println("s.startsWith(\"AB\") : "+s.startsWith("AB"));
		
		// s.equals(문자열): s 문자열이 "ABCDEFG" 와 같은지 여부
		System.out.println("s.equals(\"ABCDEFGH\"): " +s.equals("ABCDEFGH"));

		// s.equalsIgnoreCase(문자열): s 문자열이 대소문자 구분없이 "abcdefg"와 같은지 여부
		System.out.println("s.equalsIgnoreCase(\"ABCDEFGH\"): " +s.equalsIgnoreCase("abcdefg"));
		
		//s.getBytes: s 문자열을 byte형 배열로 리턴
		byte[] barr = s.getBytes();
		for (byte b:barr) {
			// String을 byte 값으로 바꾼걸 char로 바꿔서 출력
			System.out.print((char)b+", ");
		}
		System.out.println();
		
		char[] carr = s.toCharArray();
		for (char c:carr) {
			// String을 char로 바꿔서 출력
			System.out.print(c);
		}
		System.out.println();
		
		s = "This is a String";
		// s.indexOf('i'): i문자의 인덱스값 리턴. 없는 문자는 -1 리턴
		System.out.println("s.indexOf('i') : "+s.indexOf('i')); // 2
		System.out.println("s.indexOf('Q') : "+s.indexOf('Q')); // -1. 없는 문자
		System.out.println("s.indexOf(\"is\") : "+s.indexOf("is")); // 2
		
		// s.indexOf('i',3): 3번 인덱스 이후의 i문자의 인덱스값 반환
		System.out.println("s.indexOf('i',3) : "+s.indexOf('i',3)); // 5. 인덱스는 처음부터 셈
		
		// s.lastIndexOf('i'): i문자가 마지막으로 나타나는 인덱스 리턴
		System.out.println("s.lastIndexOf('i') : "+s.lastIndexOf('i')); // 13
		
		// 문자열의 길이
		System.out.println("s.length() : " + s.length()); // 16
		
		// 문자열의 치환. replace와 replaceAll의 차이는 정규식 사용 여부
		System.out.println("s.replace('is','QR') : "+s.replace("is","QR"));
		System.out.println("s.replaceAll('is','QR') : "+s.replaceAll("is","QR"));
		
		// 부분문자열
		// s.substring(5): 5번 인덱스 이후 부분문자열
		System.out.println("s.substring(5) : "+s.substring(5));
		// s.substring(5,13): 5번 인덱스부터 12번 인덱스까지 이후 부분문자열. (a,b)일 때 a부터 b-1까지
		System.out.println("s.substring(5,13) : "+s.substring(5,13));
		
		// 대소문자변경
		System.out.println("s.toUpperCase() : "+s.toUpperCase());
		System.out.println("s.toLowerCase() : "+s.toLowerCase());
		
		// 공백 제거
		s = "   문자열 trim method   ";
		System.out.println("s.trim() : "+s.trim());
		
		// , 기준으로 문자열 분리
		s = "홍길동,이몽룡,김삿갓";
		String[] arr = s.split(",");
		for (String a:arr) System.out.print(a+" ");
		System.out.println();
		System.out.println("");
		}	
}