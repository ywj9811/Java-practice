package day18;

public class Ex1805 {
	public static void main(String[] args) {
		try {
			int a = 5 / 0;
			System.out.println(a); //����x
		} catch(ArithmeticException e) {
			//System.out.println("0���� ���� �� ����...");
			e.printStackTrace(); //���� �Ϲ����� ����ó�� ����.
		}
	}
}
