package prcatice2;

public class Ex_circlemain {
	public static void main(String[] args) {
		Ex_circle.showCircleCount();
		
		Ex_circle c1, c2;
		c1 = new Ex_circle(5);
		c2 = new Ex_circle(10);
		System.out.println("생선된 원 객체의 개수 : " + Ex_circle.cnt);
		c1.showArea();
		c2.showArea();
		Ex_circle.showCircleCount();
	}
}
