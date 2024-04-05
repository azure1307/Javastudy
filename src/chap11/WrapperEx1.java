package chap11;
/*
 * Wrapper(포장) 클래스 : 8개의 기본자료형을 객체화하기 위한 클래스 통칭
 *         => 8개의 클래스를 통칭
 *         
 *    기본자료형		Wrapper 클래스
 *    boolean		Boolean
 *    char			Character <--
 *    byte			Byte
 *    short			Short
 *    int			Integer <--
 *    long			Long
 *    float			Float
 *    double		Double
 *    
 * 참조자료형과 기본자료형은 서로 형변환 할 수 없다
 * 		String str = 'A'; (x)
 * 단 기본자료형과 그 기본자료형을 담당하고있는 Wrapper 클래스는 자동변환 가능함
 * 		Character ch = 'A'; (o) auto Boxing 됨
 * 		char ch2 = new Character('A'); // auto unBoxing 됨
 */
public class WrapperEx1 {
	public static void main(String[] args) {
//		String str = 'A'; // (String)char 불가
		
		// (기본자료형Wrapper)기본자료형 가능. auto Boxing
		Character ch1 = 'A';
		// (기본자료형)기본자료형Wrapper 가능. auto unBoxing. 값만 가져옴
		// deprecated: 이전 버전에서는 사용 가능했지만 현재 버전에서는 사용 자제해달라
		char ch2 = new Character('A'); 
	}

}
