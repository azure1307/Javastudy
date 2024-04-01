package test0328;
/*
 * EastCard 클래스
 *   멤버변수 : int number,boolean  isKwang
 *   생성자 : 멤버변수를 매개변수로 입력받아 초기화
 *   멤버메서드 : toString을 결과에 맞도록 오버라이딩하기
 * EastCardDeck 클래스 구현하기
 *  멤버변수 : cards : EastCard 20장을 저장할 배열
 *  생성자 : EastCard 20장을 생성하여 cards 배열에 저장
 *  메서드 : toString() 오버라이딩하여 결과가 출력되도록 구현
  [결과]    
  1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
 */
class EastCard {
	int number;
	boolean isKwang;
	EastCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	public String toString() {
		return number+(isKwang?"K":"");
	}
}

class EastCardDeck {
	//EastCard가 20개가 아니라 EastCard를 참조할 참조변수를 20개 만든거임
	EastCard[] cards = new EastCard[20];
	EastCardDeck() {
		boolean[] Kwangarr = new boolean[20];
		Kwangarr[0] = true;
		Kwangarr[2] = true;
		Kwangarr[7] = true;
		for (int i=0;i<cards.length;i++) {
			//참조변수 만들 때 new EastCard(i+1,((i==0||i==2|i==7)?true:false)) 라고 하면
			//배열 따로 안만들어도댐
			cards[i] = new EastCard(i+1,Kwangarr[i]);
		}
	}
	public String toString() {
		String result = "";
//		for (int i=0;i<10;i++) {
//			result += (cards[i].number) + (cards[i].isKwang==true?"K":"")+",";
//		}
//		for (int i=0;i<10;i++) {
//			result += (cards[i].number) + ",";
//		}
		// (i>=10?(cards[i].number)-10:(cards[i].number))
		// 선생님은 이부분을 i를 10으로 나눈 나머지에 1 더한다 하셨음
		for (int i=0;i<cards.length;i++) {
			result += (i>=10?(cards[i].number)-10:(cards[i].number))
					+ (i<10?(cards[i].isKwang==true?"K":""):"")+",";
		}
		return result;
	}
}

public class Test3 {
	public static void main(String[] args) {
//		EastCard ec = new EastCard(4,true);
//		System.out.println(ec);
		EastCardDeck deck = new EastCardDeck();
		System.out.println(deck);
	}
}
