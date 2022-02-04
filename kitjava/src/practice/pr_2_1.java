package practice;

import java.util.Random;
import java.util.Scanner;

public class pr_2_1 {
	public static void main(String[] args) {
		System.out.println("가위바위보 게임을 시작하겠습니다.");
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print("몇판을 진행하시겠습니까 : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
		
		System.out.print("가위=1, 바위=2, 보=3 중 하나를 입력해 주십시오 : ");
		int a = sc.nextInt();
		int b = rd.nextInt(3);
		// com => 0:가위 1:바위 2:보
		if(a == 1) {
			System.out.print("나  : 가위\t");
			if(b == 0) {
				System.out.println("com : 가위");
				System.out.println("무승부");
				}
			else if(b == 1) {
				System.out.println("com : 바위");
				System.out.println("패배");
				}
			else if(b == 2) {
				System.out.println("com : 보");
				System.out.println("승");
				}
			}
			
			else if(a == 2) {
			System.out.print("나  : 바위\t");
				if(b == 0) {
					System.out.println("com : 가위");
					System.out.println("승");
				}
				else if(b == 1) {
					System.out.println("com : 바위");
					System.out.println("무승부");
				}
				else if(b == 2) {
					System.out.println("com : 보");
					System.out.println("패배");
				}
			}
		
			else if(a == 3) {
				System.out.print("나  : 보\t");
				if(b == 0) {
					System.out.println("com : 가위");
					System.out.println("패배");
					}
				else if(b == 1) {
					System.out.println("com : 바위");
					System.out.println("승");
					}
				else if(b == 2) {
					System.out.println("com : 보");
					System.out.println("무승부");
					}
			}
			else
				System.out.println("1, 2, 3중 하나를 입력해 주십시오");
			if(i == n-1)
			System.out.println("\n가위바위보 게임 종료");
		}
		
		sc.close();
	}
}
