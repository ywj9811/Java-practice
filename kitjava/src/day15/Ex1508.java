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
		//Ŭ���� ����ȯ�� ����! �׷��� ������ �ڵ尡 �Ƿ���, instanceof ������!!
		//[������] "�������� instanceof Ŭ�����̸�"
		AA obj = new BB();
		obj.showA();
		//if(obj�� ���� BBŬ������ ������ ��ü���)
		if(obj instanceof BB) {//BBŸ���� ���������� �� �ش��ϴ� ��ü�� ����ų �� �������. �� �ǹ��ϴ� ���̴�.
			((BB)obj).showB(); //�̷��� ����ؾ� ������ �ڵ�!! �� ����ȯ�� �Ǵ°��� ���°�.
		}
		
//1.
//		AA obj = new BB();
//		obj.showA();
//		((BB)obj).showB(); //Err ��? �ٺ� ���� : AAŸ���̴ϱ� AA���� �ٰ������� showB�� ����! �׷��� ������ ��.
		//-> obj�� Ÿ���� AA�̱� ������ BB�� ����ȯ�� �ؾ��Ѵ�.(Ÿ���� ���Ͻ����־��)
		//Ex1506�� ���� showWho�� �θ�� �ڽ� �Ѵ� ������ �ֱ� ������ ����!
		//���� ���⼭�� showB�� �ƴ϶� show�� showA�� show�� �����ϸ� ����ȯ ���� �����ϱ�� ��.
		
//		AA obj = new AA();
//		obj.showA();
//		((BB)obj).showB(); //����ȯ�� �Ѵٸ� ��� ����.

//2.		
//		AA obj1 = new AA();
//		BB obj2 = new BB(); 
//		AA obj3 = new BB(); //�θ�Ŭ������ ���������� �ڽ�Ŭ������ ��ü�� ����ų �� �ִ�.
		//BB obj4 = new AA(); //�ڽ�Ŭ������ ���������� �θ�Ŭ������ ��ü�� ����ų �� ����.
	}   //* ��-�� �� ������, ��-�� �� �ȵȴ�. * ����
}

//�׷��� Ŭ���� ����ȯ�� �����ϴ�.!!