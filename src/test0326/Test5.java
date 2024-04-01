package test0326;
/*
3. 동전을 표현하는 Coin 클래스 구현하기 (구동클래스는 바꾸지않기)
      멤버변수 :  동전의 면(side)
      멤버메서드 : void flip() 
           기능 : 동전을 던져 동전의 면을 변경한다. Math.random() 메서드 이용. 
                 side 필드의 값을 변경. 
*/
class Coin {
	int side;	//인스턴스 변수이므로 객체화될때 초기화됨 
	void flip() {
		side = (int)(Math.random()*2);
	}
}

public class Test5 {
	public static void main(String[] args) {
		Coin coin = new Coin();
		System.out.println(coin.side==0?"앞면":"뒷면");
		coin.flip();
		System.out.println(coin.side==0?"앞면":"뒷면");
	}
}
