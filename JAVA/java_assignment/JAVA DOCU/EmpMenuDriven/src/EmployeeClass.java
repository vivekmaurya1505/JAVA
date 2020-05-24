
public class EmployeeClass {
	private int id;
	private String name;
	private float salary;
	
	public EmployeeClass() {
		
	}
	public EmployeeClass(int id, String name, float salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	void addemp(int id,String name,float salary)
	{
		setId(id);
		setName(name);
		setSalary(salary);
	}
	void print() {
		System.out.println("ID="+id);
		System.out.println("Name="+name);
		System.out.println("Salary="+salary);
	}
	
	

}
