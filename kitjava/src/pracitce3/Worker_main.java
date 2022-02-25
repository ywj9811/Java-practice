package pracitce3;

class Worker{
	String name;
	int age;
	String addr;
	String dept;
	int salary;
	
	void show(){
		System.out.println(name + ", " +  age + "��, " + addr );
	}
	
	Worker(String name, int age, String addr, String dept){
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.dept = dept;
	}
}

class RegularWorker extends Worker{
	void setSalary(int salary){
		this.salary = salary;
	}//���� �Է¹���.
	
	@Override
	void show(){
		super.show();
		System.out.println("������ : (���� " + salary + ")"); 
	}
	
	RegularWorker(String name, int age, String addr, String dept){
		super(name, age, addr, dept);
	}//������.
}

class IrregularWorker extends Worker{
	int wage;
	int hours;
	
	void setHours(int hours) {
		this.hours = hours;
	}
	
	@Override
	void show() {
		super.show();
		System.out.println("�������� : (�̹��� �޿� " + hours*wage + ")");
	}
	
	IrregularWorker(String name, int age, String addr, String dept){
		super(name, age, addr, dept);
		this.wage = 10000;//�ñ� 10000�� �ʱ�ȭ.
	}//������.
}

public class Worker_main {
	public static void main(String[] args) {
		RegularWorker rw = new RegularWorker("�����", 25, "����" , "����");
		rw.setSalary(500*10000);
		rw.show();
		System.out.println();
		
		IrregularWorker ir = new IrregularWorker("��ö��", 24, "������", "�ֹ�");
		ir.setHours(160);
		ir.show();
	}
}
