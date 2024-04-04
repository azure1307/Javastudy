package chap10;
/*
 * throws	: 예외처리. (전달)
 * throw	: 예외발생
 */
public class ExceptionEx5 {
	// main()의 throws는 JVM으로 전달
	public static void main(String[] args) throws Exception {
		first();
	}

	// throws는 first()를 호출한 main()으로 전달
	private static void first() throws Exception {
		second();
	}

	// throws는 second()를 호출한 first()로 전달
	private static void second() throws Exception {
		// InterruptedException은 그 외 Exception임: 예외처리 생략 불가
		Thread.sleep(10); // InterruptedException 예외처리가 필요한 메서드
		
		// 예외객체(new Exception) 생성
		// throw로 JVM에게 예외객체 생성 통지
		throw new Exception("예외 강제 발생"); //내가 입력한 메시지로 예외 발생
	}

}
