package trycatch;

public class Account {
	
	float balance;
	
	 public Account() {
		
		balance=50000;
	}

	void deposit(int amt) {
		 
		balance=balance+amt;
	 }

	 void withdraw(float amt) throws Exception {
		 if(amt>15000)
		 {
			throw new Exception();	
		 }
		 else 
		 {
		 balance=balance-amt;
		 }
		 }
	 void show() {
		 System.out.println("balance="+balance);
		 
	 }
	 
}
