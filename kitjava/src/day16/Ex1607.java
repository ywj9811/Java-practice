package day16;

class Outer { //�ܺ�Ŭ����(Outer class)��� �θ�
	static int num2 = 55;
	static class Inner2 { //Outer�� ��ü������ �����ϰ� ������. static�̴ϱ�. 
		void m() {
			System.out.println("stati Ŭ������ m() �޼ҵ� �����.");
		}
	}
}

public class Ex1607 {
	public static void main(String[] args) {
		Outer.Inner2 obj = new Outer.Inner2();
		obj.m();
	}
}
