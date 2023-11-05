package String;
import java.util.Scanner;
public class DAy1_2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner ( System.in );
		System.out.println("Enter your name");
		
		String str = sc.nextLine();
		char [] arr = str.toCharArray();
		int n = str.length();
		
		for(int r=0; r<n ; r++) {
			for(int c=0; c<=r ; c++) {
				System.out.println(arr[c]);
			}
			System.out.println();
		}

	}

}
