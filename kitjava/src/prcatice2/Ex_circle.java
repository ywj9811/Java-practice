package prcatice2;

public class Ex_circle {
	int r;
	static int cnt = 0;
	Ex_circle(int r){
		this.r = r;
		cnt++;  //객체가 생성되면 cnt가 1씩 증가.
	}
	void showArea() {
		//넓이 출력 인스턴스 메서드
		System.out.println("넓이 : " + Math.PI *r * r);
	}
	static void showCircleCount() {
		// 생성된 객체의 개수를 출력하는 클래스 메소드 -> 인스턴스변수 사용금지
		System.out.println("(클래스 메서드) 원 객체의 개수 : " +cnt);
	}
}
