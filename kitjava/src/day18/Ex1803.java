package day18;
//finally Ű���� ����!

public class Ex1803 {
	public static void main(String[] args) {
		try {
			System.out.println("<0���� ������ ��>");
			int c = 5 / 0;  //���⼭ ���ܰ� �߻���
			System.out.println("<0���� ���� ��>");
		} catch(NullPointerException e) {
			//NullPoint ���� ��Ȳ�� �߻��� ���
			System.out.println("null pointer ... ");
		} catch(ArithmeticException e) {
			//0���� �������� �� ���
			System.out.println("0���� �������� ��");
		} finally {
			//finally���� : ���� try������ ������ �̻� ������ ����Ǵ� ����!
			System.out.println("finally ���� �����.");
		}
		
		System.out.println("���α׷� ���� �����.");
	}
}
