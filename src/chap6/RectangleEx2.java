package chap6;
/*
 * Rectangle2 클래스를 이용하여
 * 가로,세로 길이가 20~30 사이인 임의의 길이를 가진 사각형 5개 생성
 * 생성된 5개의 사각형의 정보를 출력하기
 * 전체 사각형의 넓이의 합과 둘레의 합 출력하기
 */
public class RectangleEx2 {
	public static void main(String[] args) {
		//Rectangle 객체를 5개 만든게 아님!!
		//Rectangle 변수를 저장할 참조변수 5개를 배열로 만든거임. 객체는 또 따로 만들어줘야함
		Rectangle2[] arr = new Rectangle2[5];
		int totArea = 0, totLen = 0;
		for (int i=0;i<arr.length;i++) {
			arr[i] = new Rectangle2();
			/*
			 * 0 <= Math.random()*11 < 11.0
			 * 0 <= (int)(Math.random()*11) <= 10
			 * 20 <= (int)(Math.random()*11)+20 <= 30 //20~30사이인 임의의 수
			 */
			arr[i].width = (int)(Math.random()*11)+20;
			arr[i].height = (int)(Math.random()*11)+20;
			arr[i].sno = ++Rectangle2.cnt; //사각형 번호
			System.out.println(arr[i]); //toString() 메서드 호출
			totArea += arr[i].area(); //넓이의 합
			totLen += arr[i].length(); //둘레의 합
		}
		System.out.println("전체 사각형의 넓이의 합:" + totArea);
		System.out.println("전체 사각형의 둘레의 합:" + totLen);
	} 

}
