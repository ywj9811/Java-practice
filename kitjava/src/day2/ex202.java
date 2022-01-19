package day2;
//실수의 사용은 오차를 동반한다. 결과를 보면 끝에 4가 들어가는 등 오류가 동반된다. => 근사값 사용
public class ex202 {
	public static void main(String[] args)
	{
		double d = 0.1 + 0.2;
		System.out.println("d : " + d);
		
		double a = 1.000000000000001; //0이 14개
		double b = 1.1;
		double c = a+b;
		System.out.println("c : " + c);
	}
}
