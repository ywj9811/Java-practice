package day15;

import java.util.Random;

class P1 { //�θ�
	void showWho() {
		System.out.println("P1.");
	}
}

class C1 extends P1 {
	@Override
	void showWho() {
		System.out.println("C1.");
	}
}
public class Ex1506 {
	public static void main(String[] args) {
		Random rd = new Random();
		P1 obj; //p1�� ����Ű�� �������� ����.
		int r = rd.nextInt(2);
		if(r == 1)
			obj = new P1();//���������� ����Ű���� ��ü ����.
		else
			obj = new C1();//�θ�Ÿ���� ���������� �ڽİ�ü�� ����Ű���� ����!?
		
		obj.showWho();
		//System.out.println(rd.nextInt(2)); //0 or 1;
	}
}
