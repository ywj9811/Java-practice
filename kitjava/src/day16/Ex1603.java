package day16;

import day16B.InterA;

class InterAImpl implements InterA {
	@Override
	public void showNum() { //override는 접근제어자가 같거나 넓어지도록
							//인터페이스의 메소드는 public abstract가 기본!
		System.out.println("override!! num : " + num);
	}
}
public class Ex1603 {
	public static void main(String[] args) {
		//InterA.num=8; //num은 final이기 떄문에 즉 상수이기 때문에 고칠 수 없다.
		//System.out.println(InterA.num);//static이기 때문에 인터페이스이름.으로 접근할 수 있다.
		//public이기 때문에 다른 패키지에서 또한 접근할 수 있다.
		InterAImpl obj = new InterAImpl();
		obj.showNum();
		
		//고급 : 인터페이스는 '부-자'의 상황에서 '부'의 역할을 할 수 있다.
		InterA obj2 = new InterAImpl();
		obj2.showNum(); //InterA에도 showNum()이 존재
	}
}
