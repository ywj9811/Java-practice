package string;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s.length());
		//.length 길이 return
		
		System.out.println(s.equals("gello"));
		//.equals 내용비교(동등비교)
		
		String s3 = "aab";
		String s4 = "acb";
		String s5 = new String("acb");
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareTo(s5));
		//사전편찬순으로 비교( abc순)
		//더 앞설경우 -부호의 값.
		//같으면 0
		//뒤에 있을경우 +부호의 값
		
		String s6 = String.valueOf(5 * 55);
		//.valueOf(숫자) 숫자를 문자열로 바꿔주는 클래스 메소드
		
		String str = "자바_웹개발"; 
		String[] arr = str.split("_");
		System.out.println("arr : " + Arrays.toString(arr));
		//.split() 문자열을 쪼개어 배열로 만들어줌.
		
		System.out.println(str.substring(3));
		//.substring(시작인덱스) : 시작인덱스부터 끝까지의 부분문자열리턴.
		
		System.out.println(str.indexOf("자"));
		//.indexOf(문자열) : 문자열의 위치(인덱스)/ 없을경우 -1을 리턴
		System.out.println(str.lastIndexOf("발"));
		//.lastIndexOf(문자열) : (오른쪽부터)
	}
}
