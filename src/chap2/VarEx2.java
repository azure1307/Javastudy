package chap2;
/*
 * 특수문자: escape 문자
 */
public class VarEx2 {
	public static void main(String[] args) {
		System.out.println("홍길동\n김삿갓"); //\n(new line): 2줄로 출력됨
		System.out.println("홍길동\t김삿갓"); //\t(tab): tab만큼 띄어서 출력
		System.out.println("홍길동이 말했습니다. \"안녕\"");
		char ch = '\'';
		System.out.println(ch);
		
		//D:\240318\java\workspace 값 출력하기
		System.out.println("D:\\240318\\setup\\jdk-17");	
		String str = "D:\\240318\\setup\\jdk-17";
		System.out.println(str);
		
		ch = '\u0041'; //유니코드, 0041: 16진수 숫자
		System.out.println(ch); //A 출력 
	}

}
