package day5;

	//������ ����
	import java.util.Scanner;
	public class pr1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�� �� �� ������� : ");
			
			int i = sc.nextInt();
			
			for (int a=0; a<i; a++) {
				for (int b=0; b<a+1; b++) {
					System.out.print("*");
				}
					System.out.println();
			}
		}
	}


