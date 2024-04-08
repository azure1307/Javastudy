package test0408;
/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬) 
 *      길이보다 길면 substring 이용    
[결과]
가나다    /
  가나다  /
    가나다/
가나/
 
 */

public class Test1 {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 0));
	}

	private static String format(String str, int len, int align) {
		StringBuilder sb = new StringBuilder();
		int cha = Math.abs(len-str.length());
		String sb2 = null;
		if (str.length() < len) {
			if (align == 0) {
				sb.append(str);
				for (int i=0;i<cha;i++) {
					sb.append(" ");
				}
			} else if (align == 1) {
				for (int i=0;i<cha/2;i++) {
					sb.append(" ");
				}
				sb.append(str);
				for (int i=0;i<cha/2;i++) {
					sb.append(" ");
				}
			} else if (align == 2) {
				for (int i=0;i<cha;i++) {
					sb.append(" ");
				}
				sb.append(str);
			}
			sb2 = sb.toString();
		} else if (str.length() > len) {
			// 0번 인덱스부터 len-1 인덱스까지
			sb2 = str.substring(0, len);
		} 
		return sb2;
	}
}
