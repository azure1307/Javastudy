package chap7;
/*
 *
 */
import chap7.test.Modifier2;

public class ModifierEx2 {
	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2();
//		m2.v1 = 10; //private - 같클
//		m2.v2 = 20; //(default) - 같패
//		m2.v3 = 30; //protected - 같패 + 같패아니면 상속까
		
		
//		m2.v4 = 40; //public - 전체공개
		m2.method(); //public - 전체공개
	}

}
