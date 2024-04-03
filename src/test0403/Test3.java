package test0403;
/*
 * 
 * LambdaInterface3 인터페이스의 함수 객체와 
 * 인터페이스를 사용한 calc 함수 구현하기
 * [결과]
 * 두수 (5,2)의 합:7
 * 두수 (5,2)의 곱:10
 * arr 배열의 최대값:10
 * arr 배열의 최소값:1
 */
interface LambdaInterface3 {
	//int값 2개 입력받고, int값 리턴
	int method(int x, int y);
}
public class Test3 {
	public static void main(String[] args) {
		LambdaInterface3 f;
		f = (x,y) -> x+y;
		System.out.println("두수 (5,2)의 합:" + calc(5,2,f));//7
		f = (x,y) -> x*y;
		System.out.println("두수 (5,2)의 곱:" + calc(5,2,f));//10
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		f = (x,y) -> {
			x = 0;
			for (y=0;y<arr.length;y++) {
				if (arr[y] > x) {
					x = arr[y];
				}
			}
			return x;
		};
//		f = (x,y) -> {
//			int max = 0;
//			for (int i=0;i<arr.length;i++) {
//				if (arr[i] > max) {
//					max = arr[i];
//				}
//			}
//			return max;
//		};
		System.out.println("arr 배열의 최대값:" + calc(arr,f));//10
		
		f = (x,y) -> {
			x = 10;
			for (y=0;y<arr.length;y++) {
				if (arr[y] < x) {
					x = arr[y];
				}
			}
			return x;
		};
//		f = (x,y) -> {
//			int min = 10;
//			for (int i=0;i<arr.length;i++) {
//				if (arr[i] < min) {
//					min = arr[i];
//				}
//			}
//			return min;
//		};
		System.out.println("arr 배열의 최소값:" + calc(arr,f));//1
	}
	//calc는 int값 2개랑 인터페이스를 입력받아서 그 2개로 method 실행
	private static int calc(int i, int j, LambdaInterface3 f) {
		return f.method(i, j);
	}
	
	//calc는 배열 1개랑 인터페이스를 입력받아서 그 1개로 method 실행
	private static int calc(int[] arr, LambdaInterface3 f) {
		//애매...
		return f.method(arr[0], arr[1]);
	}
	
}
