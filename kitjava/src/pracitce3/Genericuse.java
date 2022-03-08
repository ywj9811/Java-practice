package pracitce3;

public class Genericuse {
	static <T> void printArray(T[] arr) { //T --> Integer, Double, Character...(Ŭ���� ��� ����)
		//�迭�� ��� ��Ҹ� ���.
		for(T value : arr) { //for-each�� : ��������
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1, 2, 3, 4};
		Double[] arr2 = {1.2, 3.4};
		Character[] arr3 = {'H', 'I', '!'};
		printArray(arr); //T�� Integer �� �ǹ� 
		printArray(arr2);//T�� Double �� �ǹ�
		printArray(arr3);//T�� Character �� �ǹ�
		//�� T�� ������ ������Ÿ������ ���Ѵٰ� �����.
	}
}
