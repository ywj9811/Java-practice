package day5;

import java.util.Scanner;

public class pr5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		int a = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
		sc.close();
	}
}

