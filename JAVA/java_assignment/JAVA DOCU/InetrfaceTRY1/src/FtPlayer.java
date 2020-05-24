
public class FtPlayer implements Printable {
	
	String name;
	int goal;

	public FtPlayer(String name, int goal) {
		super();
		this.name = name;
		this.goal = goal;
	}



	public void printDetails() {
		System.out.println("name="+name);
		System.out.println("goals="+goal);
	}
		
	
}
