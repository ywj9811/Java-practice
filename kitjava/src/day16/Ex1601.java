package day16;

//추상메소드가 하나라도 있으면 , 그 클래스는 추상클래스가 되는 것이다.
//-->추상을 미완성으로 생각하면..
//-->미완성메소드가 하나라도 잇으면, 그 클래스는 미완성클래스가 되는 것이다.
//==>abstract붙여주어야함. 
abstract class AA{
	void m1() {
		System.out.println("m1.");	
	}
	abstract void m2(); //추상메소드 -> 중괄호 없애고(; 추가) + abstract
}

public class Ex1601 {
	public static void main(String[] args) {
//		AA obj = new AA(); //추상클래스는 객체 생성할 수 없다.(미완성이니)
//		obj.m1();
	}
}
