package day17;

abstract class AC1 {
	abstract void m();
}

class BC1 extends AC1 {
	@Override //�θ��� �߻�޼ҵ带 �ٽ� �������ϴ� �κ�.
	void m() {
		System.out.println("�ڽ�Ŭ������ m() �޼ҵ� �����.");
	}
}

//���࿡ '�͸�Ŭ����' ������ �����ٸ�.(��/Ex1703)
public class Ex1702 {
	public static void main(String[] args) {
		AC1 obj = new BC1(); //�߻�Ŭ������ ��-�ڿ��� ���� ������ �� �� �ִ�.
		//���� �������� Ÿ��(AC1)�� BC1���� �ص� ��������� Ex1703�� ������ �񱳸� ���ؼ� AC1���� ��
		obj.m(); 
	}
}
