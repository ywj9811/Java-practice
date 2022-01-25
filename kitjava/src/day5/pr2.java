package day5;

import java.util.Scanner;

public class pr2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별 몇 줄 찍을까요 : ");
		
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
