package day18;
//finally 키워드 정리!

public class Ex1803 {
	public static void main(String[] args) {
		try {
			System.out.println("<0으로 나누기 전>");
			int c = 5 / 0;  //여기서 예외가 발생함
			System.out.println("<0으로 나눈 후>");
		} catch(NullPointerException e) {
			//NullPoint 예외 상황이 발생할 경우
			System.out.println("null pointer ... ");
		} catch(ArithmeticException e) {
			//0으로 나누려고 할 경우
			System.out.println("0으로 나누려고 함");
		} finally {
			//finally영역 : 위의 try영역에 진입한 이상 무조건 실행되는 영역!
			System.out.println("finally 영역 실행됨.");
		}
		
		System.out.println("프로그램 정상 종료됨.");
	}
}
