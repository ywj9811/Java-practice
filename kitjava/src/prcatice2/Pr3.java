package prcatice2;

import java.util.Scanner;

class Triangle {
	int x;
	int y;
	Triangle(int x, int y){
		this.x = x;
		this.y = y;
	}
	int area() {
		return x*y/2;
	}
}
public class Pr3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변입력 : ");
		int x = sc.nextInt();
		System.out.print("높이 입력 : ");
		int y = sc.nextInt();
		Triangle tr = new Triangle(x, y);
		
		int area = tr.area();
		System.out.println("밑변이 : " + x + ", 높이가 : " + y + "인 삼각형의 넓이는 " + area);
	}
}
