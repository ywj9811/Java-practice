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
		System.out.print("ù��° �������� ���� ������� �Է��Ͻÿ� -> ");
		Cylinder c1 = new Cylinder(sc.nextInt(), sc.nextInt());
		System.out.print("�ι�° �������� ���� ������� �Է��Ͻÿ� -> ");
		Cylinder c2 = new Cylinder(sc.nextInt(), sc.nextInt());
		
		if(c1.Volume() > c2.Volume()) {
			System.out.println("ù��° ������� ���ǰ� �� Ů�ϴ�. " + "(" + c1.Volume() + ")");
		}
		else
			System.out.println("�ι�° ������� ���ǰ� �� Ů�ϴ�. " + "(" + c2.Volume() + ")");
		
		sc.close();
	}
 }
