package pracitce3;

class Box<T> {
	private T data;
	
	void setData(T data) {
		this.data = data;
	}
	
	T getData() {
		return data;
	}
}

public class GenericClass {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>();
		Box<String> box2 = new Box<String>();
		
		box1.setData(5); //5(int) -> 5(Integer) : �ڵ��ڽ�.
		box2.setData("����");
		
		System.out.println(box1.getData());
		System.out.println(box2.getData());
	}
}
