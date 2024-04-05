package test0405;
/*
 * 소숫점이하 자리수까지 반올림하여 출력하기
 *  double  round(double 실수값,int 소숫점이하자리수)  
 * 소숫점이하 자리수에서 버림하여 출력하기
 *  double  truncate(double 실수값,int 소숫점이하자리수)  
 *  i=3
 *  String.format 
 *  "%3d" => "%"+i+"d" 
 */

public class Test4 {
	public static void main(String[] args) {
		System.out.println(round(3.1215,1));  //3.1
		System.out.println(round(3.1215,2));  //3.12
		System.out.println(round(3.1215,3));  //3.122
		System.out.println(truncate(3.15345,1));  //3.1
		System.out.println(truncate(3.15345,2));  //3.15
		System.out.println(truncate(3.15345,3));  //3.153
		System.out.println(truncate(3.15345,4));  //3.1534
	}

	private static double truncate(double d, int i) {
		StringBuilder sb = new StringBuilder();
		sb.append(d);		
		sb.delete(i+2, sb.length());
//		System.out.println("sb="+sb);
		
		String s1 = sb.toString();
		d = Double.parseDouble(s1);
		return d;
	}

	private static double round(double d, int i) {
		String str1 = "\"%."+i+"f\"";
//		System.out.println("str1:"+str1);
		
//		System.out.println(String.format(str1, d));
		str1 = String.format(str1, d);
		String str2 = "";
		char[] carr = str1.toCharArray();
		for (int a=1;a<carr.length-1;a++) {
			str2 += carr[a];
		}
//		System.out.println(str2);
		d = Double.parseDouble(str2);
		return d;
	}
}
