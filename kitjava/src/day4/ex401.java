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
		
		int num2 = num++; //num2�� 5�� �־��ְ� ���� num�� 6���� ���Ѵ�.(���� �����ڴϱ�)
		System.out.println("num : " + num); //6
		System.out.println("num2 : " + num2); //5
	}
}
