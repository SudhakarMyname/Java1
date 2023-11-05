package OOPS;

import java.util.Scanner;

public class Linearsearch2 {

	public static void main(String[] args) {
		
		String []str = {"Sanu","Amit","roshan","Sumit","Samesh"};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name you want to enter");
		String name =  sc.nextLine();
		int flag=0;
		for(int i=0; i<str.length;i++)
		{
			if(str[i].equalsIgnoreCase(name))
			{
				System.out.println("Name Exists");
				flag=1;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("name doesnt exists");
		}
	}

}
