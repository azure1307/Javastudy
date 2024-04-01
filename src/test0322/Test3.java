package test0322;

import java.util.Scanner;

/*
 * 10진수를 2,8,10,16 진수로 변경하기
 * [결과]
10진수 값을 입력하세요
16

16의 2진수 :10000	(binary)
16의 8진수 :20	(octal)
16의 10진수 :16	(dec)
16의 16진수 :10	(hex)

*/
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수 값을 입력하세요.");
		int num = sc.nextInt();
		
		System.out.println(num+"의 2진수: " + Integer.toBinaryString(num));
		System.out.println(num+"의 8진수: " + Integer.toOctalString(num));
		System.out.println(num+"의 10진수: " + num);
		System.out.println(num+"의 16진수: " + Integer.toHexString(num));
		
		int[] digit = {2,8,10,16}; //진수 배열
		//16진수가 아니어도 numarr 사용가능. 2나 8까지 하고 끝이니까..
		char[] numarr = "0123456789ABCDEF".toCharArray();
		char[] arr; //결과값 저장 배열
//		System.out.println("10진수 값을 입력하세요");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
		int divnum = num, index=0;
		for (int d : digit) { //d=2,8,10,16 
			divnum = num;
			index = 0;
			//각 진수값을 저장할 배열 생성
			arr = new char[32]; 
			
			//divnum이 10, d가 2일 경우 numarr[0]이니까 0. arr[0] = 0;
			//divnum이 5, d가 2일 경우 numarr[1]이니까 1. arr[1] = 1;
			//divnum이 2, d가 2일 경우 numarr[0]이니까 0. arr[2] = 0;
			//divnum이 1, d가 2일 경우 numarr[1]이니까 1. arr[3] = 1;
			//그럼 arr 배열 안에있는 값을 끝에서부터 출력하면 1010. 
			while (divnum > 0) {
				arr[index++] = numarr[divnum % d]; //어렵다!
				divnum /= d; 
			}
			System.out.print(num + "의 " + d + "진수 :"); 
			for(int i=index-1;i>=0;i--)
				 System.out.print(arr[i]);
			System.out.println();
		}
		
	}
}
