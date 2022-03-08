package practice3;

class Input extends Thread{
	
	String arr[] = new String[100];
	Input(String[] arr){
		this.arr = arr;
	}
	
	@Override
	public void run(){
		for( int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			try {
				sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
//���⼭ run�� �Ű������� ���𰡸� �ַ��� �ϸ� @Override ������ ������ �߻��ϰ� �Ǵ°�. �³�.

public class Tpractice{
	public static void main(String[] args) {
		String[] arr = {"H","e","l","l","o"," ","I","'","m"," ","J","a","v","a"," ","T","h","r","e","a","d","!"};		
		Input a = new Input(arr); //�Ű������� �迭�� �Ѱ��� ��� �̸����� �Ѱ��־��.
								  //�̸��� arr�ϱ�.
		a.run();
	}
}
