package practice3;

class Input extends Thread{
	
	String arr[] = new String[100];
	Input(String[] arr){
		this.arr = arr;
	}
	
	@Override
	public void run(){
		for( int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			try {
				sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
//여기서 run의 매개변수로 무언가를 주려고 하면 @Override 때문에 오류가 발생하게 되는것. 맞나.

public class Tpractice{
	public static void main(String[] args) {
		String[] arr = {"H","e","l","l","o"," ","I","'","m"," ","J","a","v","a"," ","T","h","r","e","a","d","!"};		
		Input a = new Input(arr); //매개변수로 배열을 넘겨줄 경우 이름으로 넘겨주어야.
								  //이름은 arr니까.
		a.run();
	}
}
