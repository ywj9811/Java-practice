package prcatice2;
class FourCalculator {
	int a;
	int b;
	int result;
	String op;
	
	int getresult() {
		return result;
	}

	static int count = 0;
	static void manual() {
		System.out.println("+ ,- ,* �� ����� �� �ִ� ������ ���� �Դϴ�.");
	}
	
	FourCalculator(int a, int b, String op){
		this.a = a;
		this.b = b;
		this.op = op;
	}
	
	void calc() {
		if(op == "+") {
			result = (a+b);
			System.out.println(a + "+" + b + "=" + (a+b));
			count = count++;
		}
		if(op == "-") {
			result = (a-b);
			System.out.println(a + "-" + b + "=" + (a-b));
			count = count++;
		}
		if(op == "*") {
			result = (a*b);
			System.out.println(a + "*" + b + "=" + (a*b));
			count = count++;
		}
	}
}

public class Pr7 {
	public static void main(String[] args) {
		FourCalculator.manual();
		System.out.println();
		FourCalculator fc1 = new FourCalculator(2, 3, "+");
		fc1.calc();
		int a = fc1.getresult();
		
		FourCalculator fc2 = new FourCalculator(4, 5, "-");
		fc2.calc();
		int b = fc2.getresult();
		
		FourCalculator fc3 = new FourCalculator(4, 5, "*");
		fc3.calc();
		int c = fc3.getresult();
		
		System.out.println("���1 : " + a + " ���2 : " + b + " ���3 : " + c + " ���� Ƚ�� : " + FourCalculator.count);
	}
}
//�� count ������ �ȵǴ°�..?