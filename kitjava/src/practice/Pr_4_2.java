package practice;

class Employee{
	String empName;
	int empAge;
	String empDesignation;
	String empSalary;
	
	void printemp(String name, int age, String designation, String salary) {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + designation);
		System.out.println("���� : " + salary);
		System.out.println();
	}
}

public class Pr_4_2 {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.empName = "����";
		emp1.empAge = 31;
		emp1.empDesignation = "�ôϾ� ������";
		emp1.empSalary = "1000����";
		emp1.printemp(emp1.empName, emp1.empAge, emp1.empDesignation, emp1.empSalary);
		
		emp2.empName = "����";
		emp2.empAge = 21;
		emp2.empDesignation = "������";
		emp2.empSalary = "300����";
		emp2.printemp(emp2.empName, emp2.empAge, emp2.empDesignation, emp2.empSalary);
	}
}
