package pracitce3;

import java.util.Random;
import java.util.Scanner;

public class RPSController {
	final String[] arrRPS = {"가위", "바위", "보" };
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
		if(player == "가위")
			return true;		
		else if(player == "바위") {
			return true;
		}
		else if(player == "보") {
			return true;
		}
		else{
			System.out.println("다시 입력해주세요");
			return false;
		} //사용자가 입력을 제대로 했는지 확인
	}
	void inputPlayer() {
		System.out.print("입력(가위/바위/보) >> ");
		player = sc.next();
	} //사용자의 가위 바위 보 입력
	
	boolean winPlayer() {
		if(com == "가위") {
			if(player == "바위")
				return true;
			else
				return false;
		}
		
		else if(com == "바위") {
			if(player == "보")
				return true;
			else
				return false;
		}
		
		else {
			if(player == "가위")
				return true;
			else
				return false;
		}
	}//plaeyr가 이겻으면 true 아니면 false
	
	boolean draw() {
		if(com == player)
			return true;
		else
			return false;
	}//비기면 true 아니면 false
	
	void showBoth() {
		System.out.print("player(" + player + ") vs com(" + com + ") -> ");
	}
}
