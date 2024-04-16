package chap14;
/*
 * TODO 4. Writer 예제
 * 
 * Writer : 문자형 출력스트림 2바이트 단위로 출력함
 */
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws IOException {
		Writer out = new OutputStreamWriter(System.out);
		out.write('1'); out.write('2'); out.write('3');
		out.write('a'); out.write('b'); out.write('c');
		out.write('가'); out.write('나'); out.write('다');
//		out.flush(); // 버퍼의 내용을 강제로 목적지로 전송
		out.close(); // 출력 스트림과 연결 해제. 버퍼의 내용을 강제로 목적지로 전송
	}
}
