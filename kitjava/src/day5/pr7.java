package day5;

import java.util.Scanner;

public class pr7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			if(i%2==1)
				System.out.print(1);
			
			for(int j = 0; j < i/2; j++) {
				if(i%2==0) {
					System.out.print(0);
					System.out.print(1);
				}
				else {
					if(i==1) 
						break;
					else {
						System.out.print(0);
						System.out.print(1);
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}
}