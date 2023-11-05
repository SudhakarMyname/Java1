package String;

public class Day_1substring {

	public static void main(String[] args) {
		
	String name = "Amit kumar(102365467)"	;
	
	int i1 = name.indexOf('(');
	int i2 = name.indexOf(')');
	
	String eid = name.substring(i1+1 , i2);
	System.out.println(eid);
	
	name = name.substring(0,i1);
	
	System.out.println(name);
		

	}

}
