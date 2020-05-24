
public class ChildTEST extends Employee{
	private int working_hrs;
	private float rate_per_hrs;
	protected float sal;
	
	public ChildTEST(int id, String name,int dd,int mm,int yy, int working_hrs, float rate_per_hrs) {
		super(id,name,dd,mm,yy);
		this.working_hrs = working_hrs;
		this.rate_per_hrs = rate_per_hrs;
		
	}

}
