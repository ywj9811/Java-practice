package day18;

class MyRunnableA implements Runnable {
//�������̽�! -> implemnts
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("�ȳ��ϼ���");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyRunnableB implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex1807 {
	public static void main(String[] args) {
		MyRunnableA r1 = new MyRunnableA();
		Thread t1 = new Thread(r1); //r1�� Thread����� �־��ֱ� ����..? extends Thread�� �����ʾұ� ������ �Ķ���ͷ� Myrunnable ��ü�� �־��ش�.
									//t1�� r1�� �޼ҵ带 �߰��Ͽ� ��� ����.
		t1.start();
		
		MyRunnableB r2 = new MyRunnableB();
		Thread t2 = new Thread(r2);
		t2.start();		
	}
}
