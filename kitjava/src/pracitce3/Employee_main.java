package practice3;

class Employee extends Person{
	long salary;
	int years;
	String num;
	Employee(String p, long salary, int years, String num){
		super(p);
		this.salary = salary;
		this.years = years;
		this.num = num;
	}
}

public class Employee_main {
	public static void main(String[] args) {
		Employee e;
		e = new Employee("양원준", 40000000, 2, "010-8033-2443");
		System.out.println(e.p + " " + e.salary + "원 " + e.years + "년 "+ e.num);
	}
}
