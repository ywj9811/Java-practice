package day4;
//**3항 연산자 사용**
public class ex402 {
	public static void main(String[] args) {
/*	
 		int num = 5;
		char ch = (num%2==0) ? 't' : 'f'; //조건식 ? 참일때 : 거짓일때 --> 거짓이니까 ch = 'f'가 된다.
		System.out.println(ch); //f
*/
		//삼항연산자를 사용해서, 최댓값/ 최솟값을 츨력.
		int a = 31;
		int b = 20;
		int max = (a>b) ? a: b;
		//a가 b보다 크다면 a(참), 작다면 b(거짓)
		System.out.println("최대값 : " + max);
		int min = (a>b) ? b: a;
		System.out.println("최솟값 : " + min);
		
	}
}
