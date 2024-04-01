package test0326;
//한 패키지 안에 같은 클래스 X 
/*1. Card 클래스가 다음과 같을때 구동 클래스를 완성하시오
Card 클래스 변경하지않고!
[결과]
Heart:1(100,250)
Spade:1(100,250)
Heart:1(50,80)
Spade:1(50,80)
*/
class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	public String toString() {
		return kind + ":" + number + "(" + width + "," + height + ")";
	}
}

public class Test3 {
	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 1;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		
		System.out.println(c1);
		System.out.println(c2);
		
		Card.width = 50;
		Card.height = 80;
		System.out.println(c1);
		System.out.println(c2);
	}
}