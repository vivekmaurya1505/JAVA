package account;

public class Account {

	private float balance=0;
	private int flag=0;
	
	Account(){
		
	}
	
	public Account(float balance) {
		super();
		this.balance = balance;
	}
	public void deposit(float add) {
		
		balance = balance +add;
		System.out.println("New Balance is:"+balance);
	}
	public void withdraw(float sub) throws Exception{
		
		if(sub>balance) {
			
			throw new Exception("Insufficient Balance");
			
		}
		if (sub >= 15000)
		{
		
			throw new Exception("Withdraw limit Exceeded");
		
		}
		
		
		else {
		balance = balance-sub;
		System.out.println("New Balance is:"+balance);
	}
}
}
