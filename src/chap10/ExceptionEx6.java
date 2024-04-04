package chap10;

/*
 * 사용자 예외 클래스 구현
 */
class LoginFailException extends Exception {
	LoginFailException(String msg) {
		super(msg);
	}
}

public class ExceptionEx6 {
	public static void main(String[] args) {
		String id = "hong1";
		String pw = "1234";
		try {
			if (!id.equals("hong") || !pw.equals("1234")) {
				throw new LoginFailException("아이디 또는 비밀번호가 틀립니다.");
			}
			System.out.println("반갑습니다. " + id + " 님이 로그인 하셨습니다.");
		} catch (LoginFailException e) {
			System.out.println(e.getMessage());
		}
	}
}
