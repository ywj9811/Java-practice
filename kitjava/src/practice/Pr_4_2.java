package practice;

class Employee{
	String empName;
	int empAge;
	String empDesignation;
	String empSalary;
	
	void printemp(String name, int age, String designation, String salary) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("직급 : " + designation);
		System.out.println("월급 : " + salary);
		System.out.println();
	}
}

public class Pr_4_2 {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.empName = "가나";
		emp1.empAge = 31;
		emp1.empDesignation = "시니어 개발자";
		emp1.empSalary = "1000만원";
		emp1.printemp(emp1.empName, emp1.empAge, emp1.empDesignation, emp1.empSalary);
		
		emp2.empName = "초코";
		emp2.empAge = 21;
		emp2.empDesignation = "개발자";
		emp2.empSalary = "300만원";
		emp2.printemp(emp2.empName, emp2.empAge, emp2.empDesignation, emp2.empSalary);
	}
}
