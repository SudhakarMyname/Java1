package OOPS_ASSIGNMENT;
import java.util.*;

public class bankservice {
	
	Account ac = new Account("Amit",5000);
	Scanner sc = new Scanner(System.in);
	public void showbalanace()
	{
		System.out.println("-----------------------------");
		String name = ac.getName();
		System.out.println("Employee Name :"+name);
		int amt = ac.getAmount();
		System.out.println("Your current balance is "+amt);
		System.out.println("-----------------------------");
	}
	public void depositmoney()
	{
		String name = ac.getName();
		System.out.println("========================");
		System.out.println("Enter amount tobe deposited");
		int amount = sc.nextInt();
		int bal = ac.getAmount();
		int total = bal+amount;
		ac.setAmount(total);
		System.out.println("Dear :"+name+" your Account has been updated :"+total);
		System.out.println("=========================");
	}
	public void withdrawmoney()
	{
		String name = ac.getName();
		System.out.println("========================");
		System.out.println("Enter amount to be withdraw");
		int amount = sc.nextInt();
		int bal = ac.getAmount();
		if(amount > bal)
		{
			System.out.println("Sorry "+name+" Doesnt have sufficent amount");
			
		}
		else
		{
			int total = bal-amount;
			ac.setAmount(total);
			System.out.println("Dear :"+name+" Transaction successful"+"your rest amount is:"+total);
			System.out.println("=========================");
			
		}
		
		
		
	}
	

}
