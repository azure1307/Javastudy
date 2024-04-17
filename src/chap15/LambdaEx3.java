package chap15;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier 관련 인터페이스
 * T getXXX() : 매개변수는 없고 리턴값만 존재
 * 
 * Supplier<T> : T get() : T형의 리턴값 전달
 * BooleanSupplier : boolean getAsBoolean()
 * DoubleSupplier : double getAsDouble()
 * IntSupplier : int getAsInt()
 * LongSupplier : long getAsLong()
 */
public class LambdaEx3 {
	public static void main(String[] args) {
//		Supplier<String> s1 = () -> { return "java";};
		Supplier<String> s1 = () -> "java";
		System.out.println(s1.get());
		
		// 임의의 주사위 값을 리턴
//		IntSupplier s2 = () -> {
//			return (int)(Math.random()*6)+1;
//		};
		IntSupplier s2 = () -> (int)(Math.random()*6)+1;
		System.out.println(s2.getAsInt());
		
		// arr 배열의 합 출력하기
		double[] arr = {1, 1.2, 2.4, 5.3, 10, 3};
		DoubleSupplier s3 = () -> {
			double sum = 0;
			for (double d : arr ) sum += d;
			return sum;
		};
		System.out.println(s3.getAsDouble());
		
		
	}
}
