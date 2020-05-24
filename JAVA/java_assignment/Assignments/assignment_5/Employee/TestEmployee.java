package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int id=0;
		ArrayList<Employee> list = new ArrayList<>();
		Employee e;
	
		while(true) {
		System.out.println("Press 1 to Insert record into an array list.");
		System.out.println("Press 2 to Update information of employee");
		System.out.println("Press 3 Display all Records");
		System.out.println("Press 4 to exit");
		
		int choice = in.nextInt();
		int count=0;
		
		
		switch(choice) {
		
		case 1: 	System.out.println("Enter the employee id , Name and salary of the Employee");
					e= new Employee();
					e.accept();
					list.add(e);
					break;
					
		case 2:     System.out.println("Enter the Employee ID to update the information");	
					id = in.nextInt();
					System.out.println("Enter the employee id , Name and salary of the Employee");
					for(Employee emp: list) {
						if(id == emp.getEmpid()) {
							emp.accept();
							
						}
						}
					break;	
						
		case 3: 	for(Employee emp: list) {
						System.out.println(emp);
						}
						
					break;
			
		case 4:     System.exit(0);
					break;
		default:    System.out.println("Enter a valid input");
					break;
		}
		}
		
		
	}

}
