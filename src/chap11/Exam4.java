package chap11;
// 숫자들의 합을 계산하기
public class Exam4 {
	public static void main(String[] args) {
		String str = "1.5,20.3,30,40,50";
		String[] strarr = str.split(",");
		double sum = 0;
		for (int i=0;i<strarr.length;i++) {
			// trim()으로 공백 제거
			sum += Double.parseDouble(strarr[i].trim());
		}
		System.out.println(sum);		
	}
}
