package day2;

public class ex206 {
	public static void main(String[] args) {
		int a = 5;
		a = 6;
		a++;
		System.out.println(a); //7
		
		final int b = 10; //상수로 10을 선언 -> 수정 불가능한 상수
		//b = 12 //err
		//b++ //err
		// ==> 상수이기 때문에 오류 발생
		System.out.println(b); //10
		
		final int c; //상수 선언만 하고 초기화는 나중에 해도 된다.
		c = 10; //상수의 초기화를 하지 않았을 경우 이후에 한번은 초기화 가능.
		//초기화 이후는 수정 불가능
		System.out.println(c); //10
	}
}
