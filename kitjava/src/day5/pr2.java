package day5;

import java.util.Scanner;

public class pr2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �� ������� : ");
		
		int i = sc.nextInt();
		
		for (int a=i; a>0; a--) {
			for (int b=0; b<a; b++) {
				System.out.print("*");
			}
				System.out.println();
		}
		sc.close();
	}
}
