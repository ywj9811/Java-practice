package day17;

public class Ex1706 {
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(s1.length()); //5�� return�ϰ� �ȴ�.
		
		String s2 = null;  //null : �����ϴ� (����)��ü�� ���� ��� �ǹ�.
		System.out.println(s2.length());  //�����ϴ� �κ��� ���� ������!
		
		System.out.println("���α׷� ���� �����.");
	}
}

//java.lang.NullPointerException : Null���� ���󰡼� ��ü �����Ϸ��� �Ͽ���.