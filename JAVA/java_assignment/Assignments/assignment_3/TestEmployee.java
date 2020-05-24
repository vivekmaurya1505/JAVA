package assignment3;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
     
		Scanner in=new Scanner(System.in);
		
		Employee e1 = new Employee();
		
		Address ad=new Address();
		
		System.out.println("Enter id");
		e1.setId(in.nextInt());
		System.out.println("Enter name");
		e1.setName(in.nextLine()+in.nextLine());
		
		System.out.println("Enter flat");
		ad.setCity(in.next());
		System.out.println("Enter pincode");
		ad.setFlat(in.next());
		System.out.println("Enter city");
		ad.setPincode(in.next());
		System.out.println("Enter state");
		ad.setState(in.next());
		
		e1.setAddress(ad);
		
		e1.print();
	}

}
