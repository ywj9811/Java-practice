package practice;
//day6 24번 문제
import java.util.Arrays;

public class pr_2_4 {
	public static void main(String[] args) {
		int[] arr1 = {12,57,33,1};
		int[] arr2 = {5,7,9};
		int[] arr3 = new int [7];
		int i = 0;
		for(i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for(i = 0; i < arr2.length; i++) {
			arr3[i + 4] = arr2[i];
		}
		System.out.println("새로운 배열 (길이 " + arr3.length + ") : " + Arrays.toString(arr3));
	}
}