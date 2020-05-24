package assignment2;

public class ConstrutorTest {
	
	int id;
	String name;
	float salary;
	
	public ConstrutorTest(int id, String name, float salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	

	
	{
		System.out.println("i am in init block");
		
	}

	public ConstrutorTest(){
		
		 System.out.println("no arguments");
		}
	
	static{
		System.out.println("i am in staticinit block");
		
	}
	
}
