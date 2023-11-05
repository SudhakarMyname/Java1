package OOPS;

public class App {

	public static void main(String[] args) {
		
		new demo(101, "Sanu prasad","Noida","9137283383").show();
		System.out.println("=============");
		demo d1 = new demo (102, "sumit singh" , "Delhi" , "874379343");
		demo d2 = new demo (103, "jainesh singh" , "mumbai" , "845664345");
		demo d3 = new demo (104, "sudhakar singh" , "haryana" , "345375683");
		
		d1.show();
		System.out.println("==============");
		d2.show();
		System.out.println("==============");
		d3.show();
	}

}
