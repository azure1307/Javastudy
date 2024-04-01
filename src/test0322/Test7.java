package test0322;
/*
Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
    java Test7 10
    int num = Integer.parseInt(args[0]);
  [결과]
  10의 약수 : 1,2,5,10,
*/
public class Test7 {
	public static void main(String[] args) {
//		System.out.println("command Line에 숫자를 입력하세요.");
//		int num = 10;
		int num = Integer.parseInt(args[0]);
		int factors[] = new int[num];
		int index = 0;
		
		for (int i=1;i<=num;i++) {
			if (num%i==0) {
				factors[index++] = i;
			} 
		}
		
		System.out.print(args[0] + "의 약수 : ");
		for (int i=0;i<index;i++) {
			System.out.print(factors[i]+",");
		}

	}
}
