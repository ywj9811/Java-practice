package practice3;

import java.util.Scanner;

class Tr extends Thread {
	int arr1[];
	int arr2[];
	
	Tr(int arr1[], int arr2[]){
		this.arr1 = arr1;
		this.arr2 = arr2;
	}
	
	int cnt = 0;
	@Override
	public void run(){
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i]) {
				System.out.print("O ");
				cnt++;
			}
			else
				System.out.print("X ");
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(i == arr1.length-1) {
				System.out.println("점수 : " + 17*cnt);
			}
		}
	}
}

public class Correct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] my = new int[6];
		int[] co = new int[6];
		
		System.out.print("나의 정답 입력 : ");
		for(int i = 0; i < my.length; i++) {
			my[i] = sc.nextInt();
		}
		
		System.out.print("정답 입력 : ");
		for(int i = 0; i < my.length; i++) {
			co[i] = sc.nextInt();
		}
		
		Tr t = new Tr(my, co);
		t.run();
	}
}
