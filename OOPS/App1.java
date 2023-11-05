package OOPS;

public class App1 extends App12 {

	public int num;
	
	static 
	{
		int a=5;
	}
	public static void main(String[] args) {
	
		Person p1 = new Person(101,"sanu","noida","3478567");
		Person p2 = new Person(102,"sujit","delhi","34734537");
		Person p3 = new Person(103,"rahul","g.noida","347346566");
		p1=p2;
		p2=p3;
		p3=p1;
		p1.show();
		System.out.println("---------");
		p2.show();
		System.out.println("---------");
		p3.show();
		int z = sum(2,3);
		System.out.println(z);
	
	}
 public static	int sum(int a,int b)
	{
		return a+b;
	}
	
}
