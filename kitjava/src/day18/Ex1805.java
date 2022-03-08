package day18;

public class Ex1805 {
	public static void main(String[] args) {
		try {
			int a = 5 / 0;
			System.out.println(a); //실행x
		} catch(ArithmeticException e) {
			//System.out.println("0으로 나눌 수 없음...");
			e.printStackTrace(); //가장 일반적인 예외처리 문장.
		}
	}
}
