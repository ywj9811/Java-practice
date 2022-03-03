package day17;

public class Ex1708 {
	public static void main(String[] args) {
		try {
			int[] arr = {2, 0};
			int num = 4;
			int num2 = num / arr[0]; //이부분에서 예외상황이 발생(존재하지않는 index). java.lang.ArrayIndexOutOfBoundsException
			int num3 = num / arr[1]; //0으로 나누게되면 예외가 발생하게 된다. java.lang.ArithmeticException
			System.out.println("이 문장은 출력되지 않음.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 : 배열의 인덱스번호가 범위름 벗어났음!");
		} catch(ArithmeticException e) {
			System.out.println("예외 : 0 으로 나누려고 하였음!");
		}
		
		System.out.println("프로그램 정상 종료됨");
	}
}
