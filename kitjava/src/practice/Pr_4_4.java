package practice;
//����! -> ��ü�迭�� ���� ��ƴ�!
import java.util.Random;

class Rectangle {
	int x;
	int y;
}

public class Pr_4_4 {
	static int sumarea(Rectangle[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i].x * arr[i].y;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Rectangle[] rect = new Rectangle[3];
		Random rd = new Random();

		for(int i = 0; i < rect.length; i++) {
			rect[i].x = rd.nextInt();
			rect[i].y = rd.nextInt();
			System.out.println("�ʺ� " + rect[i].x + " �̰� ���̰�" + rect[i].y + " �� Rectangle ��ü�� ������.");
		}
		System.out.println(sumarea(rect));
	}
}
