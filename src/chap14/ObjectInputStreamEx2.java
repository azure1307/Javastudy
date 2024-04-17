package chap14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// object2.ser 파일의 객체 복원
public class ObjectInputStreamEx2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		// ois로 읽어온 객체를 Customer로 형변환
		User u1 = (User)ois.readObject();
		User u2 = (User)ois.readObject();
		// 객체 자체는 잘 넘어오지만 부모객체의 값은 안넘어옴.
		System.out.println("사용자1:"+u1);
		System.out.println("사용자2:"+u2);
	}
}
