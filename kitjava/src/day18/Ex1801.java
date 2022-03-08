package day18;
//예외처리

public class Ex1801 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			arr[5] = 50;
		} catch(ArrayIndexOutOfBoundsException e) { //exception이름과 참조변수'e' 선언
			System.out.println("유효한 인덱스 범위를 벗어남!");
		} //예외가 처리됨.
		System.out.println("프로그램 정상 종료됨.");
	}
}
