package day4;

import java.util.Scanner;

public class ex409 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int a = sc.nextInt();
		
		if(a>100)
			System.out.println("100점 이내로 입력하세요");
		
		else if(100 >= a && a >= 90)
			System.out.println("A학점");
		
		else if(90>a && a>=80)
			System.out.println("B학점");
		
		else if(80>a && a>=70)
			System.out.println("C학점");
		
		else if(70>a && a>=60)
			System.out.println("D학점");
		
		else
			System.out.println("F학점");
	}
}
