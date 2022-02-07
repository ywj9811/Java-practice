package practice;

import java.util.Scanner;

//8-13
class Result{
	int sum(int a, int b) {
		return a + b;
	}
	int sub(int a, int b) {
		return a - b;
	}
	int mul(int a, int b) {
		return a * b;
	}
	int div(int a, int b) {
		return a / b;
	}
}

public class Pr_3_5 {
	static void fourCalc(int a, int b) {
		Result rs = new Result();
		int sum = rs.sum(a, b);
		int sub = rs.sub(a, b);
		int mul = rs.mul(a, b);
		int div = rs.div(a, b);
		System.out.println("ÇÕ : " + sum);
		System.out.println("Â÷ : " + sub);
		System.out.println("°ö : " + mul);
		System.out.println("¸ò : " + div);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a ÀÔ·Â : ");
		int a = sc.nextInt();
		
		System.out.print("b ÀÔ·Â : ");
		int b = sc.nextInt();
		
		fourCalc(a, b);
		
		sc.close();
	}
}