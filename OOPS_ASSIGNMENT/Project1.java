package OOPS_ASSIGNMENT;

import java.util.*;
public class Project1 {

	
	
	public static void main(String[] args) {
		int ch;
		Scanner sc  = new Scanner (System.in);
		//out and in are the refence varibale
		//out is an object of printstream class
		// in is an object of Inputstream class
		//both classes lies inside Systemclass
		// both variables are static
		
		//print() and println() are non-static method of printstream class
		
		// remember constructor or methods accepts only values even if it is reference or anything
		
		bankservice bb = new bankservice();
		
		while(true)
		{
			
			System.out.println("============================");
			System.out.println("1.Enter 1 to view balance");		

			System.out.println("2.Enter 2 to deposit money");		

			System.out.println("3. Enter 3 to withdraw balance");
			System.out.println("4. Enter 4 to terminate programme");
			System.out.println("============================");
			System.out.println("Enter your choice");
			
			ch=sc.nextInt();
			if(ch==4)
			{
				System.out.println("-----------------------");
				System.out.println("programme is terminated");
				System.out.println("Thanky you user");
				System.out.println("==========================");
				break;
			}
			else if( ch==1)	
			{
				bb.showbalanace();
				//System.out.println("code is under construction");
			}
			else if(ch==2 )
			{
				bb.depositmoney();
			}
			else if(ch==3)
			{
				bb.withdrawmoney();
			}
			
			
			
		}
		
		
	}

}
