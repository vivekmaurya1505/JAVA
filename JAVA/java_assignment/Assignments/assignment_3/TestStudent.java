package assignment3;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the no of students");
		
		Student[] s1=new Student[in.nextInt()];
		
		for(int j=0;j<s1.length;j++) {
		
			s1[j]=new Student();
		System.out.println("Enter the id of student");
		s1[j].setId(in.nextInt());
		System.out.println("Enter name");
		s1[j].setName(in.nextLine()+in.nextLine());
		
		System.out.println("Enter the no of exams");
		Exam[] exams=new Exam[in.nextInt()];
		
		for(int i=0;i<exams.length;i++) {
			exams[i]=new Exam();
			System.out.println("Enter subject name");
			exams[i].setSubName(in.nextLine()+in.nextLine());
			System.out.println("Enter max marks");
			exams[i].setMaxMarks(in.nextInt());
			System.out.println("Enter obtained marks");
			exams[i].setObtMarks(in.nextFloat());
			
		}
		
		s1[j].setExam(exams);
		s1[j].setReport(new ReportCard());
		s1[j].calculatePercentage();
		
	}
		for (Student student : s1) {
			student.printStudent();
		}
		
	}

}
