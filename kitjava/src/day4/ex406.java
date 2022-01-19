package day4;
//C = 5/9 * (F - 32)
public class ex406 {
	public static void main(String[] args) {
		int f = 100;
		float c = 5/9.0f * (f - 32); /* 5/9는 실수가 아닌 정수이기 때문에 0으로 나오게 된다. 따라서 둘중 하나는 실수형으로 변경시켜주어야 한다.
		즉 5.0f 혹은 9.0f 이렇게 바꿔주어야 실수로 인식하여 실수로 계산을 하게 된다. */
		System.out.println(c);
		//37.7이 되려면 어떻게 해야할까. 단, 그냥 뒤의 소숫점 몇번째 이렇게 날리는게 아님, 연산자를 사용하면 할 수 있다.
		//377로 만들고 나누도록?
		c = (int)(c*10);
		float h = (float)c/10;
		System.out.println(h);
	}
}
