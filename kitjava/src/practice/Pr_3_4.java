package practice;

import java.util.Random;

//8-11
public class Pr_3_4 {
	static void printarray(int[] arr) {
		int max = 0;
		System.out.print("난수 5개로 생성한 배열 : [ ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
			System.out.print(arr[i] + " ");
			if(i == arr.length-1)
				System.out.println("]");
		}
		System.out.println("최대값 : " + max);
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		for(int i = 0; i < 5; i++) {
			arr1[i] = rd.nextInt(10)+1;
			arr2[i] = rd.nextInt(10)+1;
		}
		
		printarray(arr1);
		printarray(arr2);
	}
}