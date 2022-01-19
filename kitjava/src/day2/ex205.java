package day2;
//변수 자료형의 표현범위 내의 값만 저장!
public class ex205 {
	public static void main(String[] args) {
		byte b = 127; //byte => -128~127 if b = 128을 넣게되면 표현범위에서 넘어가서 오류가 발생
		b++; //이후에 b의 값을 1 증가시키는 (증감 연산자)
			 //--> 결과가 128이 나오는것이 아니라 'overflow'가 발생하여 -128이 나온다.
		System.out.println("b : "  + b); //b : 127 or 128
		
		boolean b2 = true;
		System.out.println("b2 : " + b2); //b2 : true
	}
}
