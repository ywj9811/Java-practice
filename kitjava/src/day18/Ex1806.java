package day18;

class a {
	static int a = 0;
}
// 1. extends Thread
// 2. run()메소드를 오버라이딩
// 3. 객체생성 후 start() 호출 -> run()을 작동시킴
class ThreadA extends Thread {
	@Override
	public void run() {
		//1초에 한번씩 '안녕하세요' 출력 5번
		for(int i = 0; i < 5; i++) {
			a.a++;
			System.out.println(a.a);
			System.out.println("안녕하세요");
			try {
				sleep(1000); // 1000ms = 1s (sleep -> (n)ms만큼 정지
			}catch(InterruptedException e) {
				e.printStackTrace();
			} //exception에는 두가지 종류가 있는데 하나는 실행이 되고 알 수 있는 exception과
			  //처리를 하지않으면 실행되지않는 exception이 있다.
			  //따라서 try catch를 사용한 것이다.
		}
	}
}

//ThreadB를 작성 : 1초에 한번씩 Hello라고 출력

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
		t1.start();  //t1이 쓰레드로서 기능하기 시작함
		t2.start();  //t2 또한 마찬가지
		
		System.out.println("main-thread 시작");
		try {
			t1.join(); //t1이 끝나기를 기다림 : main-thread가 기다림
			t2.join(); //t2가 끝나기를 기다림 : main-thread가 기다림
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(a.a);
		System.out.println("main-thread 실행 종료됨");
	}
}
