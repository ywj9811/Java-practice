package day17;

public class Ex1706 {
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(s1.length()); //5를 return하게 된다.
		
		String s2 = null;  //null : 참조하는 (곳이)객체가 없다 라는 의미.
		System.out.println(s2.length());  //참조하는 부분이 없기 때문에!
		
		System.out.println("프로그램 정상 종료됨.");
	}
}

//java.lang.NullPointerException : Null값을 따라가서 객체 참조하려고 하였다.