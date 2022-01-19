package day4;

public class ex404 {
//고급 : byte, short, char 등 "int보다 작은 정수형" -> +, -, *, / 를 하면 자동으로 int로 형 변환 후 연산됨.
//												그 결과 int형 값이 됨.
public static void main(String[] args) {
	byte a = 10;
	byte b = 20;
	int c = a + b; 
	// type mismatch -> byte형으로 나오는것이 아니라 int형이 되야한다.(int 보다 작은 정수형끼리 연산 = int형으로 형변환
	//int형으로 바꿔주면 괜찮아진다.
	//byte c = (byte)(a + b) 이렇게 강제 형변환 하여도 괜찮아진다.
	System.out.println("C : " + c);
	}

}
