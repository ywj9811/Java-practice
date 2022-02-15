package practice;
//4번 꼬아보기
class Lamplight{
	boolean ison;
	String status;
	//새로 작성하는 클래스 내부의 메소드가 아닌 부분에 if문을 작성할 수 없나.
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
		System.out.println("Lamp가 " + (ison ? "켜" : "꺼") + "져 있습니다.");
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

