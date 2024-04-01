package chap5;
/*
 * 배열의 선언,생성,초기화
 */
public class ArrEx2 {
	public static void main(String[] args) {
		
		//배열의 선언,생성,초기화를 한 번에
		int[] arr = {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		
		//배열의 생성,초기화
		//인덱스 쓰면 안됨
		arr = new int[]{100,200,300};
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
}
