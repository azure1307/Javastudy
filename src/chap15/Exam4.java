package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

/*
 * product.txt 파일을 읽어서 6월달 그랜저 판매수량 출력
 */
public class Exam4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		// map(Function) 에서 사용할 Function 객체 미리 생성
		Function<String, Car> f = s -> {
			// String s: "1,3,아반떼,4,그냥그래요"
			String[] str = s.split(",");
			String temp = "";
			try {
				temp = str[4];
			} catch (ArrayIndexOutOfBoundsException e) {
				temp = "";
			}
			return new Car(Integer.parseInt(str[0]),
					Integer.parseInt(str[1]),str[2],
					Integer.parseInt(str[3]),temp);
		};
		// map() : Stream<String> -> Stream<Car>
		// mapToInt() : Stream<Car> -> IntStream
		int sales = br.lines().map(f)
				.filter(c->c.getCar().equals("그랜저")&&c.getMonth()==6&&c.getCon()==2)
				.mapToInt(Car::getQty).sum();
		System.out.println("6월달 그랜저 판매수량:"+sales);
		System.out.println();
		
		// 6월 그랜저 판매레코드 조회
		br = new BufferedReader(new FileReader("product.txt"));
		br.lines().map(f)
		.filter(c->c.getCar().equals("그랜저")&&c.getMonth()==6&&c.getCon()==2)
		.forEach(i->System.out.print(i+"\n"));
	}
}
