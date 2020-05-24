package assignment3;

public class Exam {

	private String subName;
	private float maxMarks;
	private float obtMarks;
	
	
	Exam(){
		
	}
	
	public Exam(String subName, float maxMarks, float obtMarks) {
		super();
		this.subName = subName;
		this.maxMarks = maxMarks;
		this.obtMarks = obtMarks;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public float getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(float maxMarks) {
		this.maxMarks = maxMarks;
	}

	public float getObtMarks() {
		return obtMarks;
	}

	public void setObtMarks(float obtMarks) {
		this.obtMarks = obtMarks;
	}
	
	
	
	public void printExam() {
		System.out.println(subName+", "+obtMarks+"/"+maxMarks);
	}
	
}
