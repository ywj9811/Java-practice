package practice;

import java.util.Arrays;
import java.util.Scanner;

//5��
public class pr_2_7 {
	static double getaverage(int a, int b, int c) {
		return (a + b + c)/3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.print(i+1+"��° ���� �Է� : ");
			arr[i] = sc.nextInt();
		}
		double avg = getaverage(arr[0], arr[1], arr[2]);
		System.out.println("�迭 : " + Arrays.toString(arr));
		System.out.println("��� : " + avg + "�Դϴ�");
		
		sc.close();
	}
}
