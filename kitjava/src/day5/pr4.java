package day5;

import java.util.Scanner;

public class pr4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int a = 1; a < n - i; a++) {
				System.out.print(" ");
			}
				for(int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
			System.out.println();
		
			}	
		sc.close();
		}
	}