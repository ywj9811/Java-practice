package prcatice2;

import java.util.Scanner;

class Triangle {
	int x;
	int y;
	Triangle(int x, int y){
		this.x = x;
		this.y = y;
	}
	int area() {
		return x*y/2;
	}
}
public class Pr3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�غ��Է� : ");
		int x = sc.nextInt();
		System.out.print("���� �Է� : ");
		int y = sc.nextInt();
		Triangle tr = new Triangle(x, y);
		
		int area = tr.area();
		System.out.println("�غ��� : " + x + ", ���̰� : " + y + "�� �ﰢ���� ���̴� " + area);
	}
}
