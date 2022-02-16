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
		System.out.println("+ ,- ,* 를 사용할 수 있는 정수형 계산기 입니다.");
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
		
		System.out.println("결과1 : " + a + " 결과2 : " + b + " 결과3 : " + c + " 실행 횟수 : " + FourCalculator.count);
	}
}
//왜 count 증가가 안되는가..?