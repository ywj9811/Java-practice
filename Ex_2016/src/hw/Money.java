package hw;

import java.util.Random;
//case������ �ٲٸ� �� ª��������...
//
public class Money {
	public static void main(String[] args) {
		int [] coin = {500, 100, 50, 10};
		Random rd = new Random();
		int num = rd.nextInt(4990)+10;
		num = num/10 * 10;
		//num�� 1���ڸ��� ������.
		
		int a = num/500; //a - 500����
		int a1 = num - 500*a;
		int b = a1/100; // b - 100����
		int b1 = a1 - 100*b; 
		int c = b1/50; // c - 50����
		int c1 = b1 - 50*c;
		int d = c1/10; //d - 10����
		System.out.println("�Ѿ� : " + num + "��");
		System.out.println("500�� : " + a + "��");
		System.out.println("100�� : " + b + "��");
		System.out.println("50�� : " + c + "��");
		System.out.println("10�� : " + d + "��");
	}
}
