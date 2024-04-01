package chap4;
/*
 * switch문
 * 조건값: 정수형, 문자열만 가능
 * 1. switch (조건값) {
 * 		case 값1: 문장1;
 *		case 값2: 문장2;
 *		…
 *		default: 그외문장;
 *    }
 * 2. break 키워드: switch문 종료
 * 3. switch문의 case 값 아래로는 중괄호 필요x, 내용 비워둬도 됨
 */
public class SwitchEx1 {
	public static void main(String[] args) {
		int score = 100;
		String result = null;
		switch(score/10) { //100이면 10, 9n대면 9, 8n대면 8, … 소숫점 2자리는 100 곱해서 int 만들고 /100 
		case 10:
		case 9:	result="A학점"; break;
		case 8: result="B학점"; break;
		case 7: result="C학점"; break;
		case 6: result="D학점"; break;
		default: result="F학점";
		}		
		System.out.println(score + ":" + result);

		//60점 이상이면 pass, 미만이면 fail 출력
		switch(score/10) { 
		case 10:
		case 9:	
		case 8: 
		case 7: 
		case 6: result="pass"; break;
		default: result="fail"; break;
		}
		System.out.println(score + ":" + result);
	}
}
