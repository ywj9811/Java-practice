package prcatice2;

public class Ex_circle {
	int r;
	static int cnt = 0;
	Ex_circle(int r){
		this.r = r;
		cnt++;  //��ü�� �����Ǹ� cnt�� 1�� ����.
	}
	void showArea() {
		//���� ��� �ν��Ͻ� �޼���
		System.out.println("���� : " + Math.PI *r * r);
	}
	static void showCircleCount() {
		// ������ ��ü�� ������ ����ϴ� Ŭ���� �޼ҵ� -> �ν��Ͻ����� ������
		System.out.println("(Ŭ���� �޼���) �� ��ü�� ���� : " +cnt);
	}
}
