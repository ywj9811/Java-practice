package day4;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		a = a/10;
		
		switch(a) {
		case 10:
			System.out.println("A����");
		break;
		
		case 9:
			System.out.println("A����");
		break;
		
		case 8:
			System.out.println("B����");
		break;
		
		case 7:
			System.out.println("C����");
		break;
		
		case 6:
			System.out.println("D����");
		break;
		
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("F����");
		break;
		
		default:
			System.out.println("100�� �̳��� �Է��Ͻÿ�");
		break;
		}
	}
}