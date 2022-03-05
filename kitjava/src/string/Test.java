package string;

public class Test {
	public static void main(String[] args) {
		String s1 = "정처기";
		String s2 = "웹개발";
		System.out.println(s1 + s2 ); //정처기웹개발 -> 문자열의 결합
		
		String s3 = "웹";
		String s4 = "웹"; 
		s3 = "web";
		
		System.out.println(s3); //객체 수정이 아닌 새롭게 만들어냄
		System.out.println(s4);
	}
}
