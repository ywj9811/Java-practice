package practice;

class Square{
	int side;
	int perimeter(int side) {
		return 4*side;
	}
	int area(int side) {
		return side*side;
	}
}
public class Pr_4_1 {
	public static void main(String[] args) {
		Square s1 = new Square();
		Square s2 = new Square();
		
		s1.side = 10;
		s2.side = 20;
		
		System.out.println("�� ���� ���̰� 10�� ���簢���� ���̴� " + s1.area(s1.side));
		System.out.println("�� ���� ���̰� 20�� ���簢���� ���̴� " + s2.area(s2.side));
	}
}
