package prcatice2;

class ParentB{
	ParentB(){
		this(100);
		System.out.println('A');
	}
	ParentB(int num){
		System.out.println('B');
	}
}

class ChildB extends ParentB{
	ChildB(){
		this(1000); //아래의 다른 생성자를 호출하는것.
		System.out.println('C');
	}
	ChildB(int num2){
		super();
		System.out.println('D');
	}
}
public class Ex1304 {
	public static void main(String[] args) {
		ChildB obj = new ChildB();
	}
}
//C->D->A->B xx : B->A->D->C : this를 만나서 이동하고 super를 만나서 이동하고 this만나서 이동하고 출력 출력 출력 출력