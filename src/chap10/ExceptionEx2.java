package chap10;
/*
 * 다중 catch 구문
 *   - 한 개의 try 블럭에 여러개의 catch 블럭 존재
 *     => try 블럭에서 발생되는 예외 종류에 따라 다른 예외처리가 가능함
 *   - 상위 예외 클래스(Exception)은 catch 구문의 하단에 배치해야함 
 *     
 * 예외클래스 계층
 *     Throwable > Error
 *     			   Exception > RuntimeException > ArithmeticException
 *     						   그 외 Exception	  ArrayIndexOutOfBoundsException
 *     											  ...
 * Exception 중 RuntimeException(하위 클래스 포함)만 예외처리 생략 가능
 * 그외 Exception은 예외처리 필수
 *     			   
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		System.out.println(1); //try 블럭 외부의 예외발생은 catch 구문이 처리 못함
		try {
			System.out.println(2);
			
//			System.out.println(3/0); // ArithmeticException 예외발생
			System.out.println(3);
			
			System.out.println(args[0]); // ArrayIndexOutOfBoundsException 예외발생
			
			// int Integer.parseInt(문자열): 입력받은 문자열을 정수형으로 바꿔 출력
//			System.out.println(Integer.parseInt("123")); // 123 출력 
//			System.out.println(Integer.parseInt("abc")); // NumberFormatException 예외발생
			
			String str = null;
			System.out.println(str.trim()); // NullPointerException 예외발생
			System.out.println(4);
		} catch (ArithmeticException e) { 
			System.out.println("0으로 나누지 마세요");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Command 라인에 파라미터를 입력하세요");
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요");
		} catch (Exception e) {
			e.printStackTrace(); // 예외가 발생된 history를 출력
			System.out.println("전산부로 전화하세요, msg = "+e.getMessage());
		}
		System.out.println(5);
	}
}
