package ex1_static;

public class Bank {
	private String point; //������ ��ġ�� ����
	private String tel; //������ ��ȭ��ȣ ����
	static float interest = 10;
	
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	} //Bank b1 = new Bank(��, ��) �̷��� ������ �Ѵ�. => �����ڿ� �־��� �Ű������� �ʿ��ϴϱ�.
	
	public void myBank() {
		System.out.println("���� : " + point);
		System.out.println("��ȭ��ȣ : " + tel);
		System.out.println("������ : " + interest + "%");
		System.out.println("===============================");
	}
}
