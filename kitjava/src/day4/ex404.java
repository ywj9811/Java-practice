package day4;

public class ex404 {
//��� : byte, short, char �� "int���� ���� ������" -> +, -, *, / �� �ϸ� �ڵ����� int�� �� ��ȯ �� �����.
//												�� ��� int�� ���� ��.
public static void main(String[] args) {
	byte a = 10;
	byte b = 20;
	int c = a + b; 
	// type mismatch -> byte������ �����°��� �ƴ϶� int���� �Ǿ��Ѵ�.(int ���� ���� ���������� ���� = int������ ����ȯ
	//int������ �ٲ��ָ� ����������.
	//byte c = (byte)(a + b) �̷��� ���� ����ȯ �Ͽ��� ����������.
	System.out.println("C : " + c);
	}

}
