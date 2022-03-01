package day16;

interface I2 {
	void m2(); //pa => public abstract
	default void m3() {
		System.out.println("디폴트 메소드 m3가 실행됨");
	}//원래는 추상메소드는 사용가능하지만 추가된 기능으로 가능해짐 default의 경우
}

class I2Impl implements I2 {
	@Override
	public void m2() {
		System.out.println("m2()메소드가 실행됨.");
	}
	
}
public class Ex1604 {
	public static void main(String[] args) {
		I2Impl obj = new I2Impl();
		obj.m2();
		obj.m3();
	}
}
