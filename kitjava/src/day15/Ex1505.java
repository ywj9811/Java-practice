package day15;

class A2{
	void m() {System.out.println(1);}
}//오버라이드 할 경우 접근제어자 또한 똑같이 써야함. -> 만약 바꾸려면 접근범위가 넓어지는 방향으로만 바꿀 수 있다.

class B2 extends A2 {
	@Override //메소드를 재정의함. 메소드 오버라이드
	public void m() {System.out.println("A");}
}//default -> public은 더 넓이지는 방향이기 때문에 바꿀 수 있다.
public class Ex1505 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.m();
	}
}
