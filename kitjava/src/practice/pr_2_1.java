package practice;

import java.util.Random;
import java.util.Scanner;

public class pr_2_1 {
	public static void main(String[] args) {
		System.out.println("���������� ������ �����ϰڽ��ϴ�.");
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print("������ �����Ͻðڽ��ϱ� : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
		
		System.out.print("����=1, ����=2, ��=3 �� �ϳ��� �Է��� �ֽʽÿ� : ");
		int a = sc.nextInt();
		int b = rd.nextInt(3);
		// com => 0:���� 1:���� 2:��
		if(a == 1) {
			System.out.print("��  : ����\t");
			if(b == 0) {
				System.out.println("com : ����");
				System.out.println("���º�");
				}
			else if(b == 1) {
				System.out.println("com : ����");
				System.out.println("�й�");
				}
			else if(b == 2) {
				System.out.println("com : ��");
				System.out.println("��");
				}
			}
			
			else if(a == 2) {
			System.out.print("��  : ����\t");
				if(b == 0) {
					System.out.println("com : ����");
					System.out.println("��");
				}
				else if(b == 1) {
					System.out.println("com : ����");
					System.out.println("���º�");
				}
				else if(b == 2) {
					System.out.println("com : ��");
					System.out.println("�й�");
				}
			}
		
			else if(a == 3) {
				System.out.print("��  : ��\t");
				if(b == 0) {
					System.out.println("com : ����");
					System.out.println("�й�");
					}
				else if(b == 1) {
					System.out.println("com : ����");
					System.out.println("��");
					}
				else if(b == 2) {
					System.out.println("com : ��");
					System.out.println("���º�");
					}
			}
			else
				System.out.println("1, 2, 3�� �ϳ��� �Է��� �ֽʽÿ�");
			if(i == n-1)
			System.out.println("\n���������� ���� ����");
		}
		
		sc.close();
	}
}
