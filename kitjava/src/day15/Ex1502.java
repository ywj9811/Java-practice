package day15;

class A {
	private int n = 5; //n을 private로 지정함 => 필드의 경우는 private를 붙이는것이 좋다.
											//외부에서 건드릴 수 없도록
	int getN() {
		return n; //n은 private이기 때문에 따로 메소드를 작성하여 접근할 수 있도록 도와준다.
	}
	int setN(int n) {
		this.n = n;
		return n;
	}
}

class B extends A{
	void show() {
		System.out.println("n : "  + getN()); //n은 class A 에서 private로 지정이 되어있기 때문에
										 //다른 클래스(자식 포함)에서 접근할 수 없다.
	}
	void set(int a) {
		setN(a);
		System.out.println("n : " + getN());
	}
}
public class Ex1502 {
	public static void main(String[] args) {
		B b = new B();
		b.show();
		b.set(2);
	}
}
