package day15;

import day15.circle.Circle;

class CircleChild extends Circle {
	public void show() {
		System.out.println("������ : " + getR());
		System.out.println("���� : " + Area());
	}
} //Circle Ŭ������ ��ӹ޴� �ڽ�Ŭ������ ����� protected�� ���.

public class Ex1504 {
	public static void main(String[] args) {
		CircleChild c = new CircleChild();
		c.setR(10);
		//Circle c = new Circle();
		//c.r = 10; �Ұ��� -> default�̱� ������ ������ �� ����.
		//c.Area()���� default�̱� ������ ������ �� ����.
		c.show();
	}
}
