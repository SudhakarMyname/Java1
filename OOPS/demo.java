package OOPS;

public class demo {

	private int cid;
	private String name;
	private String address;
	private String phone;
	
	
	public demo(int cid, String name, String address, String phone) {
	
		this.cid = cid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public void show()
	{
		System.out.println("Customer id:"+cid);
		System.out.println("Customer name:"+name);
		System.out.println("Customer adress:"+address);
		System.out.println("Customer phone:"+phone);
	}
	
	
}
