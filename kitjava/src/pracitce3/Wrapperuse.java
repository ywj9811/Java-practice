package pracitce3;

public class Wrapperuse {
	public static void main(String[] args) {
		int num = 5; //stack ����
		Integer num2 = 5; //heap������ ��ü�� ������.
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num2.toString());
		//num2.toString()�̶� num2�� �������� ����Ű�� ���� ���
		//sysout(num2)�� �ϰԵǸ� �ڵ����� toString()�� �۵���.
		
		int sum = num + num2;
		System.out.println(sum);
	}
}
