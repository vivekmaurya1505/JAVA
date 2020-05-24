package emp;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println("enter basic salary::");
		Scanner scan = new Scanner(System.in);
		e.id=999;
		e.name="xyz";
		e.basicsal= scan.nextFloat();
		e.print();
		e.totalsal();
		e.print();
		scan.close();
	}

}
