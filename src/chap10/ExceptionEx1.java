package chap10;
/*
 * 예외처리: 발생된 예외를 정상화하는 기능
 *    try 블럭
 *      - try {...}					=> 예외가 발생할 가능성이 있는 구문
 *        catch(예외타입 참조변수) {...}	=> 예외가 발생했을 때 호출되는 블럭
 *        final {...}				=> 정상이든 예외든 꼭 실행하는 블럭
 *      - throws 선언: 호출한 메서드로 전송
 * 예외발생: 정상적인 상태를 예외 상태로 변환
 *      - throw 구문: 예외 강제 발생 
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		try { //예외가 발생할 가능성이 있는 구문
			System.out.println(10/0); // ArithmeticException 예외발생가능
			System.out.println(args[0]); // ArrayIndexOutOfBoundsException 예외발생가능
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터값을 입력하세요.");
		}
	}
}
