package day15;

import day15.circle.Circle;

class CircleChild extends Circle {
	public void show() {
		System.out.println("반지름 : " + getR());
		System.out.println("넓이 : " + Area());
	}
} //Circle 클래스를 상속받는 자식클래스를 만들어 protected를 사용.

public class Ex1504 {
	public static void main(String[] args) {
		CircleChild c = new CircleChild();
		c.setR(10);
		//Circle c = new Circle();
		//c.r = 10; 불가능 -> default이기 때문에 접근할 수 없다.
		//c.Area()또한 default이기 때문에 접근할 수 없다.
		c.show();
	}
}
