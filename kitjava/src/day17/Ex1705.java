package day17;

import java.util.Arrays;

public class Ex1705 {
	public static void main(String[] args) {
		int[] arr = new int[5]; //��ȿ�� �ε��� ��ȣ : 0 ~ 4
		for(int i = 0; i < 6; i++) {
			arr[i] = i*10;
		}
		System.out.println(Arrays.toString(arr)); //i = 5�ϰ�� ���� �� �߻�, ������ �������� �߻�x -> 12�� ���� ������� ����.
												  //�� 9�� �࿡�� ������ ������.
	}
}

//ArrayIndexOutOfBoundsException �� �迭�� �ε����� ������ �����!