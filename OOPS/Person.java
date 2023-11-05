package OOPS;

public class Person {

	private int pid;
	private String name;
	private String address;
	private String phone;
	
	
	public Person(int pid, String name, String address, String phone) {
	
		this.pid = pid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public void show()
	{
		System.out.println("Customer id:"+pid);
		System.out.println("Customer name:"+name);
		System.out.println("Customer adress:"+address);
		System.out.println("Customer phone:"+phone);
	}
	
	
}

