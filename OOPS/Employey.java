package OOPS;

public class Employey {

	private int eid;
	private int salary;
	private String name;
	private String adress;
	
	public Employey(int eid, int salary, String name, String adress) {
	
		this.eid = eid;
		this.salary = salary;
		this.name = name;
		this.adress = adress;
	}
	
	public void showDetails()
	{
		System.out.println("Employee id:"+eid);

		System.out.println("Employee name:"+name);

		System.out.println("Employee salary:"+salary);

		System.out.println("Employee adress:"+adress);
	}
	
	
	
}
