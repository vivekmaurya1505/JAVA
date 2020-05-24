package assignment3;

public class WageEmployee extends Employee {

	private int hours;
	private float rate;
	float salary;
	
	public WageEmployee() {
		
	}
	
	public WageEmployee(int emp_id, String name, Address address, int hours, float rate) {
		super(emp_id,name,address);
		this.hours = hours;
		this.rate = rate;
	}

	public void display( ){
		super.display();
		salary = hours * rate;
		System.out.println(hours+", "+rate+", "+salary);
		
	}
	
}
