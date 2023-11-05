package OOPS;

public class ReversebyRecursion {

	
	public static void reverse(int x[] , int [] y, int index, int len)
	{
		if(index == x.length)
			return;
		
		y[index] = x[len];
		
	reverse(x,y,index+1,len-1);
		
	}

	public static void main(String[] args) {
		
		int x [] = {1,2,3,4};
		int y[] = new int[x.length];
		int len = x.length-1;
		reverse(x,y,0,len);
		
		for(int e : y)
		System.out.println(e);
	}

}
