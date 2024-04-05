package chap11;
/*
 * Object 클래스: hashCode 메서드
 * 	  hashCode: (1) JVM이 객체를 구별하기 위한 고유의 값(참조값)
 * 				(2) 두 객체의 해쉬코드값이 동일한 경우는 같은 객체라고 볼 수 있음
 * 	물리적으로 같은 객체: 실제로 같은 객체
 * 	논리적으로 같은 객체: 내용 기준으로 같은 객체라고 판단해야 할 경우
 * 				- a.hashCode() == b.hashCode() => a와 b 객체가 같은 객체라고 판단(물리) 
 * 			    - a.equals(b): 결과가 참 => a와 b 객체의 내용이 동일 판단(논리)
 * 
 *    권장사항
 *    - equals 메서드를 오버라이딩하는 경우, hashCode 메서드도 같이 오버라이딩하도록 권장
 */
public class ObjectEx2 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		 // false. 참조값이 다르다.
		System.out.println("s1==s2 : "+(s1==s2));
		
		// true. 내용이 같다. 논리적 동일
		System.out.println("s1.equals(s2) : "+(s1.equals(s2))); 
		
		// true. 객체가 같다. 물리적 동일
		System.out.println("s1.hashCode() : "+s1.hashCode()); 
		System.out.println("s2.hashCode() : "+s2.hashCode()); 
		
		// false. 
		System.out.println("s1 객체의 원래 hashcode값 : "+System.identityHashCode(s1)); 
		System.out.println("s2 객체의 원래 hashcode값 : "+System.identityHashCode(s2));
		System.out.println();
		
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		
		// Equal 클래스에 hashCode 메서드를 내용이 같은 경우 같은 hashCode 값을 리턴하도록 오버라이딩
		System.out.println("e1.hashCode() : "+e1.hashCode()); 
		System.out.println("e2.hashCode() : "+e2.hashCode()); 
		System.out.println("e1 객체의 원래 hashcode값 : "+System.identityHashCode(e1)); 
		System.out.println("e2 객체의 원래 hashcode값 : "+System.identityHashCode(e2)); 
	}
}
