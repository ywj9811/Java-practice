package day18;

class MyRunnableA implements Runnable {
//인터페이스! -> implemnts
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
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
		Thread t1 = new Thread(r1); //r1에 Thread기능을 넣어주기 위해..? extends Thread를 하지않았기 때문에 파라미터로 Myrunnable 객체를 넣어준다.
									//t1에 r1의 메소드를 추가하여 사용 가능.
		t1.start();
		
		MyRunnableB r2 = new MyRunnableB();
		Thread t2 = new Thread(r2);
		t2.start();		
	}
}
