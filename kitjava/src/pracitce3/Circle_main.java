package practice3;

import java.util.Scanner;

class Circle{
	int r;
	double Area() {
		return r*r*3.14;
	}
	Circle(int r){
		this.r = r;
	}
}

class Cylinder extends Circle{
	int h;
	double Volume() {
		return Area()*h;
	}
	Cylinder(int r, int h){
		super(r);
		this.h = h;
	}
}

public class Circle_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 반지름과 높이 순서대로 입력하시오 -> ");
		Cylinder c1 = new Cylinder(sc.nextInt(), sc.nextInt());
		System.out.print("두번째 반지름과 높이 순서대로 입력하시오 -> ");
		Cylinder c2 = new Cylinder(sc.nextInt(), sc.nextInt());
		
		if(c1.Volume() > c2.Volume()) {
			System.out.println("첫번째 원기둥의 부피가 더 큽니다. " + "(" + c1.Volume() + ")");
		}
		else
			System.out.println("두번째 원기둥의 부피가 더 큽니다. " + "(" + c2.Volume() + ")");
		
		sc.close();
	}
 }
