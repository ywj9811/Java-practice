package string;

public class Test {
	public static void main(String[] args) {
		String s1 = "��ó��";
		String s2 = "������";
		System.out.println(s1 + s2 ); //��ó�������� -> ���ڿ��� ����
		
		String s3 = "��";
		String s4 = "��"; 
		s3 = "web";
		
		System.out.println(s3); //��ü ������ �ƴ� ���Ӱ� ����
		System.out.println(s4);
	}
}
