package day2;

public class ex206 {
	public static void main(String[] args) {
		int a = 5;
		a = 6;
		a++;
		System.out.println(a); //7
		
		final int b = 10; //����� 10�� ���� -> ���� �Ұ����� ���
		//b = 12 //err
		//b++ //err
		// ==> ����̱� ������ ���� �߻�
		System.out.println(b); //10
		
		final int c; //��� ���� �ϰ� �ʱ�ȭ�� ���߿� �ص� �ȴ�.
		c = 10; //����� �ʱ�ȭ�� ���� �ʾ��� ��� ���Ŀ� �ѹ��� �ʱ�ȭ ����.
		//�ʱ�ȭ ���Ĵ� ���� �Ұ���
		System.out.println(c); //10
	}
}
