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
		this(1000); //�Ʒ��� �ٸ� �����ڸ� ȣ���ϴ°�.
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
//C->D->A->B xx : B->A->D->C : this�� ������ �̵��ϰ� super�� ������ �̵��ϰ� this������ �̵��ϰ� ��� ��� ��� ���