package day18;

class Common {
	int num = 0;
	void addNum(int n) {
		num += n;
	}
}

class MyThread extends Thread {
	Common common;
	int start, end;
	
	MyThread(Common common, int start, int end){ //필드변수로 참조변수가 사용됨!!
		this.common = common;
		this.end = end;
		this.start = start;
	}
	
	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			common.addNum(i);
		}
	}
}
public class Ex1808 {
	public static void main(String[] args) {
		Common obj = new Common();
		MyThread th1 = new MyThread(obj, 1, 50);
		MyThread th2 = new MyThread(obj, 51, 100);
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(obj.num);
	}
}
