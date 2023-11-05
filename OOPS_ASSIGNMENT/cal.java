package OOPS_ASSIGNMENT;

public class cal {

	private int num1;
	private int num2;
	
	public cal(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add()
	{
		int sum = num1+num2;
		System.out.println(sum);
		//return sum;
	}
	public int multiply()
	{
		int mul = num1*num2;
	//	System.out.println(mul);
		
		return mul;
	}
	
	
}
