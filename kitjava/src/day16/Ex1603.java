package day16;

import day16B.InterA;

class InterAImpl implements InterA {
	@Override
	public void showNum() { //override�� ���������ڰ� ���ų� �о�������
							//�������̽��� �޼ҵ�� public abstract�� �⺻!
		System.out.println("override!! num : " + num);
	}
}
public class Ex1603 {
	public static void main(String[] args) {
		//InterA.num=8; //num�� final�̱� ������ �� ����̱� ������ ��ĥ �� ����.
		//System.out.println(InterA.num);//static�̱� ������ �������̽��̸�.���� ������ �� �ִ�.
		//public�̱� ������ �ٸ� ��Ű������ ���� ������ �� �ִ�.
		InterAImpl obj = new InterAImpl();
		obj.showNum();
		
		//��� : �������̽��� '��-��'�� ��Ȳ���� '��'�� ������ �� �� �ִ�.
		InterA obj2 = new InterAImpl();
		obj2.showNum(); //InterA���� showNum()�� ����
	}
}
