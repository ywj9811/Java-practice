package day18;

public class Ex1804 {
	static void m() throws Exception{
		int[] arr = {10, 20, 30};
		for(int i = 1; i <= 3; i++) {
			System.out.println(arr[i] + " "); //excetion 발생. i=3이 되는 순간에
		}
	} //JVM이 main()를 실행시킴 main --> m() 실행.  : JVM -> main() -> m()
	
	static void m2() throws Exception { //직접처리하지 않고 호출한쪽에 처리를 떠넘김.
				throw new Exception("예외메시지 예시 1"); //'예외를 생성해서 던져라' : throw = 예외를 발생시키는 명령어.
													 //==예외객체를 생성해서 던져라
	}
	public static void main(String[] args) {
		//m();  //m()메소드에서 처리를 떠넘김!
		try {
			m2();
		} catch(Exception e) {
			System.out.println("처리");
		}
	}
}
