 package prcatice2;

class Line1 {
	int x1;
	int y1;
	int x2;
	int y2;
	
	void showLine() {
		System.out.println("Line1 : " + "(" + x1 + ", " + y1 + ")" + " ~ " + "(" + x2 + ", " + y2 + ")");
	}
	double distance() {
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
	
	Line1(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
}
public class Pr9 {
	public static void main(String[] args) {
		Line1 line1 = new Line1(1, 1, 4, 5);
		line1.showLine();
		System.out.println("±Ê¿Ã : " + line1.distance());
	}
}
