package hw;

import java.util.Random;
//case������ �ٲٸ� �� ª��������...
//
public class Money {
	public static void main(String[] args) {
		int [] coin = {500, 100, 50, 10};
		Random rd = new Random();
		int num = rd.nextInt(1090)+10;
		num = num/10 * 10;
		//num�� 1���ڸ��� ������.
		
		if(num > 0) {
			int a = num/500; //a - 500����
			int a1 = num - 500*a;
			int b = a1/100; // b - 100����
			int b1 = a1 - 100*b; 
			int c = b1/50; // c - 50����
			int c1 = b1 - 50*c;
			int d = c1/10; //d - 10����
			System.out.println(num + "��");
			System.out.println("500�� : " + a + "��");
			System.out.println("100�� : " + b + "��");
			System.out.println("50�� : " + c + "��");
			System.out.println("10�� : " + d + "��");
		}
		//�Ʒ��� ���ʿ��� �ڵ忴�� -> ����ϰ� �����ϱ� ���ؼ��� �ٸ� ����� ã�ƺ�����
//		else if(num > 100) {
//			int b = num/100; // b - 100����
//			int b1 = num - 100*b; 
//			int c = b1/50; // c - 50����
//			int c1 = b1 - 50*c;
//			int d = c1/10; //d - 10����
//			System.out.println(num + "��");
//			System.out.println("100�� : " + b + "��");
//			System.out.println("50�� : " + c + "��");
//			System.out.println("10�� : " + d + "��");
//		}
//		else if(num > 50) {
//			int c = num/50; // c - 50����
//			int c1 = num - 50*c;
//			int d = c1/10; //d - 10����
//			System.out.println(num + "��");
//			System.out.println("50�� : " + c + "��");
//			System.out.println("10�� : " + d + "��");
//		}
//		else if(num > 10) {
//			int d = num/10; //d - 10����
//			System.out.println(num + "��");
//			System.out.println("10�� : " + d + "��");
//		}
	}
}
