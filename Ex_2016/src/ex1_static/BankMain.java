package ex1_static;

public class BankMain {
	public static void main(String[] args) {
		Bank b1 = new Bank("È«´ë", "02-000-0000");
		Bank b2 = new Bank("½ÅÃÌ", "02-111-1111");
		Bank b3 = new Bank("ÀÌ´ë", "02-222-2222");
		
		Bank.interest = 0.10f;
		
		b1.myBank();
		b2.myBank();
		b3.myBank();
	}
}
