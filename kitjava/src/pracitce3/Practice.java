package practice3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		try {
			int a = sc.nextInt();
			System.out.println(a + " �� ���� : " + (a*a));	
		}catch(InputMismatchException e) {
			System.out.println("���ڰ� �ƴ�.");
		}
	}
}// ��� �� import java.util.InputMismatchException; �̰��� �ʿ��Ѱ�.
