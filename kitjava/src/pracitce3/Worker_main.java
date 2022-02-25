package pracitce3;

class Worker{
	String name;
	int age;
	String addr;
	String dept;
	int salary;
	
	void show(){
		System.out.println(name + ", " +  age + "세, " + addr );
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
	}//월급 입력받음.
	
	@Override
	void show(){
		super.show();
		System.out.println("정규직 : (월급 " + salary + ")"); 
	}
	
	RegularWorker(String name, int age, String addr, String dept){
		super(name, age, addr, dept);
	}//생성자.
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
		System.out.println("비정규직 : (이번달 급여 " + hours*wage + ")");
	}
	
	IrregularWorker(String name, int age, String addr, String dept){
		super(name, age, addr, dept);
		this.wage = 10000;//시급 10000원 초기화.
	}//생성자.
}

public class Worker_main {
	public static void main(String[] args) {
		RegularWorker rw = new RegularWorker("양원준", 25, "고양시" , "개발");
		rw.setSalary(500*10000);
		rw.show();
		System.out.println();
		
		IrregularWorker ir = new IrregularWorker("김철수", 24, "성남시", "주방");
		ir.setHours(160);
		ir.show();
	}
}
