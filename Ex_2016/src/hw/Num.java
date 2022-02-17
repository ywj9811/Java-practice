package hw;

import java.util.Random;

public class Num {
		public static void main(String[] args) {
			Random rd = new Random();	
			int num[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			
			for(int i = 0; i < 100; i++) {
				int a = rd.nextInt(10);
				System.out.print(a);
				if(a == 0) {
					num[0] = num[0] + 1;
				}
				if(a == 1) {
					num[1] = num[1] + 1;
				}
				if(a == 2) {
					num[2] = num[2] + 1;
				}
				if(a == 3) {
					num[3] = num[3] + 1;
				}
				if(a == 4) {
					num[4] = num[4] + 1;
				}
				if(a == 5) {
					num[5] = num[5] + 1;
				}
				if(a == 6) {
					num[6] = num[6] + 1;
				}
				if(a == 7) {
					num[7] = num[7] + 1;
				}
				if(a == 8) {
					num[8] = num[8] + 1;
				}
				if(a == 9) {
					num[9] = num[9] + 1;
				}
			}	
			
			System.out.println();
			
			for(int j = 0; j < 10; j++) {
				System.out.print(j + "ÀÇ °³¼ö : " );
				for(int n = 0; n < num[j]; n++) {
					System.out.print("#");
				}
				System.out.println(" " + num[j]);
			}
	}
}
