package day17;

class Outer3 {
	int n = 5;
	void m3() {
		//int num = 55; //����������.
		class Local3 {
			void showN() {
				System.out.println("n : " + n);
			}
		}
		
		Local3 local = new Local3();
		local.showN();
	}
}

public class Ex1701 {
	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		outer.m3(); //m3 ���ο��� Ŭ������ ����� �� Ŭ������ ��ü�� ���ؼ� �Լ��� ȣ��Ǵ�
					//�ڵ����� Ŭ�������� ��������� ��ü����, ��� ��� �۵��ϰԵȴ�.
	}
}
