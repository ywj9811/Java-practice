package day18;

class a {
	static int a = 0;
}
// 1. extends Thread
// 2. run()�޼ҵ带 �������̵�
// 3. ��ü���� �� start() ȣ�� -> run()�� �۵���Ŵ
class ThreadA extends Thread {
	@Override
	public void run() {
		//1�ʿ� �ѹ��� '�ȳ��ϼ���' ��� 5��
		for(int i = 0; i < 5; i++) {
			a.a++;
			System.out.println(a.a);
			System.out.println("�ȳ��ϼ���");
			try {
				sleep(1000); // 1000ms = 1s (sleep -> (n)ms��ŭ ����
			}catch(InterruptedException e) {
				e.printStackTrace();
			} //exception���� �ΰ��� ������ �ִµ� �ϳ��� ������ �ǰ� �� �� �ִ� exception��
			  //ó���� ���������� ��������ʴ� exception�� �ִ�.
			  //���� try catch�� ����� ���̴�.
		}
	}
}

//ThreadB�� �ۼ� : 1�ʿ� �ѹ��� Hello��� ���

class ThreadB extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			a.a++;
			System.out.println(a.a);
			System.out.println("Hello");
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex1806 {
	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		t1.start();  //t1�� ������μ� ����ϱ� ������
		t2.start();  //t2 ���� ��������
		
		System.out.println("main-thread ����");
		try {
			t1.join(); //t1�� �����⸦ ��ٸ� : main-thread�� ��ٸ�
			t2.join(); //t2�� �����⸦ ��ٸ� : main-thread�� ��ٸ�
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(a.a);
		System.out.println("main-thread ���� �����");
	}
}
