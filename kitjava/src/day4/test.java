package day4;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int a = sc.nextInt();
		
		a = a/10;
		
		switch(a) {
		case 10:
			System.out.println("A학점");
		break;
		
		case 9:
			System.out.println("A학점");
		break;
		
		case 8:
			System.out.println("B학점");
		break;
		
		case 7:
			System.out.println("C학점");
		break;
		
		case 6:
			System.out.println("D학점");
		break;
		
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("F학점");
		break;
		
		default:
			System.out.println("100점 이내로 입력하시오");
		break;
		}
	}
}