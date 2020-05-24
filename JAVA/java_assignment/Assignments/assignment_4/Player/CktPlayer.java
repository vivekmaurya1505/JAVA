package Player;

public class CktPlayer implements Printable{

	private int runs;
	private String Name;
	
	CktPlayer(){
		runs= 200;
		Name ="kajal";
	}
	
	public CktPlayer(int runs, String name) {
		this.runs = runs;
		Name = name;
	}

	public void printDetails() {
		System.out.println(runs+" "+Name);
	}
}
