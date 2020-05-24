package Exam;

public class Exam {

	private String examName;
	private float totalMarks;
	private float duration;
	
	Exam(){
		
	}
	
	Exam(String examName,float totalMarks,float duration){
		this.examName=examName;
		this.totalMarks=totalMarks;
		this.duration=duration;
		System.out.println("Exam Name : "+examName+" Total Marks : "+totalMarks+" Duration : "+duration);
	}
	
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public float getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	public void displayExam() {
		System.out.println("Exam Name : "+examName+" Total Marks : "+totalMarks+" Duration : "+duration);
	}
}
