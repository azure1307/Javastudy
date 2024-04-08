package chap11;
/*
 * StringBuilder 주요 메서드
 * - String은 메서드를 실행할 때마다 새로운 객체를 만들지만
 *   StringBuilder는 메서드를 실행할 때마다 이미 생성한 객체를 바꾼다
 */
public class StringBuilderEx2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc").append(123).append('A').append(false);
		System.out.println("sb.delete() 실행전 : "+sb);
//		System.out.println(sb);
		
		// a,b -> a부터 b-1까지
		sb.delete(2, 4);
		System.out.println("sb.delete() 실행후 : "+sb);		
//		System.out.println(sb);
		
		// 4번 인덱스에 있는 글자 삭제
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		// 5번 인덱스부터 == 추가
		sb.insert(5, "==");
		System.out.println(sb);
		System.out.println();
		
		sb = new StringBuilder("ABCDEFG");
		// a,b,"abc" -> a부터 b-1까지 "abc"로 변경
		sb.replace(0, 3, "abc");
		System.out.println(sb);
		
		// 거꾸로
		sb.reverse();
		System.out.println(sb);
	}
}
