package string;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s.length());
		//.length ���� return
		
		System.out.println(s.equals("gello"));
		//.equals �����(�����)
		
		String s3 = "aab";
		String s4 = "acb";
		String s5 = new String("acb");
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareTo(s5));
		//�������������� ��( abc��)
		//�� �ռ���� -��ȣ�� ��.
		//������ 0
		//�ڿ� ������� +��ȣ�� ��
		
		String s6 = String.valueOf(5 * 55);
		//.valueOf(����) ���ڸ� ���ڿ��� �ٲ��ִ� Ŭ���� �޼ҵ�
		
		String str = "�ڹ�_������"; 
		String[] arr = str.split("_");
		System.out.println("arr : " + Arrays.toString(arr));
		//.split() ���ڿ��� �ɰ��� �迭�� �������.
		
		System.out.println(str.substring(3));
		//.substring(�����ε���) : �����ε������� �������� �κй��ڿ�����.
		
		System.out.println(str.indexOf("��"));
		//.indexOf(���ڿ�) : ���ڿ��� ��ġ(�ε���)/ ������� -1�� ����
		System.out.println(str.lastIndexOf("��"));
		//.lastIndexOf(���ڿ�) : (�����ʺ���)
	}
}
