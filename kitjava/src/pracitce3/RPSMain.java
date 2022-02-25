package pracitce3;

public class RPSMain {
	public static void main(String[] args) {
		RPSController rpsc = new RPSController();
		System.out.println("가위 바위 보 게임입니다");
		System.out.println("시작하겠습니다.");
		
		rpsc.comNext(); //컴퓨터에 값 넣어줌.
		
		do {
			rpsc.inputPlayer();
		} while(!rpsc.isValidPlayer());
		
		rpsc.showBoth();
		
		boolean result1 = rpsc.winPlayer();
		boolean result2 = rpsc.draw();
		
		if(result1 == true) {
			System.out.println("이겼습니다!");
		}
		
		else {
			if(result2 == true)
				System.out.println("비겼습니다.");
			else
				System.out.println("졌습니다.");
		}
	}
}
