package chap10;
/*
 * 예외처리 생략 가능 예외클래스 생성
 */
// RuntimeException은 예외처리를 생략할 수 있음
class MyException extends RuntimeException {
	MyException(String msg) {
		super(msg);
	}
}
public class ExceptionEx7 {
	public static void main(String[] args) {
		throw new MyException("사용자 예외 발생");
	}
}
