package day4;

import java.util.Scanner;

public class ex409 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		if(a>100)
			System.out.println("100�� �̳��� �Է��ϼ���");
		
		else if(100 >= a && a >= 90)
			System.out.println("A����");
		
		else if(90>a && a>=80)
			System.out.println("B����");
		
		else if(80>a && a>=70)
			System.out.println("C����");
		
		else if(70>a && a>=60)
			System.out.println("D����");
		
		else
			System.out.println("F����");
	}
}
