package Linkedlist;

public class App {

	public static void main(String[] args) {
		
		SingleLL list = new SingleLL();
//		list.add("Rahul");
//		list.add("Sumit");
//		list.add("Sonu");
//		list.add("Karan");
//		list.add("Suresh");
//		list.add("Amit");
//		list.add("Ankit");
//	
//		list.show();
		System.out.println("===========================");
		list.addFirst("Rahul");
		list.addFirst("Sumit");
		list.addFirst("Sonu");
		list.addFirst("Karan");
		list.addFirst("Suresh");
		list.addFirst("Amit");
		list.addFirst("Ankit");
	
		list.show();
		
		
		
	}

}
