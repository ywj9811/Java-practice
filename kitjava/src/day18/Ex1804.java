package day18;

public class Ex1804 {
	static void m() throws Exception{
		int[] arr = {10, 20, 30};
		for(int i = 1; i <= 3; i++) {
			System.out.println(arr[i] + " "); //excetion �߻�. i=3�� �Ǵ� ������
		}
	} //JVM�� main()�� �����Ŵ main --> m() ����.  : JVM -> main() -> m()
	
	static void m2() throws Exception { //����ó������ �ʰ� ȣ�����ʿ� ó���� ���ѱ�.
				throw new Exception("���ܸ޽��� ���� 1"); //'���ܸ� �����ؼ� ������' : throw = ���ܸ� �߻���Ű�� ��ɾ�.
													 //==���ܰ�ü�� �����ؼ� ������
	}
	public static void main(String[] args) {
		//m();  //m()�޼ҵ忡�� ó���� ���ѱ�!
		try {
			m2();
		} catch(Exception e) {
			System.out.println("ó��");
		}
	}
}
