package chap14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ObjectOutputStreamEx1.java 에서 저장한 object.ser 파일의 객체 읽어 오기
 */
public class ObjectInputStreamEx1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
		// ois로 읽어온 객체를 Customer로 형변환
		Customer c1 = (Customer)ois.readObject();
		Customer c2 = (Customer)ois.readObject();
		System.out.println(c1 + "," + c2);
	}
}
