package prcatice2;
class NameCard {
	String name;
	String phone;
	String job;
	
	NameCard(String x, String y, String z) {
		name = x;
		phone = y;
		job = z;
	}
	void show() {
		System.out.println(job + " " + name + " : " + phone);
	}
}
public class Pr5 {
	public static void main(String[] args) {
		NameCard nc = new NameCard("YG", "010-5555-5555", "Thecher");
		nc.show();
	}
}
