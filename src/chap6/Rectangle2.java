package chap6;
/*
 * Rectangle2 클래스
 *  멤버 변수: width(가로), height(세로), sno(사각형번호), cnt(생성번호를 위한 static 변수)
 *  멤버 메서드: area(): 넓이값 리턴
 *  	     length(): 둘레값 리턴
 *           isSquare(): 정사각형 여부를 boolean으로 리턴
 *           toString(): 사각형 정보 출력
 */

public class Rectangle2 {
	int width, height, sno; //인스턴스 변수
	static int cnt;			//클래스 변수
	int area() {
		return width*height;
	}
	int length() {
		return (width+height)*2;
	}
	boolean isSquare() {
		return (width == height);
	}
	public String toString() {
		return sno+"번 사각형=>("+width+","+height+"),넓이:"+area()+",둘레:"+length()
		+","+(isSquare()?"정사각형":"직사각형")+",생성된 사각형 갯수:"+cnt;
	}
}
