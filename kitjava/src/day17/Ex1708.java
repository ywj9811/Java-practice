package day17;

public class Ex1708 {
	public static void main(String[] args) {
		try {
			int[] arr = {2, 0};
			int num = 4;
			int num2 = num / arr[0]; //�̺κп��� ���ܻ�Ȳ�� �߻�(���������ʴ� index). java.lang.ArrayIndexOutOfBoundsException
			int num3 = num / arr[1]; //0���� �����ԵǸ� ���ܰ� �߻��ϰ� �ȴ�. java.lang.ArithmeticException
			System.out.println("�� ������ ��µ��� ����.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� : �迭�� �ε�����ȣ�� ������ �����!");
		} catch(ArithmeticException e) {
			System.out.println("���� : 0 ���� �������� �Ͽ���!");
		}
		
		System.out.println("���α׷� ���� �����");
	}
}
