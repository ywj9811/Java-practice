package practice3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		try {
			int a = sc.nextInt();
			System.out.println(a + " 의 제곱 : " + (a*a));	
		}catch(InputMismatchException e) {
			System.out.println("숫자가 아님.");
		}
	}
}// 얘는 왜 import java.util.InputMismatchException; 이것이 필요한가.
