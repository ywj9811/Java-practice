package day17;

abstract class AC2 {
	abstract void m();
}

public class Ex1703 {
	public static void main(String[] args) {
		AC2 obj = new AC2() {
			@Override //�θ��� �߻�޼ҵ带 �ٽ� �������ϴ� �κ�.
			void m() {
			System.out.println("�͸�Ŭ������ m() �޼ҵ� �����.");
			}
		};
		
		obj.m();
	}
}

//Ex1702 �� �ٸ��� BC2���� �ڽ�Ŭ������ ���������ʾҴ�.

//�߻�Ŭ���� Ȥ�� �������̽��� ����Ҷ� ����ϰ� �ȴ�.