package day16;

abstract class A2 {
	void m1() {
		System.out.println("m1.");
	}
	abstract void m2();
}

//부모클래스(추상클래스)를 받아서 미완성인 부분 m2를 완성시킨다.
class B2 extends A2{
	@Override
	void m2() {
		System.out.println("m2 !");
	}
}

public class Ex1602 {
	public static void main(String[] args) {
		A2 obj = new B2(); //추상클래스는 '부-자'의 상황에서 '부'의 역할을 할 수 있다.
		obj.m1();
		obj.m2(); //A2클래스 내부에도 추상메소드로 m2가 선언이 되어있다.
	}
}
