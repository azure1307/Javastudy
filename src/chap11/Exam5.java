package chap11;
/*
 * matches는 지정한 패턴과 일치?
 * find는 문자열에서 지정한 패턴을 검색
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 점수의 합과 평균 출력하기
public class Exam5 {
	public static void main(String[] args) {
		String data = "번호:10,이름:홍길동,국어:100,영어:70,수학:85,과학:95,사회:90";
		// 찾고싶은 값의 패턴만 정하면 됨
		String scorePattern = "\\d{1,3}";
		Pattern p = Pattern.compile(scorePattern);
		//,의 인덱스를 찾아서 1 더한 그 위치부터 추출
		Matcher m = p.matcher(data.substring(data.indexOf(",")+1));
		int cnt = 0, sum = 0;
		System.out.println("===점수===");
		while (m.find()) {
			cnt++;
			//첫 데이터(번호에 해당)일 경우 제외하고 진행
//			if (cnt == 1) continue;
			System.out.print(m.group()+",");
			sum += Integer.parseInt(m.group());
		}		
		System.out.println();
		System.out.println(cnt-1+"과목의 합:"+sum+", 평균:"+((double)sum/cnt));
	}
}
