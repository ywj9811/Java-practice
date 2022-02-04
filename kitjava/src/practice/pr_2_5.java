package practice;

import java.util.Arrays;

//day7 11번
public class pr_2_5 {
	static int[] arrconcat(int[] ex1, int[] ex2) {
		int arr[] = new int[ex1.length + ex2.length];
		for(int i = 0; i < ex1.length; i++) {
			arr[i] = ex1[i];
		}
		for(int i = 0; i < ex2.length; i++) {
			arr[i+ex1.length] = ex2[i];
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 5, 7};
		int[] arr2 = {2, 6, 8};
		int[] arr3 = arrconcat(arr1, arr2);
		System.out.println("두 배열을 합친 배열 : " + Arrays.toString(arr3));
	}
}