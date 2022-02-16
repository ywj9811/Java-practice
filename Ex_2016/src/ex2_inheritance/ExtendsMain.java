package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		Child c1 = new Child(); //원래 Child 클래스에는 자동차만 존재함.
		System.out.println("자식의 클래스에는 가진게 별로 없다.");
		System.out.println("하지만 자식에게 존재하는 것 : " + c1.car + ", " + c1.money + ", " + c1.str);
		//extends Parent를 통해 부모 클래스를 상속받아서 그곳에 존재하는 값들을 가져와 쓸 수 있다.
		//하지만 부모가 prviate로 지정한 속성의 경우 자식의 경우에도 접근할 수 없다.
		
		Parent p1 = new Parent();
		System.out.println("부모의 경우에 존재하는 것 : " + p1.money + ", " + p1.str + "만 있다.");
		//java는 단일상속체계로서 부모는 단 하나만 가질 수 있다.
	}
}
