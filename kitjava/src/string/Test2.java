package string;

public class Test2 {
	public static void main(String[] args) {
		String s6 = "��";
		String s7 = "��";
		String s8 = new String("��");
		
		System.out.println(s6.equals(s7));
		System.out.println(s7.equals(s8));
		System.out.println(s6 == s7);// ������ �Ȱ���.
									 // �Ȱ��� ��ü�� ����Ű����
		System.out.println(s6 == s8);
	}
}
