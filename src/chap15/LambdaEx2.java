package chap15;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/*
 * Java API의 FunctionalInterface 예제
 * 
 * 1. Consumer 관련 인터페이스
 *    accept() 추상 메서드 : 매개변수 있고, 리턴값은 없는 메서드 - 소비만 함
 *    
 *    Consumer<T> : void accept(T)
 *    BiConsumer<T, U> : void accept(T, U)
 *    DoubleConsumer : void accept(double)
 *    IntConsumer : void accept(int)
 *    LongConsumer : void accept(long)
 *    ObjDoubleConsumer<T> : void accept(T, double)
 *    ObjIntConsumer<T> : void accept(T, int)
 *    ObjLongConsumer<T> : void accept(T, long)
 *    
 */
public class LambdaEx2 {
	public static void main(String[] args) {
		Consumer<String> c1 = t->System.out.println(t+8);
		c1.accept("java"); // java8
		BiConsumer<String, Double> c2 = (t,u) -> System.out.println(t+u);
		c2.accept("Java", 8.0); // Java8.0
		
		// 1~100까지의 합 출력
		IntConsumer c3 = u -> {
			int sum = 0;
			for (int i=1;i<=u;i++) {
				sum += i;
			}
			System.out.println("1에서"+u+"까지의 합:"+sum);
		};
		c3.accept(100);
		c3.accept(10);
	}
}
