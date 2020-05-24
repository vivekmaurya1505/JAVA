package studentData;

public class Student {
	
	int id;
	String name;
	float percent;
	String grade;
	
	void calculateGrade() {
		if(percent < 40) {
			grade="FAIL";
			System.out.println("Student Id : "+id+" |"+" Name: "+name +" |  Grade :  "+grade);
			}
		else if(percent >= 40 && percent < 60)
			System.out.println("Student Id : "+id+" |"+" Name: "+name +" |  Grade : "+" 2nd CLASS");
		else if(percent >= 60 && percent < 75)
			System.out.println("Student Id : "+id+" |"+" Name: "+name +" |  Grade : "+" 1st CLASS");
		else if(percent >=75 && percent <= 100)
			System.out.println("Student Id : "+id+" |"+" Name: "+name +" |  Grade : "+" DISTINCTION CLASS");		
		
	}

}
