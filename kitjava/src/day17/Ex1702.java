package day17;

abstract class AC1 {
	abstract void m();
}

class BC1 extends AC1 {
	@Override //부모의 추상메소드를 다시 재정립하는 부분.
	void m() {
		System.out.println("자식클래스의 m() 메소드 실행됨.");
	}
}

//만약에 '익명클래스' 문법이 없었다면.(비교/Ex1703)
public class Ex1702 {
	public static void main(String[] args) {
		AC1 obj = new BC1(); //추상클래스는 부-자에서 부의 역할을 할 수 있다.
		//물론 참조변수 타입(AC1)을 BC1으로 해도 상관없지만 Ex1703과 수월한 비교를 위해서 AC1으로 했
		obj.m(); 
	}
}
