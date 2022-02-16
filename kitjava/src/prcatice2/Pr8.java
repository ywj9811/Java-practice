package prcatice2;
class Car {
	int plate; //¹øÈ£ÆÇ
	String color;
	String model;
	
	void setPlate(int plate) {
		this.plate = plate;
	}
	void setColor(String color) {
		this.color = color;
	}
	void setModel(String model) {
		this.model = model;
	}
	
	void show() {
		System.out.println("car : " + plate + ", " + color + ", " + model );
	}
}
public class Pr8 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setColor("blue");
		car1.setModel("¸ðµ¨A");
		car1.setPlate(1234);
		car1.show();
		
		Car car2 = new Car();
		car2.setColor("red");
		car2.setModel("¸ðµ¨B");
		car2.setPlate(5434);
		car2.show();
		
		Car car3 = new Car();
		car3.setColor("green");
		car3.setModel("¸ðµ¨C");
		car3.setPlate(5162);
		car3.show();
	}
}
