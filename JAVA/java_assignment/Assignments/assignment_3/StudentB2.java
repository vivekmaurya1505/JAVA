package assignment3;

public class StudentB2 {

	private int rollNo;
	private String name;
	private float percentage;
	 static int count=0;
	
	StudentB2(){
		count++;
	}
	
	
	public StudentB2(int rollNo, String name, float percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
		count++;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	void print() {
		System.out.println(count);
	}
	
	
	public String toString() {
		return rollNo+", "+name+", "+percentage;
		
	}
	}

