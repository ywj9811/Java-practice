package day3;

public class ex301 {
	public static void main(String[] args) {
		double n1 = 5; //자동으로 형변환을 시킴 => 5.0
		System.out.println(n1);
		//int n2 = 5.0 -> 자동으로 형변환이 이루어지지 않음
		
		n1 = n1 + 3.3;
		System.out.println(n1);
	}
}
