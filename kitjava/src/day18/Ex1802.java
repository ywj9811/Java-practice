package day18;

public class Ex1802 {
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(s1.length()); //5
		
		try {
			String s2 = null; //���������� �ƹ����� ������ �ʴ´�.(�� ��� ����Ű������ ����);
			  //�������� �������!
			System.out.println(s2.length()); //excetion�߻� --> null�̱� ������ ��� ���� ����Ű������ �ʾƼ�
		} catch(NullPointerException e) {
			System.out.println("��ü�� ���µ� �����Ϸ� �Ͽ���!");
		}
		
		System.out.println("���α׷� ���� �����.");
	}
}
