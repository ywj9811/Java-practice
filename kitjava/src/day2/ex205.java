package day2;
//���� �ڷ����� ǥ������ ���� ���� ����!
public class ex205 {
	public static void main(String[] args) {
		byte b = 127; //byte => -128~127 if b = 128�� �ְԵǸ� ǥ���������� �Ѿ�� ������ �߻�
		b++; //���Ŀ� b�� ���� 1 ������Ű�� (���� ������)
			 //--> ����� 128�� �����°��� �ƴ϶� 'overflow'�� �߻��Ͽ� -128�� ���´�.
		System.out.println("b : "  + b); //b : 127 or 128
		
		boolean b2 = true;
		System.out.println("b2 : " + b2); //b2 : true
	}
}
