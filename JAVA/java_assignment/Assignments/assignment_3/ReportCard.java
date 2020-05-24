package assignment3;

public class ReportCard {

	private String grade;
	private float per;
	
	public ReportCard() {
		
	}
	
	public ReportCard(String grade, float per) {
		super();
		this.grade = grade;
		this.per = per;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}
	
	public void generateGrade() {
		
		if (per < 40)
			grade = "Fails";
		else if (per >= 40 && per < 60)
			grade = "2nd Class";
		else if (per >= 60 && per < 75)
			grade = "1st Class";
		else if (per >= 75 && per < 100)
			grade = "Distinction Class";
		else
			grade = "Invalid Grade";
			
	}
	
	public void printReport() {
		System.out.println(per+", "+grade);
	}
	
	
	
}
