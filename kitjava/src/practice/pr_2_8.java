package practice;

import java.util.Scanner;
//4��
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
		System.out.print("ù��° ���� �Է� : ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int b = sc.nextInt();
		
		int c = smaller(a, b);
		System.out.println("������ = " + c);
		
		sc.close();
	}
}