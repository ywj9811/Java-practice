package day15.circle;

public class Circle {
	int r;
	public void setR(int r) { //�ٸ� ��Ű������ ���� �����ϵ���
		this.r = r;
	}
	public int getR() {
		return r;
	}
	protected double Area() {
		return 3.14*r*r;
	}
}
