package day4;

import java.util.Scanner;

/*[���]	���� 3���� �Է¹ް�,
�̵� �� �ִ밪�� �ּҰ��� ���.
(��, ���ǹ� ����� ����.)
*/
public class hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° : ");
		int first = sc.nextInt();
		System.out.print("�ι�° : ");
		int second = sc.nextInt();
		System.out.print("����° : ");
		int third = sc.nextInt();
		
		int max = (first > second) ? (first>third) ? first : third : (second > third) ? second : third;
		System.out.println("max : " + max);
		
		int min = (first < second) ? (first<third) ? first : third : (second < third) ? second : third;
		System.out.println("min : " + min);
	}
}
