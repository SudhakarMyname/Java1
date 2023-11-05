package OOPS;

public class CopyRecur {

	public static void main(String[] args) {
	
		int[] x = {10,10,213,123,44,67};
		int len = x.length;
		//x[0]=100;
		//int y[] = new int[len];
//		int y[] = x;
//		for ( int i = 0; i<len ; i++) {
//			
//			 y[i] = x[i];
//			
//			// System.out.print(y[i]+",");
//		}
//		x[0]=100;
//		System.out.println(y[0]);
		
		int c[] = array(x);
		System.out.println(c[2]);
		
	}

	public static int[] array(int x[])
	
	{		
		int y[] = x;
		for(int i=0; i < x.length ; i++)
	{
		y[i]=x[i];
	}
		
		return y ;
	}
	

}
