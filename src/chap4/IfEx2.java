package chap4;
/*
 * 중첩 if 구문: if문 안에 if문이 존재
 */
public class IfEx2 {
	public static void main(String[] args) {
		int score = 49;
		if (score >= 60) {
			System.out.println("합격입니다.");
			if (score >= 80) {	//80미만일 경우 출력하지 않고 통과
				System.out.println("좋은 성적입니다.");
			}
		} else {
			System.out.println("불합격입니다.");
			if (score <= 50) {
				System.out.println("더욱 노력하세요.");
			}
		}

	}

}
