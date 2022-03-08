package day18;

public class Ex1802 {
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(s1.length()); //5
		
		try {
			String s2 = null; //참조변수가 아무값도 가지지 않는다.(그 어디도 가리키고있지 않음);
			  //참조값이 비어있음!
			System.out.println(s2.length()); //excetion발생 --> null이기 때문에 어떠한 값도 가리키고있지 않아서
		} catch(NullPointerException e) {
			System.out.println("객체가 없는데 참조하려 하였음!");
		}
		
		System.out.println("프로그램 정상 종료됨.");
	}
}
