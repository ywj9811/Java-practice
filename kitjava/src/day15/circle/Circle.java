package day15.circle;

public class Circle {
	int r;
	public void setR(int r) { //다른 패키지에서 접근 간으하도록
		this.r = r;
	}
	public int getR() {
		return r;
	}
	protected double Area() {
		return 3.14*r*r;
	}
}
