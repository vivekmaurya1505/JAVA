package bankingApp;

public class AccountHolder {
	
	private int accountNo;
	private String name;
	private float balance;
	
	public AccountHolder()
	{
		
	}
	
	/*public AccountHolder(int accountNo, String name, float balance) {
		this.setAccountNo(accountNo);
		this.setName(name);
		this.setBalance(balance);
	}*/
	
	public void addRecord(int no,String name,float bal)
	{
		setAccountNo(no);
		this.setName(name);
		setBalance(bal);
	}
	
	public void deposit(float amount)
	{
		setBalance(getBalance()+amount);
		//balance=balance+amount;
	}

	public void withdraw(float amount)
	{
		setBalance(getBalance()-amount);
		//balance=balance-amount;
	}
	
	public void show()
	{
		System.out.println("account No="+getAccountNo());
		System.out.println("account Name="+getName());
		System.out.println("account Balance="+getBalance());
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	
	
}
