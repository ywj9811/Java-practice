package prcatice2;
class Rectangle {
	int width, heigth;
	
	Rectangle(int a, int b){
		width = a;
		heigth = b;
	} //이 생성자를 통해 클래스의 인스턴스 변수에 값을 넣어주고 작동을 시킨다.
	
	void showWidth() {
		System.out.println("가로 : " + width);
	}
	void showHeight() {
		System.out.println("세로 : " + heigth);
	}
	void showArea() {
		System.out.println("넓이 : " + width * heigth);
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
