package day15;

class A2{
	void m() {System.out.println(1);}
}//�������̵� �� ��� ���������� ���� �Ȱ��� �����. -> ���� �ٲٷ��� ���ٹ����� �о����� �������θ� �ٲ� �� �ִ�.

class B2 extends A2 {
	@Override //�޼ҵ带 ��������. �޼ҵ� �������̵�
	public void m() {System.out.println("A");}
}//default -> public�� �� �������� �����̱� ������ �ٲ� �� �ִ�.
public class Ex1505 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.m();
	}
}
