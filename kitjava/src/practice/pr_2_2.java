package practice;

import java.util.Random;

public class pr_2_2 {
	public static void main(String[] args) {
		//�� �ڸ����� ���� �� 5 �� �����߻��Ͽ� �迭�� ���� �� �迭 ��ü�� ����ϰ� , �� �迭 �� ������ �� ���
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