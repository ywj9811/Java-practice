package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		Child c1 = new Child(); //���� Child Ŭ�������� �ڵ����� ������.
		System.out.println("�ڽ��� Ŭ�������� ������ ���� ����.");
		System.out.println("������ �ڽĿ��� �����ϴ� �� : " + c1.car + ", " + c1.money + ", " + c1.str);
		//extends Parent�� ���� �θ� Ŭ������ ��ӹ޾Ƽ� �װ��� �����ϴ� ������ ������ �� �� �ִ�.
		//������ �θ� prviate�� ������ �Ӽ��� ��� �ڽ��� ��쿡�� ������ �� ����.
		
		Parent p1 = new Parent();
		System.out.println("�θ��� ��쿡 �����ϴ� �� : " + p1.money + ", " + p1.str + "�� �ִ�.");
		//java�� ���ϻ��ü��μ� �θ�� �� �ϳ��� ���� �� �ִ�.
	}
}
