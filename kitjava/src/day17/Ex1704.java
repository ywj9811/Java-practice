package day17;

interface Message {
	String greet(); //�߻�޼ҵ�. public abstract(pa)
}

public class Ex1704 {
	static void showMessage(Message m) { //Message�� interface�̴�. -> ��-�� ���� ���� ���� ����.
										 //m�� Message�� ������ Ŭ������ ��ü�� ����Ű�� ��������.
		System.out.println("�޽����� : " + m.greet());
	}

	public static void main(String[] args) {
		showMessage(new Message() { //showMessage �޼ҵ尡 ����ǵ��� �� ���̴�.
			@Override
			public String greet() {
				return "�͸�Ŭ���� �ȳ�";
			}
		}); //()���ο� Message�� ������ Ŭ������ ��ü�� ������.	
			//�� ������ ***** m = new Message() { ~~~~~}; *****�̷��� �� ���̴�.
	}
}
