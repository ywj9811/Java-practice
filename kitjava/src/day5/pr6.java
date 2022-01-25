package day5;

import java.util.Scanner;

public class pr6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int a = 0; a < n - i; a++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
