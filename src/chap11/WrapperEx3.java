package chap11;
/*
 * Character 클래스
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		char[] data = {'A', 'a', '1', '&', '가'};
		for (char c:data) {
			if (Character.isUpperCase(c)) {
				System.out.println(c+":대문자");
			}
			if (Character.isLowerCase(c)) {
				System.out.println(c+":소문자");
			}
			if (Character.isDigit(c)) {
				System.out.println(c+":숫자");
			}
			if (Character.isAlphabetic(c)) {
				System.out.println(c+":문자");
			} else {
				System.out.println(c+":기타문자");
			}
		}
	}

}
