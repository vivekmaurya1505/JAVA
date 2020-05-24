package PerimeterFinder;

import java.util.Scanner;

public class TestPerimeterFinder {

	public static void main(String[] args) {
        
		PerimeterFinder p=new PerimeterFinder();
		Scanner in=new Scanner(System.in);
		
		while(true) {
			
		System.out.println("Enter 1 to find perimeter of square");
		System.out.println("Enter 2 to find perimeter of circle");
		System.out.println("Enter 3 to find perimeter of rectangle");
		System.out.println("Enter 4 to exit");
		
		int i=in.nextInt();
		
		switch(i) {
		case 1: System.out.println("Enter the length of the side of square");
		        p.findPerimeter(in.nextInt());
		        break;
		case 2: System.out.println("Enter the radius of the circle");
        		p.findPerimeter(in.nextFloat());
        		break;
		case 3: System.out.println("Enter the length and breadth of rectangle");
				p.findPerimeter(in.nextInt(),in.nextInt());
				break;
		case 4: System.exit(0);
		        break;
		default: System.out.println("Enter valid input"); 
		
		}
	}

}
}
