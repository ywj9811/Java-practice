package practice;

import java.util.Arrays;
import java.util.Scanner;

//5번
public class pr_2_7 {
	static double getaverage(int a, int b, int c) {
		return (a + b + c)/3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.print(i+1+"번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		double avg = getaverage(arr[0], arr[1], arr[2]);
		System.out.println("배열 : " + Arrays.toString(arr));
		System.out.println("평균 : " + avg + "입니다");
		
		sc.close();
	}
}
