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
	Point p2; //�̰� �� �Ǵ°���. ==> ��ü �ʱ�ȭ�� ���ص� �Ǵ°���. ==> �Ʒ��� Pr10���� new�� ���ؼ� ��ü�� �����߰� �� ��ü�� �Ű������� �־��ִ� ������ ������ ���� ���̴�.
	//���� �ϰ� �ʱ�ȭ�� ���ϸ� ��� �Ǵ°���. ==> ����� �ȵǰ����� �Ʒ����� �ʱ�ȭ�� �Ͽ���. ��������.
	
	void showLine() {
		System.out.println("��ü : " + "(" + p1.x + ", " + p1.y + ") " + "~" + " (" + p2.x + ", " + p2.y + ")" );
	}
	double distance() {
		return p1.distance(p2.x, p2.y); //PointŬ�������� �ۼ��� distance �޼ҵ带 �̿��Ͽ� 
	}
}
public class Pr10 {
	public static void main(String[] args) {
		Point point1 = new Point(2, 2);
		Point point2 = new Point(4, 5);
		Line2 line2 = new Line2(point1, point2);
		line2.showLine();
		System.out.println("���� : " + line2.distance());
	}
}
