package chap7;
/*
 * 다형성 예제
 * 
 * Product 클래스
 * - 필드: 가격(price), 포인트(point)
 * - 생성자: 가격을 입력받고, 가격의 10%를 포인트로 저장
 */
class Product {
	int price, point;
	Product(int price) {
		this.price = price;
		this.point = price/10;
	}
}

/*
 * TV 클래스: Product 클래스의 하위 클래스
 *          가격: 100
 *          toString: TV 리턴
 */
class Tv extends Product {
	Tv() {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
/*
 * Computer 클래스: Product 클래스의 하위 클래스
 *                가격: 200
 *                toString: Computer 리턴
 */
class Computer extends Product {
	Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
/* 
 * HandPhone 클래스: Product 클래스의 하위 클래스
 *                 가격: 150
 *                 toString: HandPhone 리턴
 */
class HandPhone extends Product {
	HandPhone() {
		super(150);
	}
	public String toString() {
		return "HandPhone";
	}
}

public class ProductEx1 {
	public static void main(String[] args) {
		//Tv, Computer, HandPhone 객체를 만들어서 parr 배열에 각각 하나씩 저장
		Product[] parr = new Product[3];
		parr[0] = new Tv();
		parr[1] = new Computer();
		parr[2] = new HandPhone();
		
		//Product 상품의 가격과 포인트 출력하고, 그 합계를 출력하자
		int totPrice = 0, totPoint = 0;
		for (Product p:parr) {
			System.out.println(p+":"+p.price+","+p.point);
			totPrice += p.price;
			totPoint += p.point;
		}
		System.out.println("전체 상품의 가격:"+totPrice);
		System.out.println("전체 상품의 포인트:"+totPoint);
	}

}
