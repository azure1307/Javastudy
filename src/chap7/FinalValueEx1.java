package chap7;
/*
 * final: 변경불가의 의미
 * final 변수: 변경불가 변수. (=상수)
 *            상숫값의 이름규칙: snake 방식(_ 사용)
 */
class FinalValue {
	final int NUM;
	static final int MAX; //객체마다(실행할 때마다) 다른 상수값을 가지고 싶을때
	static { //static 초기화 블럭에서 MAX를 초기화할 수 있음
		MAX = (int)(Math.random()*100);
	}
	//왜 굳이 초기화 안했다가 생성자에서?
	//이렇게하면 객체별로 다른 상수값을 가질 수 있음
	FinalValue(int num) { //생성자에서 초기화
		NUM = num; //명시적초기화가 안된 경우 생성자에서 한번은 초기화 가능
	}
}
public class FinalValueEx1 {
	public static void main(String[] args) {
		final int NUM = 100; //상수: 변경불가 변수
//		NUM = 200; //변경불가
		final int MAX; //초기화하지않으면 한번은 초기화 가능함
		MAX = 200; //한번은 초기화 가능
//		MAX = 300; //변경불가
		
		FinalValue fv1 = new FinalValue(10);
		FinalValue fv2 = new FinalValue(20);
		System.out.println(fv1.NUM);//10
		System.out.println(fv2.NUM);//20
//		fv1.NUM = 100; //이미 초기화된 경우 변경불가
//		fv2.NUM = 200; //이미 초기화된 경우 변경불가
		
		//이 경우 참조변수가 상수인 것. 배열 안에 들어있는 수가 상수인게 아님!
		final int[] arr = {10,20,30,40,50};
		for (int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		arr[0] = 100;
		arr[1] = 200;
		for (int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
//		arr = new int[] {100,200,300}; //arr이라는 참조변수는 새로운 객체를 참조할 수 없음.
	}

}
