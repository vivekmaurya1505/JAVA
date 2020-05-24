package Employee;

public class Employee {

	int id;
	String name;
	float totalSal,basicSal,hra,da;
	
	Employee(){
		
	}
	
	Employee(int id,String name,float basicSal){
		this.id=id;
		this.name=name;
		this.basicSal=basicSal;
	}
	
	void calculateSalary() {
	hra= 0.18f*basicSal;
	da=0.2f*basicSal;
	totalSal=basicSal+hra+da;
		
	}
	
	void print() {
		
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Total Salary="+totalSal);
	
		
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

	public float getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(float basicSal) {
		this.basicSal = basicSal;
	}
	
	
}
