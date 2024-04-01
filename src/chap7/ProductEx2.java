package chap7;
/*
 * Buyer 클래스
 * - 변수: money = 500, point 
 *       cart = new Product[5]: 구매상품을 저장하는 장바구니
 *       cnt = 구매갯수
 * - 메서드
 *       void buy(Product p)
 *       1. p 상품의 가격을 money에서 차감
 *       2. p 상품의 포인트를 point에 추가
 *       3. cart에 p 상품을 추가 & cnt 증가
 *       4. p 제품의 이름 출력 => Tv 구입
 *       void summary()
 *       1. 구매한 상품의 가격 합계, 쌓인 포인트 합계 출력
 *       2. 잔액 출력
 *       3. 구매한 상품의 물품 이름 출력 
 *       4. 고객의 잔액, 포인트 출력
 */
class Buyer {
	int money=500, point, cnt;
	Product[] cart = new Product[5];
	void buy(Product p) {
		money -= p.price;
		point += p.point;
		//3. cart에 p 상품을 추가 & cnt 증가
		cart[cnt++] = p;
		//4. p 제품의 이름 출력 => Tv 구입
		System.out.println(p+" 구입");
	}
	void summary() {
		//1. 구매 제품의 전체 금액의 합계, 포인트 합계 출력
		int totPrice = 0, totPoint = 0;
		for (int i=0;i<cnt;i++) { //cart.length를 쓰면 null까지 출력되니까 cnt까지만 
			totPrice += cart[i].price;
			totPoint += cart[i].point;
		}
		System.out.println("구매제품 전체 가격: "+totPrice);
		System.out.println("구매제품 전체 포인트: "+totPoint);
//		2. 잔액 출력
		System.out.println("구매 후 잔액: "+money);
//		3. 구매한 상품의 물품 이름 출력
		System.out.print("구매 제품 목록: ");
		for (int i=0;i<cnt;i++) {
			System.out.print(cart[i]+(i==cnt-1?"":", "));
		}
		System.out.println();
//		4. 고객의 포인트 출력
		System.out.println("구매 후 포인트: "+point);
	}
}
public class ProductEx2 {
	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		
		Buyer b = new Buyer();
		b.buy(t); //Tv를 사다
		b.buy(c); //Computer를 사다
		b.buy(h); //HandPhone을 사다
		b.summary();
	}
}
