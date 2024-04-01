package chap5;
/*
 * str 문자열 내에 각 소문자의 갯수를 출력하기
 * 1. 소문자의 갯수만 조회(숫자는 건너뜀)
 * 2. 갯수가 1이상인 데이터만 출력하기
 * 3. 갯수만큼 * 출력하기
 * [결과]
 * a:4개 => ****
 * b:3개 => ***
 * ...
 * z:0개 => 
 */
public class Exam3 {
	public static void main(String[] args) {
		String str = "aaabbb123ssstttuuuaaaqqqzzzzzzz";
		int[] cnt = new int[26]; //cnt[0]에는 a의 갯수, cnt[25]에는 z의 갯수
		for (int i=0;i<str.length();i++) { //문자열의 길이만큼 반복
			char ch = str.charAt(i);	//문자열에서 각 문자를 ch 변수에 대입
			if (ch >= 'a' && ch <= 'z') {
				//ch가 a일경우 ch[0]이 1 늘어나서 1됨,
				//ch가 또 a일경우 ch[0]이 1 늘어나서 2됨,
				//ch가 b일경우 ch[1]이 1 늘어나서 1됨
				//...
				cnt[ch-'a']++;
			}
		}
		
		for (int i=0;i<cnt.length;i++) {
			if (cnt[i]>0) {		//알파벳이 있는 경우에만 출력
				//(char)('a'+i) = 알파벳, cnt[i] = 알파벳의 갯수
				System.out.print((char)('a'+i)+":"+cnt[i]+"개 => ");
				 for (int j=0;j<cnt[i];j++) {	//알파벳의 갯수만큼만 * 출력해야 하니까 0부터 cnt[i]까지
					 System.out.print("*");
				 }
				 System.out.println();
			}
		}
	
	}

}
