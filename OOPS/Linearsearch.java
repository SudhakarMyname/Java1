package OOPS;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		
		int []num = {101,34,71,29,890,15,1880,78,23984,234,32,324,2};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number yu want to enter");
		int num1 =  sc.nextInt();
		int flag=0;
		for(int i=0; i<num.length;i++)
		{
			if(num[i]==num1)
			{
				System.out.println("Number Exists");
				flag=1;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("number doesnt exists");
		}
	}

}
