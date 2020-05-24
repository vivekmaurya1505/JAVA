package PerimeterFinder;

public class PerimeterFinder {

	private int side;
	private float radius;
	private int length,breadth;
	
	
	public void findPerimeter(int side) {
		this.side=side;
		int per=4*side;
		System.out.println("Perimeter of square is "+per);
	}
	public void findPerimeter(float radius) {
		this.radius=radius;
		float per=2*3.14f*radius;
		System.out.println("Perimeter of circle is "+per);
		
		
	}
	public void findPerimeter(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
		int per=2*(length+breadth);
		System.out.println("Perimeter of rectangle is "+per);
	}
}
