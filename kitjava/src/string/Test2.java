package string;

public class Test2 {
	public static void main(String[] args) {
		String s6 = "웹";
		String s7 = "웹";
		String s8 = new String("웹");
		
		System.out.println(s6.equals(s7));
		System.out.println(s7.equals(s8));
		System.out.println(s6 == s7);// 참조이 똑같다.
									 // 똑같은 객체를 가리키는중
		System.out.println(s6 == s8);
	}
}
