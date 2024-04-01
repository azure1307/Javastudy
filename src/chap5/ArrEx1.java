package chap5;

public class ArrEx1 {
	public static void main(String[] args) {
		//1. 배열의 선언. 참조변수 선언
		int arr[];
		//2. 배열 객체의 생성
		arr = new int[5]; //new 키워드로 객체 생성과 동시에 각 공간의 값에 0으로 초기화
		/*
		 * new 키워드
		 * 1. 객체 생성: int값 5개를 저장할 수 있는 변수 할당. length 상수값 설정
		 * 2. 기본값으로 초기화
		 * 		숫자: 0
		 * 		boolean: false
		 * 		그외: null 
		 */
		//3. 배열값의 초기화. index로 접근. index는 0부터 시작
		arr[0] = 10;
		arr[1] = 20;
		//4. 배열값 조회
		//arr.length: 배열값의 갯수 저장
		for (int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println();
		//보통은 선언과 동시에 객체 생성
		int arr2[] = new int[3];
		arr2[0] = 100;
		arr2[1] = 200;
		for (int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("// arr2 = arr 이후 //");

		arr2 = arr;
		for (int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println();
		
		arr[3] = 500;
		for (int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		
		//for Each 문
		//인덱스 사용안됨: 요소의 값만 조회
		//인덱스가 필요할 경우 기존 for문으로 구현해야 함
		System.out.println("for Each로 조회");
		for (int a:arr) {
			System.out.print(a + ", ");
		}
	}

}
