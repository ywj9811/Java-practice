package day16;

//class A4 {
//	private int num = 5;
//	int getNum() {
//		return num;
//	}
//}
//
//class B4 extends A4{
//	void showNum() {
//		System.out.println(getNum());
//	}
//} private�� �ٷ� �ҷ��� ������.

class A4 {
	private int num = 5;
	class B4 { //��øŬ����! --> B4�� ����Ŭ����. 
		void showNum() {
			System.out.println(num);
		}
	}
}
public class Ex1606 {
	public static void main(String[] args) {
		A4 obj = new A4();
		A4.B4 obj2 = obj.new B4(); //�̰��� ��øŬ������ ����Ŭ������ ����ϱ� 
		obj2.showNum(); //B4Ŭ������ ����ƽŬ���� ��ü ������ ���ϸ� ����.
	}
}
