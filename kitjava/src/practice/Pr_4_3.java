package practice;
//4�� ���ƺ���
class Lamplight{
	boolean ison;
	String status;
	//���� �ۼ��ϴ� Ŭ���� ������ �޼ҵ尡 �ƴ� �κп� if���� �ۼ��� �� ����.
	void turnon() {
		status = "on";
	}
	
	void turnoff() {
		status = "off";
	}
	void change() {
		if(status == "on")
			ison = true;
		else
			ison = false;
	}
	void printlight() {
		System.out.println("Lamp�� " + (ison ? "��" : "��") + "�� �ֽ��ϴ�.");
	}
}

public class Pr_4_3 {
	public static void main(String[] args) {
		Lamplight lp = new Lamplight();
		
		lp.status = "off";
		lp.ison = false;
		
		lp.turnon();
		lp.change();
		lp.printlight();
		
		lp.turnoff();
		lp.change();
		lp.printlight();
		
	}
}

