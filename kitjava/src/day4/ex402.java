package day4;
//**3�� ������ ���**
public class ex402 {
	public static void main(String[] args) {
/*	
 		int num = 5;
		char ch = (num%2==0) ? 't' : 'f'; //���ǽ� ? ���϶� : �����϶� --> �����̴ϱ� ch = 'f'�� �ȴ�.
		System.out.println(ch); //f
*/
		//���׿����ڸ� ����ؼ�, �ִ�/ �ּڰ��� ����.
		int a = 31;
		int b = 20;
		int max = (a>b) ? a: b;
		//a�� b���� ũ�ٸ� a(��), �۴ٸ� b(����)
		System.out.println("�ִ밪 : " + max);
		int min = (a>b) ? b: a;
		System.out.println("�ּڰ� : " + min);
		
	}
}
