package bankingApp;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int cnt=0;
		AccountHolder []a1 = new AccountHolder[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i < a1.length;i++)
		{
			a1[i]=new AccountHolder();
		}
		
		while(true)
		{
			System.out.println("1:ADD Record 2:Display 3:Deposit 4:Withdraw 5:exit");
			int choice=scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter ID->name->balance");
				a1[cnt++].addRecord(scan.nextInt(),scan.next(),scan.nextFloat());
				break;
			case 2:
				for(int i=0;i<cnt;i++)
				a1[i].show();
				break;
			case 3:
				System.out.println("Enter id and amount");
				int id=scan.nextInt();
				if(id<cnt && id>-1)
					a1[id].deposit(scan.nextFloat());
				else
					System.out.println("wrong id");
				break;
			case 4:
				
				System.out.println("Enter id and amount");
				id=scan.nextInt();
				if(id<cnt && id>-1)
					a1[id].withdraw(scan.nextFloat());
				else
					System.out.println("wrong id");
				break;
			case 5:
				System.exit(0);
				break;
			default:
				break;
			}
			
			
		}
		

	}
	
	
}
