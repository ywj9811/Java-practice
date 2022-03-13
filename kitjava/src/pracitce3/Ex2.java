package practice3;

public class Ex2 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			if(i == 0) {
				int a = num%10;
				sum = sum + a;
			}
			
			else if(i == 1) {
				int a = num/10%10;
				sum = sum + a;
			}
			
			else if(i == 2) {
				int a = num/100%10;
				sum = sum + a;
			}
			
			else if(i == 3) {
				int a = num/1000%10;
				sum = sum + a;
			}
			
			else if(i == 4) {
				int a = num/10000;
				sum = sum + a;
			}
		}
		
		System.out.println("sum = " + sum);
	}
}
