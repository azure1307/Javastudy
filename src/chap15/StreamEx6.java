package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * File에서 데이터 읽어서 처리하기
 */
public class StreamEx6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		/*
		 * br.lines() : Reader를 통한 데이터를 Stream<String> 생성
		 * 				product.txt 의 내용을 Stream<String> 생성
		 * map(Function) : s : String : Stream<String> // 이 map은 콜렉션과 상관x
		 * 				   리턴값 : Car : Stream<Car> // 이 map은 콜렉션과 상관x
		 */
		br.lines().map(s->{
			// 12,2,K9,2 -> "12","2","K9","2"
			String[] str = s.split(","); // ,로 분리
			String temp = "";
			// 1,3,아반떼,4,그냥그래요
			try { // remark가 있다면
				temp = str[4]; // temp=그냥그래요
			} catch (ArrayIndexOutOfBoundsException e) { // remark 없을시 ""로 
				temp = "";
			}
			return new Car(Integer.parseInt(str[0]), // 월
					Integer.parseInt(str[1]),str[2], // 컨디션상태, 자동차이름
					Integer.parseInt(str[3]),temp); // 수량, 평가
		}).filter(c->c.getCar().equals("K9")) // 차 이름이 K9인 경우에만
		.forEach(c->System.out.println(c)); // 출력
	}
}
