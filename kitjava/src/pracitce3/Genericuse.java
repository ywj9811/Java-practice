package pracitce3;

public class Genericuse {
	static <T> void printArray(T[] arr) { //T --> Integer, Double, Character...(클래스 모두 가능)
		//배열의 모든 요소를 출력.
		for(T value : arr) { //for-each문 : 공부하자
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1, 2, 3, 4};
		Double[] arr2 = {1.2, 3.4};
		Character[] arr3 = {'H', 'I', '!'};
		printArray(arr); //T가 Integer 를 의미 
		printArray(arr2);//T가 Double 를 의미
		printArray(arr3);//T가 Character 를 의미
		//즉 T가 각각의 데이터타입으로 변한다고 보면됨.
	}
}
