package chap10;
/*
 * throws: 예외처리.
 * 		   발생된 예외를 호출한 메서드로 예외 전달
 */
public class ExceptionEx4 {
	public static void main(String[] args) throws RuntimeException {
		System.out.println("main 메서드 실행");
		try {
			first();
		} catch (NumberFormatException e) {
			System.out.println("main 메서드에서 예외처리함");
			// 다시 예외 발생
			throw e;
		}
	}
	private static void first() throws RuntimeException {
		System.out.println("first 메서드 실행");
		second();
	}
	
	//throws RuntimeException은 생략 가능
	private static void second() throws RuntimeException {
		System.out.println("second 메서드 실행");
		
		// second()에서 예외발생시 second()를 호출한 first()에게 예외 넘김
		// first()에서 예외발생시 first()를 호출한 main()에게 예외 넘김
		// main()에서 예외발생시 catch 구문 실행
//		int num = Integer.parseInt("abc");
//		System.out.println(num);
		
		try {
			int num = Integer.parseInt("abc");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("second 메서드에서 예외처리함");
			// second()에서 예외처리 후 다시 예외 발생
			// throws RuntimeException 타고 main()까지 올라가서 main()의 catch에서 처리
			throw e;
		}
	}
}