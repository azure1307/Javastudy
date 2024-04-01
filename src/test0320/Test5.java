package test0320;
/*
 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기 
 */
//1. 2의 배수는 들어감
//2. 3의 배수도 들어감
//3. 6의 배수도 들어감
//4. 2, 3, 4, 6, 8, 9, 10, 12, …

//선생님) 걍 if (i가 2의배수 || 3의배수)면 sum += i; 해도 ㄱㅊ
public class Test5 {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i=1;i<=100;i++) {
			if (i%2==0) {
				sum += i;
			} else if (i%2!=0 && i%3==0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}
}