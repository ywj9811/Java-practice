package prcatice2;
class Point {
	Point(int x, int y){
		this.x = x;
		this.y = y;
		}
	int x;
	int y;
	
	double distance(int x2, int y2) {
		return Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2));
	}
}

class Line2 {
	Line2(Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	Point p1;
	Point p2; //이게 왜 되는건지. ==> 객체 초기화를 안해도 되는건지. ==> 아래의 Pr10에서 new를 통해서 객체를 생성했고 그 객체를 매개변수로 넣어주는 것으로 문제가 없는 것이다.
	//선언만 하고 초기화를 안하면 어떻게 되는건지. ==> 사용이 안되겠지만 아래에서 초기화를 하였다. 본문에서.
	
	void showLine() {
		System.out.println("객체 : " + "(" + p1.x + ", " + p1.y + ") " + "~" + " (" + p2.x + ", " + p2.y + ")" );
	}
	double distance() {
		return p1.distance(p2.x, p2.y); //Point클래스에서 작성한 distance 메소드를 이용하여 
	}
}
public class Pr10 {
	public static void main(String[] args) {
		Point point1 = new Point(2, 2);
		Point point2 = new Point(4, 5);
		Line2 line2 = new Line2(point1, point2);
		line2.showLine();
		System.out.println("길이 : " + line2.distance());
	}
}
