package pracitce3;

public class RPSMain {
	public static void main(String[] args) {
		RPSController rpsc = new RPSController();
		System.out.println("���� ���� �� �����Դϴ�");
		System.out.println("�����ϰڽ��ϴ�.");
		
		rpsc.comNext(); //��ǻ�Ϳ� �� �־���.
		
		do {
			rpsc.inputPlayer();
		} while(!rpsc.isValidPlayer());
		
		rpsc.showBoth();
		
		boolean result1 = rpsc.winPlayer();
		boolean result2 = rpsc.draw();
		
		if(result1 == true) {
			System.out.println("�̰���ϴ�!");
		}
		
		else {
			if(result2 == true)
				System.out.println("�����ϴ�.");
			else
				System.out.println("�����ϴ�.");
		}
	}
}
