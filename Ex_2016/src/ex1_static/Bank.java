package ex1_static;

public class Bank {
	private String point; //은행의 위치를 저장
	private String tel; //은행의 전화번호 저장
	static float interest = 10;
	
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	} //Bank b1 = new Bank(ㅁ, ㅁ) 이렇게 만들어야 한다. => 생성자에 넣어줄 매개변수가 필요하니까.
	
	public void myBank() {
		System.out.println("지점 : " + point);
		System.out.println("전화번호 : " + tel);
		System.out.println("이자율 : " + interest + "%");
		System.out.println("===============================");
	}
}
