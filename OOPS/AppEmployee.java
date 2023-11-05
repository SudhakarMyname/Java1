package OOPS;

public class AppEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employey [] e = new Employey[7];
	e[0]=	new Employey(101,10000,"RAhul","sales");
	e[1]=	new Employey(102,20000,"sumit","marketing");
	e[2]=	new Employey(103,30000,"dopin","IT");
	e[3]=	new Employey(104,40000,"jakarta","manager");
	e[4]=	new Employey(105,50000,"saomesh","bussinessman");
	e[5]=	new Employey(106,60000,"Rajat","Shop worker");
	e[6]=	new Employey(107,70000,"dhruv","Teacher");
	
	e[0].showDetails();
	for(int i=0;i<7;i++)
	{
		e[i].showDetails();
	}
	}

}
