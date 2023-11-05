package OOPS;

public class ReverseRec {

	public static void main(String[] args) {
		
			int[] x = {10,10,213,133,44,67};
			int len = x.length;
			//x[0]=100;
			//int y[] = new int[len];
//			int y[] = x;
//			for ( int i = 0; i<len ; i++) {
//				
//				 y[i] = x[i];
//				
//				// System.out.print(y[i]+",");
//			}
//			x[0]=100;
//			System.out.println(y[0]);
			
			int c[] = array(x);
			System.out.println(c[0]);
			
		}

		public static int[] array(int x[])
		
		{		
			int y[] = new int[x.length];
			int a = 0;
			for(int i=x.length-1; i > -1 ; i--)
		{
			
			y[a]=x[i];
			a++;
	
		}
			return y ;
		}
		
	}


