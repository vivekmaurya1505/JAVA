package Employee;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class TestEmployee {

	public static void main(String[] args) {
        
		int id;
		String nam;
		float sal;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the id of Employee");
        id=in.nextInt();
        System.out.println("Enter the name of employee");
        nam=in.next();
        System.out.println("Enter the salary of employee");
        sal=in.nextFloat();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee(id,nam,sal);
		 e2.calculateSalary();
	     e2.print();
		
		//Scanner in=new Scanner(System.in);
		System.out.println("Enter the id of Employee");
        e1.setId(in.nextInt());
        System.out.println("Enter the name of employee");
        e1.setName(in.next());
        System.out.println("Enter the salary of employee");
        e1.setBasicSal(in.nextFloat());
        
        e1.calculateSalary();
        e1.print();
        
        
        
	}

}
