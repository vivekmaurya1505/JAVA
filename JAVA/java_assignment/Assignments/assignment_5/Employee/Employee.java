package employee;

import java.util.Scanner;

public class Employee {

	private int empid;
	private String name;
	
	Scanner in = new Scanner(System.in);
	
    Employee(){
	
    }

public Employee(int empid, String name, float sal) {
	super();
	this.empid = empid;
	this.name = name;
	this.sal = sal;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getSal() {
	return sal;
}

public void setSal(float sal) {
	this.sal = sal;
}


private float sal;

public void accept() {
	empid= in.nextInt();
	name = in.next();
	sal = in.nextFloat();
	
}

public String toString() {
	
	return "[employee id:" + empid+ " Name :"+ name + " Salary: "+sal+ "]";
	
}
}
