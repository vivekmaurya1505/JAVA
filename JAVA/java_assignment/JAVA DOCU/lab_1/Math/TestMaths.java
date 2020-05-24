package Math;

public class TestMaths {

	public void power(int base, int index) {
		
		int i,var=1;
		for(i=1; i<= index; i++) {
		var =var*base;
		}
		System.out.println("power is : "+var);
	}
	
	public void findFactorial(int number) {
		int fact=1;
		for(int i=number;i>0;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial is : "+fact);
	}
	
	public void findTable(int number) {
		
		int i,temp;		
		for (i=1; i<=10; i++) {
			
		temp = number*i;
		System.out.println(number +" x "+ i +" = "+ temp );
		}
			
	}
	
	public void findPrime(int number) {
		if(number%2 != 0 || number==2) {
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is NOT a prime number");
		}
	}
	
	
}
