package day16;

class Outer { //외부클래스(Outer class)라고 부름
	static int num2 = 55;
	static class Inner2 { //Outer의 객체생성과 무관하게 존재함. static이니까. 
		void m() {
			System.out.println("stati 클래스의 m() 메소드 실행됨.");
		}
	}
}

public class Ex1607 {
	public static void main(String[] args) {
		Outer.Inner2 obj = new Outer.Inner2();
		obj.m();
	}
}
