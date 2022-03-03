package day17;

interface Message {
	String greet(); //추상메소드. public abstract(pa)
}

public class Ex1704 {
	static void showMessage(Message m) { //Message는 interface이다. -> 부-자 에서 부의 역할 가능.
										 //m은 Message를 구현한 클래스의 객체를 가리키는 참조변수.
		System.out.println("메시지는 : " + m.greet());
	}

	public static void main(String[] args) {
		showMessage(new Message() { //showMessage 메소드가 실행되도록 한 것이다.
			@Override
			public String greet() {
				return "익명클래스 안녕";
			}
		}); //()내부에 Message를 구현한 클래스의 객체의 참조값.	
			//즉 내용이 ***** m = new Message() { ~~~~~}; *****이렇게 들어간 것이다.
	}
}
