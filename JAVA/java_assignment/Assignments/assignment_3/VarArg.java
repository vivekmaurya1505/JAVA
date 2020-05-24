package assignment3;
public class VarArg {

	public void findSum(float b,int ...nums) {
		
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
		}
	    System.out.println("sum : "+sum);
	    System.out.println(b);
	}
	
public void findSum(float b,float ...nums) {
		
		float sum=0.0f;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
		}
	    System.out.println("sum : "+sum);
	    System.out.println(b);
	}
}
