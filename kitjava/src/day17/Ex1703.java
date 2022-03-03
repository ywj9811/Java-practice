package day17;

abstract class AC2 {
	abstract void m();
}

public class Ex1703 {
	public static void main(String[] args) {
		AC2 obj = new AC2() {
			@Override //부모의 추상메소드를 다시 재정립하는 부분.
			void m() {
			System.out.println("익명클래스의 m() 메소드 실행됨.");
			}
		};
		
		obj.m();
	}
}

//Ex1702 와 다르게 BC2같은 자식클래스를 생성하지않았다.

//추상클래스 혹은 인터페이스를 사용할때 사용하게 된다.