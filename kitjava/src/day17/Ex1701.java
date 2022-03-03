package day17;

class Outer3 {
	int n = 5;
	void m3() {
		//int num = 55; //지역변수임.
		class Local3 {
			void showN() {
				System.out.println("n : " + n);
			}
		}
		
		Local3 local = new Local3();
		local.showN();
	}
}

public class Ex1701 {
	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		outer.m3(); //m3 내부에서 클래스를 만들고 그 클래스의 객체를 통해서 함수가 호출되니
					//자동으로 클래스까지 만들어지고 객체생성, 사용 모두 작동하게된다.
	}
}
