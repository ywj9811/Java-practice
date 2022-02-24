package day15;

import java.util.Random;

public class Ex1507 {
	public static void main(String[] args) {
		P1[] arr = new P1[5]; //객체 배열 선언. 각 배열에 객체들이 들어가게 된다.
		Random rd = new Random();
		
		for(int i = 0; i < 5; i++) {
			int r = rd.nextInt(2);
			if(r == 0)
				arr[i] = new P1(); //해당 배열에는 P1객체가 들어감.
			else
				arr[i] = new C1(); //해당 배열에는 C1객체가 들어감.
		}
		
		for(int i = 0; i < 5; i++) {
			arr[i].showWho(); //arr[i]에는 각각 P1 혹은 C1 객체가 들어있다
		}
	}
}
