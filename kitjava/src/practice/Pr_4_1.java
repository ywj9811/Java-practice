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
		
		System.out.println("한 변의 길이가 10인 정사각형의 넓이는 " + s1.area(s1.side));
		System.out.println("한 변의 길이가 20인 정사각형의 넓이는 " + s2.area(s2.side));
	}
}
