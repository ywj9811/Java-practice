package day15;

class AA {
	int a=2;
	void showA() {
		System.out.println(a);
	}
}

class BB extends AA {
	int b=5;
	void showB() {
		System.out.println(b);
	}
}

public class Ex1508 {
	public static void main(String[] args) {
//3. 
		//클래스 형변환은 위험! 그래서 안전한 코드가 되려면, instanceof 연산자!!
		//[간단히] "참조변수 instanceof 클래스이름"
		AA obj = new BB();
		obj.showA();
		//if(obj가 만약 BB클래스로 생성된 객체라면)
		if(obj instanceof BB) {//BB타입의 참조변수가 그 해당하는 객체를 가르킬 수 있을경우. 를 의미하는 것이다.
			((BB)obj).showB(); //이렇게 사용해야 안전한 코드!! 막 형변환이 되는것을 막는것.
		}
		
//1.
//		AA obj = new BB();
//		obj.showA();
//		((BB)obj).showB(); //Err 왜? 근본 이유 : AA타입이니까 AA에게 다가갔더니 showB가 없음! 그래서 오류가 남.
		//-> obj의 타입이 AA이기 때문에 BB로 형변환을 해야한다.(타입을 통일시켜주어야)
		//Ex1506의 경우는 showWho를 부모와 자식 둘다 가지고 있기 때문에 가능!
		//만약 여기서도 showB가 아니라 show로 showA도 show로 통일하면 형변환 없이 가능하기는 함.
		
//		AA obj = new AA();
//		obj.showA();
//		((BB)obj).showB(); //형변환을 한다면 사용 가능.

//2.		
//		AA obj1 = new AA();
//		BB obj2 = new BB(); 
//		AA obj3 = new BB(); //부모클래스의 참조변수가 자식클래스의 객체를 가르킬 수 있다.
		//BB obj4 = new AA(); //자식클래스의 참조변수는 부모클래스의 객체를 가르킬 수 없다.
	}   //* 부-자 는 되지만, 자-부 는 안된다. * ㅎㅎ
}

//그래서 클래스 형변환은 위험하다.!!