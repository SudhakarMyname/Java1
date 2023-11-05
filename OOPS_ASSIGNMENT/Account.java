package OOPS_ASSIGNMENT;

public class Account {

	private String name;
	private int amount;
	
	public Account(String arg1 , int arg2)
	{
		name=arg1;
		amount=arg2;
	}

	public String getName() {
		return name;
	}

	public void setName(String arg1) {
		this.name = arg1;
		}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int arg2) {
		this.amount = arg2;
	}
	
	
	
}
