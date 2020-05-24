package emp;

public class Employee {
	int id;
	String name;
	float basicsal,hra,da,total;

	void totalsal() {
		hra=(18*basicsal)/100;
		da=(20*basicsal)/100;
		total=hra+da+basicsal;
	}
	void print() {
		System.out.println( "Id="+id);
		System.out.println( "Name="+name);
		System.out.println( "basic Salary="+basicsal);
		System.out.println( "total Salary="+total);
	
	}
}
