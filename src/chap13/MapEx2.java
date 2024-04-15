package chap13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * EastCard 클래스 구현하기
 */
class EastCard {
	final int num;
	final boolean isKwang;
	public EastCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ((isKwang)?"K":"");
	}
}
class CardDeck {
	List<EastCard> cards;
	static Map<String, Integer> jokbo;
	static {
		jokbo = new HashMap<>();
		jokbo.put("KK", 4000);
		for (int i=1;i<=10;i++) {
			jokbo.put(""+i+i, 3000+(i*10));
		}
		jokbo.put("12", 2060); jokbo.put("21", 2060);
		jokbo.put("14", 2050); jokbo.put("41", 2050);
		jokbo.put("19", 2040); jokbo.put("91", 2040);
		jokbo.put("110", 2030); jokbo.put("101", 2030);
		jokbo.put("410", 2020); jokbo.put("104", 2020);
		jokbo.put("46", 2010); jokbo.put("64", 2010);
	}
	CardDeck() {
		cards = new ArrayList<>();
		for (int i=0;i<20;i++) {
			// num은 1~10까지 반복
			// isKwang은 num이 0,2,7일때만 true
			cards.add(new EastCard(i%10+1,((i==0||i==2||i==7)?true:false)));
		}
		System.out.println("기본 카드셋");
		System.out.println(cards);
	}
	// cards의 card를 섞기
	public void shuffle() {
		Collections.shuffle(cards);
		System.out.println("카드 셔플");
		System.out.println(cards);
	}
	public EastCard pick(int i) {
		// i번째를 골라 목록에서 삭제하고 리턴
		return cards.remove(i);
	}
}
/*
 * Player 클래스
 * 
 * 멤버변수: String name, EastCard card1, card2
 * 생성자: 멤버변수를 초기화
 * 멤버메서드
 *    int getScore() : card1과 card2로 점수 계산
 *    				   jokbo 에 해당 카드: jokbo에서 점수
 *    				   jokbo 에 해당하지않는 카드: (card1.num + card2.num) % 10 리턴
 *    String toString() : 이름(card1, card2): 점수
 */
class Player {
	String name;
	EastCard card1, card2;
	public Player(String name, EastCard card1, EastCard card2) {
		this.name = name;
		this.card1 = card1;
		this.card2 = card2;
	}
	int getScore() {
		// null값 판별하려면 int가 아니라 Integer를 사용해야함
		Integer score;
		if (card1.isKwang && card2.isKwang) {
			score = CardDeck.jokbo.get("KK");
		} else {
			score = CardDeck.jokbo.get(""+card1.num+card2.num);
			if (score == null) { // jokbo에 없는 카드
				score = (card1.num+card2.num) % 10;
			}
		}
		return score;
	}
	public String toString() {
		return name + "(" + card1 + "," + card2 + "):" + getScore();
	}
}
public class MapEx2 {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		
		List<Player> list = new ArrayList<>();
		list.add(new Player("홍길동",deck.pick(0),deck.pick(0)));
		list.add(new Player("김삿갓",deck.pick(0),deck.pick(0)));
		list.add(new Player("이몽룡",deck.pick(0),deck.pick(0)));
		for (Player p : list) {
			System.out.println(p);
		}
		
		System.out.println("deck에 남은 카드 갯수: "+deck.cards.size());
		
		/*
		 * Player 중 점수가 가장 높은 사람이 승리함
		 * 1등의 이름 출력하기
		 * [결과]
		 * (1등이 1명인 경우) : 홍길동 승리
		 * (1등이 2명인 경우) : 홍길동, 김삿갓 비김
		 */
		
		// 점수를 기준으로 내림차순 정렬
		Collections.sort(list,(p1,p2)->p2.getScore()-p1.getScore());
		if (list.get(0).getScore()==list.get(1).getScore()) {
			System.out.println(list.get(0).name+", "+list.get(1).name+" 비김");
		} else {
			System.out.println(list.get(0).name+" 승리");			
		}
	}
}
