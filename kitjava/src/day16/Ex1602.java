package day16;

abstract class A2 {
	void m1() {
		System.out.println("m1.");
	}
	abstract void m2();
}

//�θ�Ŭ����(�߻�Ŭ����)�� �޾Ƽ� �̿ϼ��� �κ� m2�� �ϼ���Ų��.
class B2 extends A2{
	@Override
	void m2() {
		System.out.println("m2 !");
	}
}

public class Ex1602 {
	public static void main(String[] args) {
		A2 obj = new B2(); //�߻�Ŭ������ '��-��'�� ��Ȳ���� '��'�� ������ �� �� �ִ�.
		obj.m1();
		obj.m2(); //A2Ŭ���� ���ο��� �߻�޼ҵ�� m2�� ������ �Ǿ��ִ�.
	}
}
