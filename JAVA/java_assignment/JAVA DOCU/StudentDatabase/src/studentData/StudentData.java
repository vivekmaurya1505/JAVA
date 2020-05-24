package studentData;

public class StudentData {
	private int id;
	private String name = new String();
	private float percentage;
	private static int count=0;
	StudentData(){
		count++;
	}
	
	public StudentData(int id, String name, float percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		count++;
	}
   public void printCnt() {
	   System.out.println("no of objects"+count);
	   
   }
   public static void printCnt1() {
	   System.out.println("no of objects"+count);
	   
   }
   
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public float getPercentage() {
//		return percentage;
//	}
//
//	public void setPercentage(float percentage) {
//		this.percentage = percentage;
	//}

	

//	void gradeCalculator()
//	{
//		if(percentage < 40)
//		{
//			grade="FAIL";
//		}
//		else if(percentage > 40 && percentage<60) 
//		{
//			grade="2nd Class";
//		}
//		else if(percentage > 60 && percentage<75) 
//		{
//			grade="1st Class";
//		}
//		else
//		{
//			grade="Distinction";
//		}	
//	}

	void print()
	{
		System.out.println("ID="+id);
		System.out.println("Name="+name);
		System.out.println("Percentage="+percentage);
	
	}

	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

	
}
