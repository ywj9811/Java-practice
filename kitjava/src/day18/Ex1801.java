package day18;
//����ó��

public class Ex1801 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			arr[5] = 50;
		} catch(ArrayIndexOutOfBoundsException e) { //exception�̸��� ��������'e' ����
			System.out.println("��ȿ�� �ε��� ������ ���!");
		} //���ܰ� ó����.
		System.out.println("���α׷� ���� �����.");
	}
}
