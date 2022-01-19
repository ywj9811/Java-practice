package day4;

public class ex401 {
	public static void main(String[] args) {
		int num = 5;
		num++;
		num--;
		System.out.println(num); //5
		System.out.println("------------------");
		System.out.println(num--); //5
		System.out.println(num); //4
		System.out.println(num++); //4
		System.out.println(num); //5
		System.out.println("------------------");
		
		int num2 = num++; //num2에 5를 넣어주고 나서 num은 6으로 변한다.(후위 연산자니까)
		System.out.println("num : " + num); //6
		System.out.println("num2 : " + num2); //5
	}
}
