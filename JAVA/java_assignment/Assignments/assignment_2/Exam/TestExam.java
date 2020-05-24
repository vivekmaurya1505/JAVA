package Exam;

import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		Exam e1=new Exam();
		Exam e2=new Exam();
		
		
		System.out.println("Enter exam name");
		e1.setExamName(scan.next());
		System.out.println("Enter total Marks");
		e1.setTotalMarks(scan.nextFloat());
		System.out.println("Enter duration of the exam");
		e1.setDuration(scan.nextFloat());
		
		e1.displayExam();
		
		System.out.println("Enter exam name");
		e2.setExamName(scan.next());
		System.out.println("Enter total Marks");
		e2.setTotalMarks(scan.nextFloat());
		System.out.println("Enter duration of the exam");
		e2.setDuration(scan.nextFloat());
		
		e2.displayExam();
	}

}
