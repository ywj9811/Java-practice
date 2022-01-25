package day5;

import java.util.Scanner;

public class pr3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		for(int i=n; i>0; i--) {
			for(int a = 0; a < n-i; a++ ) {
				System.out.print(" ");
			}
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}