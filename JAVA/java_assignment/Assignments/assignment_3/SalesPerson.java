package assignment3;

public class SalesPerson extends WageEmployee{

	private int itemSold;
	
	private float com;
	
	private float salary;
	
	
	public SalesPerson(int emp_id, String name, Address address,int hours, float rate, int itemSold, float com) {
		super(emp_id,name,address,hours,rate);
		this.itemSold = itemSold;
		this.com = com;
	}
public void display(){
		super.display();
		this.salary=super.salary+ itemSold*com;
		System.out.print(itemSold+", "+com+", "+salary);
		
	}
}
