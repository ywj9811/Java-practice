package day15;

import java.util.Random;

public class Ex1507 {
	public static void main(String[] args) {
		P1[] arr = new P1[5]; //��ü �迭 ����. �� �迭�� ��ü���� ���� �ȴ�.
		Random rd = new Random();
		
		for(int i = 0; i < 5; i++) {
			int r = rd.nextInt(2);
			if(r == 0)
				arr[i] = new P1(); //�ش� �迭���� P1��ü�� ��.
			else
				arr[i] = new C1(); //�ش� �迭���� C1��ü�� ��.
		}
		
		for(int i = 0; i < 5; i++) {
			arr[i].showWho(); //arr[i]���� ���� P1 Ȥ�� C1 ��ü�� ����ִ�
		}
	}
}
