package practice;

public class Pr_3_3 {
	static void f(int n) {
		for(int i = n; i >= 1; i--) {
			System.out.print(i);
		}
		System.out.println();
	}
	static void f2(int n) {
		System.out.print(n);
		if(n == 1)
			return;
		f2(n-1);
	}
	public static void main(String[] args) {
		f(5);
		f2(5);
	}
}
