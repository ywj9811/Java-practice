package day15;

import java.util.Random;

class P1 { //부모
	void showWho() {
		System.out.println("P1.");
	}
}

class C1 extends P1 {
	@Override
	void showWho() {
		System.out.println("C1.");
	}
}
public class Ex1506 {
	public static void main(String[] args) {
		Random rd = new Random();
		P1 obj; //p1을 가리키는 참조변수 선언.
		int r = rd.nextInt(2);
		if(r == 1)
			obj = new P1();//참조변수가 가르키도록 객체 생성.
		else
			obj = new C1();//부모타입의 참조변수가 자식객체를 가르키도록 생성!?
		
		obj.showWho();
		//System.out.println(rd.nextInt(2)); //0 or 1;
	}
}
