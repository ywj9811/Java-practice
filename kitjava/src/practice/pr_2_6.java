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
		System.out.print("ù��° ���� �Է� : ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int b = sc.nextInt();
		fouroperator(a, b);
		sc.close();
	}	
}
