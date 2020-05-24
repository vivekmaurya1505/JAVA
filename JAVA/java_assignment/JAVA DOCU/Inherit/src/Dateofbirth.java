
public class Dateofbirth {

	private int dd;
	private int mm;
	private int yy;

	public void setdob(int dd,int mm,int yy) {
		this.dd =dd; 
		this.mm =mm; 
		this.yy =yy;
			
		System.out.println("DOB::"+dd+"/"+mm+"/"+yy);
		
	}
	
	public void printdob() {
		System.out.println("DOB::"+dd+"/"+mm+"/"+yy+"/");
	}
	
	

}
