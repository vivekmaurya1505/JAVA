
public class Salesemployee extends WageEmployee {
	
	private int item_sold;
	private float com_per_item;
	private float sal;
	
	public Salesemployee(int id, String name,int dd,int mm,int yy, int working_hrs, float rate_per_hrs, int item_sold, float com_per_item) {
		super(id, name,dd,mm,yy,working_hrs, rate_per_hrs);
		this.item_sold = item_sold;
		this.com_per_item = com_per_item;
		wagesalary();
	}
	public int getItem_sold() {
		return item_sold;
	}
	public void setItem_sold(int item_sold) {
		this.item_sold = item_sold;
	}
	public float getCom_per_item() {
		return com_per_item;
	}
	public void setCom_per_item(float com_per_item) {
		this.com_per_item = com_per_item;
	}
	
	protected void wagesalary() {
		super.wagesalary();
		sal= super.sal+(item_sold*com_per_item);
	}
	public void print() {
		super.print();
		System.out.println("number of item sold="+item_sold);
		System.out.println("Commission per item="+com_per_item);
		System.out.println("SALEemp SAL="+sal);
	}
	
}
