
public class WageEmployee extends Employee{
	
	private int working_hrs;
	private float rate_per_hrs;
	protected float sal;
	
	public WageEmployee(int id, String name,int dd,int mm,int yy, int working_hrs, float rate_per_hrs) {
		super(id,name,dd,mm,yy);
		this.working_hrs = working_hrs;
		this.rate_per_hrs = rate_per_hrs;
		wagesalary();
	}
	protected void wagesalary() {
		sal=working_hrs*rate_per_hrs;
	}
	void print() {
		super.print();
		System.out.println("working hours="+working_hrs);
		System.out.println("rate per hour="+rate_per_hrs);
		System.out.println("WAGEEMP sal="+sal);
	}
}
