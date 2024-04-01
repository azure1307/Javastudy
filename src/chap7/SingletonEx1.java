package chap7;
/*
 * 생성자의 접근 제어자를 private으로 설정 => 객체를 한개만 생성함
 */
class SingleObject {
	private static SingleObject obj = new SingleObject(); //클래스 영역에 객체 존재
	private SingleObject() {}; //기본 생성자
	int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
}

public class SingletonEx1 {
	public static void main(String[] args) {
//		SingleObject s = new SingleObject(); //생성자의 접근제한자 private 접근 불가
//		SingleObject.obj //private 멤버. 접근 불가
		SingleObject s1 = SingleObject.getObject();
		SingleObject s2 = SingleObject.getObject();
		System.out.println("s1.value="+s1.value);
		System.out.println("s2.value="+s2.value);
		s1.value = 200;
		System.out.println("s1.value="+s1.value); //200
		System.out.println("s2.value="+s2.value); //s1의 value만 바꿨는데 s2의 value도 바뀜
		//클래스 영역에 있는 객체를 힙 영역에서 생성해서 아무리 객체를 많이 만들어도 계속 같은 객체를 참조하고 있음
		SingleObject s3 = SingleObject.getObject();
		System.out.println("s3.value="+s3.value); //200
	}
}
