package pracitce3;

import java.util.Random;
import java.util.Scanner;

public class RPSController {
	final String[] arrRPS = {"����", "����", "��" };
	String player;
	String com;
	Scanner sc;
	Random rd = new Random();
	RPSController(){ sc = new Scanner(System.in);}
	
	void comNext() {
		int i = rd.nextInt(3);
		com = arrRPS[i];
	}
	
	boolean isValidPlayer() {
		if(player == "����")
			return true;		
		else if(player == "����") {
			return true;
		}
		else if(player == "��") {
			return true;
		}
		else{
			System.out.println("�ٽ� �Է����ּ���");
			return false;
		} //����ڰ� �Է��� ����� �ߴ��� Ȯ��
	}
	void inputPlayer() {
		System.out.print("�Է�(����/����/��) >> ");
		player = sc.next();
	} //������� ���� ���� �� �Է�
	
	boolean winPlayer() {
		if(com == "����") {
			if(player == "����")
				return true;
			else
				return false;
		}
		
		else if(com == "����") {
			if(player == "��")
				return true;
			else
				return false;
		}
		
		else {
			if(player == "����")
				return true;
			else
				return false;
		}
	}//plaeyr�� �̰����� true �ƴϸ� false
	
	boolean draw() {
		if(com == player)
			return true;
		else
			return false;
	}//���� true �ƴϸ� false
	
	void showBoth() {
		System.out.print("player(" + player + ") vs com(" + com + ") -> ");
	}
}
