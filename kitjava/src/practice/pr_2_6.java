package practice;

import java.util.Scanner;

public class pr_2_6 {
	static void fouroperator(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int b = sc.nextInt();
		fouroperator(a, b);
		sc.close();
	}	
}
