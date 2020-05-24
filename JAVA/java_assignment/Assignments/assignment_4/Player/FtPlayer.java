package Player;

public class FtPlayer implements Printable{

	private int goals;
	private String name;
	
	FtPlayer(){
		goals= 200;
		name ="vivek";
	}

	public FtPlayer(int goals, String name) {
		super();
		this.goals = goals;
		this.name = name;
	}

	public void printDetails() {
		System.out.println(goals+" " + name);
	}

}
