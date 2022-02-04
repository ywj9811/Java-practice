package practice;

import java.util.Random;

public class pr_2_2 {
	public static void main(String[] args) {
		//한 자릿수인 정수 를 5 개 난수발생하여 배열에 담은 후 배열 전체를 출력하고 , 이 배열 을 정렬한 후 출력
		Random rd = new Random();
		int arr[] = new int [5];
		for(int i = 0; i < 5; i++) {
			arr[i] = rd.nextInt(10);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int t = 0; t < 5; t++) {
			for(int j = 0; j < 5; j++) {
				if(j == 4)
					break;
				
				int a = arr[j];
				int b = arr[j+1];
				if(a>b) {
					arr[j] = b;
					arr[j+1] = a;
					}
			}
		}

		for(int k = 0; k < 5; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}