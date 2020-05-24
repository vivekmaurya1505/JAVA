
public class Employee {
	
	int id;
	String name;
	Dateofbirth dob = new Dateofbirth();
	
//	public Employee() 
//	{
//		
//	}
	public Employee(int id, String name,int dd,int mm,int yy) {
		
		this.id = id;
		this.name = name;
		dob.setdob(dd,mm,yy);
	}
	
	void print() {
		
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		dob.printdob();
		
	}
	

}
