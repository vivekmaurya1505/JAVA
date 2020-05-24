package studentData;

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.id=111;
		s1.name="vivek";
		s1.percent=95.5f;
		
		s2.id=112;
		s2.name="kajal";
		s2.percent=30.00f;
		
	
		s1.calculateGrade();
		s2.calculateGrade();
	
		
		
	}
}
