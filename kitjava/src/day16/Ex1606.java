package day16;

//class A4 {
//	private int num = 5;
//	int getNum() {
//		return num;
//	}
//}
//
//class B4 extends A4{
//	void showNum() {
//		System.out.println(getNum());
//	}
//} private는 바로 불러서 못쓴다.

class A4 {
	private int num = 5;
	class B4 { //중첩클래스! --> B4는 내부클래스. 
		void showNum() {
			System.out.println(num);
		}
	}
}
public class Ex1606 {
	public static void main(String[] args) {
		A4 obj = new A4();
		A4.B4 obj2 = obj.new B4(); //이것이 중첩클래스의 내부클래스를 사용하기 
		obj2.showNum(); //B4클래스와 스태틱클래스 객체 생성과 비교하면 좋다.
	}
}
