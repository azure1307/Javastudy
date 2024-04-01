package chap7.test;

//import chap7.Modifier3; //Modifier3 클래스가 default라서. 같패 아니라서 못 봄

public class ModifierEx3 {
	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2(); //Modifier2는 public
		m2.method();

//		Modifier3 m3 = new Modifier3(); //Modifier3은 default
//		m3.method();
	}

}
