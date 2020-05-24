package trycatch;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Account ac =new Account();
		ac.show();
		String s1=null;
		 //s1="";
		System.out.println(s1);
		
		//ac.deposit(5000);
		//ac.show();
		try {
			
			ac.withdraw(15000);
			ac.show();
			System.out.println("jhfuyfjh");
		}
		catch (Exception e) {
			System.out.println("Withdraw limit exceeded");
		}
	}

}
