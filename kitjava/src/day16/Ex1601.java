package day16;

//�߻�޼ҵ尡 �ϳ��� ������ , �� Ŭ������ �߻�Ŭ������ �Ǵ� ���̴�.
//-->�߻��� �̿ϼ����� �����ϸ�..
//-->�̿ϼ��޼ҵ尡 �ϳ��� ������, �� Ŭ������ �̿ϼ�Ŭ������ �Ǵ� ���̴�.
//==>abstract�ٿ��־����. 
abstract class AA{
	void m1() {
		System.out.println("m1.");	
	}
	abstract void m2(); //�߻�޼ҵ� -> �߰�ȣ ���ְ�(; �߰�) + abstract
}

public class Ex1601 {
	public static void main(String[] args) {
//		AA obj = new AA(); //�߻�Ŭ������ ��ü ������ �� ����.(�̿ϼ��̴�)
//		obj.m1();
	}
}
