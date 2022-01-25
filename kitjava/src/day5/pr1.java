package day5;

	//별패턴 연습
	import java.util.Scanner;
	public class pr1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("별 몇 줄 찍을까요 : ");
			
			int i = sc.nextInt();
			
			for (int a=0; a<i; a++) {
				for (int b=0; b<a+1; b++) {
					System.out.print("*");
				}
					System.out.println();
			}
		}
	}


