package prcatice2;
class Rectangle {
	int width, heigth;
	
	Rectangle(int a, int b){
		width = a;
		heigth = b;
	} //�� �����ڸ� ���� Ŭ������ �ν��Ͻ� ������ ���� �־��ְ� �۵��� ��Ų��.
	
	void showWidth() {
		System.out.println("���� : " + width);
	}
	void showHeight() {
		System.out.println("���� : " + heigth);
	}
	void showArea() {
		System.out.println("���� : " + width * heigth);
	}
}


public class Pr1 {
	public static void main(String[] args) {
		Rectangle rt = new Rectangle(10, 5);
		rt.showWidth();
		rt.showHeight();
		rt.showArea();
	}
}
