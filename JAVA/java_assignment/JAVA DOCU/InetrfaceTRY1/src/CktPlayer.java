
public class CktPlayer implements Printable {
	String name;
	int runs;
	
	public CktPlayer(String name, int runs) {
		super();
		this.name = name;
		this.runs = runs;
	}

	@Override
	public void printDetails() {
		System.out.println("name="+name);
		System.out.println("runs="+runs);
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "NAme="+name+"\n"+"runs="+runs;
	}
	
	
}
