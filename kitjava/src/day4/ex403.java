package day4;
//스캐너 객체의 사용법
import java.util.Scanner; //scanner 객체 생성

public class ex403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 쓰고나서 컨트롤 + 쉬프트 + o => import 생성
		System.out.print("정수 입력 : ");
		int input = sc.nextInt(); //정수값 입력받기
		
		System.out.println("input : " + input);
	}
}
