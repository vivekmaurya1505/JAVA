package account;

public class TestAccount {

	public static void main(String[] args) {

		Account a1 =new Account();
		a1.deposit(50000);
		//a1.withdraw(16000);
		//a1.withdraw(1500);
		//a1.withdraw(8000);
		//a1.withdraw(11600);
		
		try{
			a1.withdraw(90000);
		}
		
		catch(Exception e) {
			
			System.out.println("Insufficient Balance");
			
		}
		
		try{
			a1.withdraw(10000);
		}
		
		catch(Exception e) {
			
			System.out.println("Withdraw limit Exceeded");
			
		}
		
	}

}
