package String;
import java.util.Scanner;
public class DAy1_1 {

	public static void main(String[] args) {
	
		Scanner x = new Scanner (System.in);
		System.out.println("Enter your name");
		
		String str = x.nextLine();
		
		int n  = str.length();
		for( int r=0 ; r<n ; r++)
		{
			for(int c=0; c<=r ; c++)
			{
				char ch = str.charAt(c);
				System.out.println(ch+" we");
			}
			System.out.println();
		}

	}

}
