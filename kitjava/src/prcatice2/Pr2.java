package prcatice2;
class Circle {
	int radius;
	void setRadius(int r) {
		radius = r;
	}
	double getArea() {
		return radius*radius*3.14;
	}
}
public class Pr2 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(10);
		System.out.println("원의 넓이는 : " + c.getArea());
	}
}
