package practice;

import java.util.Scanner;
//4번
public class pr_2_8 {
	static int smaller(int a, int b) {
		if (a < b)
			return a;
		else if(a > b)
			return b;
		else
			return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int b = sc.nextInt();
		
		int c = smaller(a, b);
		System.out.println("작은값 = " + c);
		
		sc.close();
	}
}