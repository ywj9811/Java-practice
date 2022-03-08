package pracitce3;

public class Wrapperuse {
	public static void main(String[] args) {
		int num = 5; //stack 영역
		Integer num2 = 5; //heap영역에 객체가 생성됨.
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num2.toString());
		//num2.toString()이란 num2의 참조값이 가리키는 값을 출력
		//sysout(num2)를 하게되면 자동으로 toString()이 작동함.
		
		int sum = num + num2;
		System.out.println(sum);
	}
}
