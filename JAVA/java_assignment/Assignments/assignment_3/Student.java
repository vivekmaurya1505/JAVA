package assignment3;

public class Student {
	
private int id;
private String name;
private Exam[] exams;
private ReportCard report;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Exam[] getExam() {
	return exams;
}
public void setExam(Exam[] exam) {
	this.exams = exam;
}
public ReportCard getReport() {
	return report;
}
public void setReport(ReportCard report) {
	this.report = report;
}

public Student() {
	
}

public Student(int id, String name, Exam[] exam, ReportCard report) {
	super();
	this.id = id;
	this.name = name;
	this.exams = exam;
	this.report = report;
}

public void calculatePercentage() {
	float total=0.0f;
	float grandTotal=0.0f;
	
   for(Exam exam: exams) {
	   total += exam.getMaxMarks();
	   grandTotal += exam.getObtMarks();
   }
   report.setPer(grandTotal/total*100.0f);
   report.generateGrade();
	
}

public void printStudent() {
	System.out.println(id+", "+name);
	for(Exam exam: exams) {
		exam.printExam();
	}
	report.printReport();
	
	
}

}
