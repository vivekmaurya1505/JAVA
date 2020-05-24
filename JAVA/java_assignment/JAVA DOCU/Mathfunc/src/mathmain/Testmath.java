package mathmain;

public class Testmath {
		int fact=1;
	
	public void power(int base,int index) {
		
		int pow=1;
		for(int i=0;i<index;i++)
			pow=pow*base;
		System.out.println("power="+pow);
	}
	public int factorial(int num) {
		
		if(num==0) {
			return 1;
		}
		else
			return fact=num*factorial(num-1);
	}
	public void table(int num) {
		
		int j=1;
		for(int i=1;i<=10;i++) {
			j=num*i;
			System.out.println(j);
		}
	}
	public void primeno(int num) 
	{
		int flag=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
				
		}
		if(flag==0)
			System.out.println("prime no");
		else
			System.out.println("not prime");
		
		
	}
}
