package day15;

class A {
	private int n = 5; //n�� private�� ������ => �ʵ��� ���� private�� ���̴°��� ����.
											//�ܺο��� �ǵ帱 �� ������
	int getN() {
		return n; //n�� private�̱� ������ ���� �޼ҵ带 �ۼ��Ͽ� ������ �� �ֵ��� �����ش�.
	}
	int setN(int n) {
		this.n = n;
		return n;
	}
}

class B extends A{
	void show() {
		System.out.println("n : "  + getN()); //n�� class A ���� private�� ������ �Ǿ��ֱ� ������
										 //�ٸ� Ŭ����(�ڽ� ����)���� ������ �� ����.
	}
	void set(int a) {
		setN(a);
		System.out.println("n : " + getN());
	}
}
public class Ex1502 {
	public static void main(String[] args) {
		B b = new B();
		b.show();
		b.set(2);
	}
}
