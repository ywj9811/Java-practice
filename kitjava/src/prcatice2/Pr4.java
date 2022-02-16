package prcatice2;

class Numbers {
	int num1; 
	int num2;
	Numbers(int x, int y){
		num1 = x;
		num2 = y;
	}
	
	void show() {
		System.out.println("num1 : " + num1 + " num2 : " + num2);
	}
}

public class Pr4 {
	public static void main(String[] args) {
		Numbers num = new Numbers(5, 3);
		num.show();
	}
}
