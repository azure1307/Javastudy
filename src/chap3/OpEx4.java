package chap3;
/*
 * 비교연산자
 * 1. ==(등가), >, <, >=, <=, …
 * 2. 연산 결과가 boolean
 * 논리연산자
 * 1. &&(and): 둘 다 true여야 true, ||(or): 둘 중 하나라도 true면 true
 * 2. &의 경우 앞부분이 false인 경우 뒷부분에 상관없이 false이므로 뒷부분 실행x
 *    |의 경우 앞부분이 true인 경우 뒷부분에 상관없이 true이므로 뒷부분 실행x
 */ 
public class OpEx4 {
	public static void main(String[] args) {
		int x = 1, y = 1;
		System.out.println(x + "==" + y + " : " + (x==y));
		System.out.println(x + "!=" + y + " : " + (x!=y));
		System.out.println(x + ">=" + y + " : " + (x>=y));
		System.out.println(x + ">" + y + " : " + (x>y));
		System.out.println(x + "<=" + y + " : " + (x<=y));
		System.out.println(x + "<" + y + " : " + (x<y));
		System.out.println();
		
		System.out.println("x==1 && y==1 : " + (x==1 && y==1));
		System.out.println("x==1 && y!=1 : " + (x==1 && y!=1));
		System.out.println("x!=1 && y==1 : " + (x!=1 && y==1));
		System.out.println("x!=1 && y!=1 : " + (x!=1 && y!=1));
		System.out.println();
		
		System.out.println("x==1 || y==1 : " + (x==1 || y==1));
		System.out.println("x==1 || y!=1 : " + (x==1 || y!=1));
		System.out.println("x!=1 || y==1 : " + (x!=1 || y==1));
		System.out.println("x!=1 || y!=1 : " + (x!=1 || y!=1));
		System.out.println();
		
		String str = null; //null: 값이 없음. 객체가 없다.
		if(str==null || str.equals("")) {
			System.out.println("str 변수에 값이 없음");
		}
//		if(str.equals("") || str==null) {
//			System.out.println("str 변수에 값이 없음");
//		}
	}
}
