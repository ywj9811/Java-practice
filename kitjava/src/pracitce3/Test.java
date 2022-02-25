package practice3;

class TextMessage{
	private String msg;
	
	TextMessage(String msg) {
		this.msg = msg;
	}
	
	String getMsg() {
		return msg;
	}
	
	void show() {
		System.out.println(msg);
	}
}

class TextMessageVer2 extends TextMessage {
	private String name;
	
	TextMessageVer2(String name, String msg) {
		super(msg);
		this.name = name;
	}
	
	@Override
	void show() {
		System.out.println(name + "�� \"" + super.getMsg() + "\"��� �����ϼ̴�.");
	}
}

public class Test {
	public static void main(String[] args) {
		TextMessage msgObj;
//		msgObj = new TextMessage("Ŭ������ ������ �� ����.");
//		msgObj.show();
//		
//		msgObj = new TextMessageVer2("YG", "�ݺ����� ����̴�.");
//		msgObj.show();
		for(int i = 0; i < 2; i++) {
			if(i == 0) {
				msgObj = new TextMessage("Ŭ������ ������ �� ����.");
				msgObj.show();
			}
			else {
				msgObj = new TextMessageVer2("YG", "�ݺ����� ����̴�.");
				msgObj.show();
			}
		}
	}
}
