package hw;

import java.util.Random;
//case문으로 바꾸면 더 짧아지려나...
//
public class Money {
	public static void main(String[] args) {
		int [] coin = {500, 100, 50, 10};
		Random rd = new Random();
		int num = rd.nextInt(1090)+10;
		num = num/10 * 10;
		//num을 1의자리수 제거함.
		
		if(num > 0) {
			int a = num/500; //a - 500개수
			int a1 = num - 500*a;
			int b = a1/100; // b - 100개수
			int b1 = a1 - 100*b; 
			int c = b1/50; // c - 50개수
			int c1 = b1 - 50*c;
			int d = c1/10; //d - 10개수
			System.out.println(num + "원");
			System.out.println("500원 : " + a + "개");
			System.out.println("100원 : " + b + "개");
			System.out.println("50원 : " + c + "개");
			System.out.println("10원 : " + d + "개");
		}
		//아래는 불필요한 코드였음 -> 깔끔하게 정리하기 위해서는 다른 방법을 찾아보도록
//		else if(num > 100) {
//			int b = num/100; // b - 100개수
//			int b1 = num - 100*b; 
//			int c = b1/50; // c - 50개수
//			int c1 = b1 - 50*c;
//			int d = c1/10; //d - 10개수
//			System.out.println(num + "원");
//			System.out.println("100원 : " + b + "개");
//			System.out.println("50원 : " + c + "개");
//			System.out.println("10원 : " + d + "개");
//		}
//		else if(num > 50) {
//			int c = num/50; // c - 50개수
//			int c1 = num - 50*c;
//			int d = c1/10; //d - 10개수
//			System.out.println(num + "원");
//			System.out.println("50원 : " + c + "개");
//			System.out.println("10원 : " + d + "개");
//		}
//		else if(num > 10) {
//			int d = num/10; //d - 10개수
//			System.out.println(num + "원");
//			System.out.println("10원 : " + d + "개");
//		}
	}
}
