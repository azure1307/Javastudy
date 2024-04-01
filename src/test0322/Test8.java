package test0322;
/*
 * 이렇게 간단하게 풀 수 있다니...
command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
     java Test8 10 20

   [결과]
   10과 20 의 공약수 : 1,2,5,10,
 */
public class Test8 {
	public static void main(String[] args) {
//		System.out.println("command Line에 숫자를 2개 입력하세요.");
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int min = (num1>num2)?num2:num1;
		
		System.out.print(num1 + "과" +  num2+"의 공약수 : ");
		//나눌 수는 1부터 작은 수인 min까지만 반복
		for(int i=1;i<=min;i++) {
			//둘 다 나누어떨어지면 공약수
			if(num1%i==0 && num2%i==0 ) {
				System.out.print(i + ",");
			}
		}

	}
}
