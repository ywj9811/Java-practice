package day16;

interface I2 {
	void m2(); //pa => public abstract
	default void m3() {
		System.out.println("����Ʈ �޼ҵ� m3�� �����");
	}//������ �߻�޼ҵ�� ��밡�������� �߰��� ������� �������� default�� ���
}

class I2Impl implements I2 {
	@Override
	public void m2() {
		System.out.println("m2()�޼ҵ尡 �����.");
	}
	
}
public class Ex1604 {
	public static void main(String[] args) {
		I2Impl obj = new I2Impl();
		obj.m2();
		obj.m3();
	}
}
