package student;

public class Student {

	private int roll_no;
	private String name;
	private float percent;
	private static int count;

Student(){
		count++;
	}

Student(int roll_no, String name, float percent){
		
		this.roll_no = roll_no;
		this.name = name;
		this.percent = percent;
		count++;
	}
public String toString() {
	
	
	return roll_no + " "+ name + " "+ percent;
	
}
public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}


   public void displayObjects() {
	   
	   System.out.println("No of Objects are:"+ count);
   }





}
