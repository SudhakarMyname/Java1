package Linkedlist;

public class SingleLL {
	
	private Node first;
	
	
	//,method to append at the end of list
	public void add( String data)
	{
		
	//code to create the node and link this node in the list	
	//code to create node	
	Node fresh =  new Node(data);
	//code to link the code
	//check whether list has any node or not
		
	if(first == null)
	{
		first = fresh;
		return;
	}
	//code to link or add this node at the end of list
	// find refernce of last node
	Node current = first;
	while(current.Next != null )
	{
		current = current.Next;
	}
	// Assign reference of new node to the next of last node
	current.Next = fresh;
	}
	//method to add element at first
	public void addFirst(String data)
	{
		Node fresh =  new Node(data);
		if(first == null)
		{
			first =  fresh;return;
		}
		//make this node firdst node
		//assign refence of fisrst  node to new node
		fresh.Next = first;
		//assign refernce of new NOde tto fisrt variable
		first = fresh;
	}
	// method to append element at last of list
	public void addLast(String data)
	{
		add(data);
	}
	//method to add node at specified index
	public void add(int index , String data)
	{
		if(index < 0)
		{
			throw new IndexOutOfBoundsException("index:"+index+"size"+size());
		}
		if(index == 0)
		{
			addFirst(data);
			return;
		}
		if(index == size())
		{
			addLast(data);
			return;
		}
		// find refernce of specified index node and previous node 
		
		Node prevcurr = first;
		for(int c=1; c<index; c++)
		{
			prevcurr = prevcurr.Next;
		}
		Node fresh = new Node(data);
		Node current = prevcurr.Next;
		prevcurr.Next = fresh;
		fresh.Next = current;
	}
	public int size()
	{
		Node current =  first ; 
		int count = 0;
		while(current != null)
		{
			count++;
			current=current.Next;
		}
		return count;
	}
	
	public void show()
	{
		if(first ==  null)
		{
			System.out.println("LIst is empty");
			return;
		}
		Node current =  first;
		while (current != null)
		{
			System.out.println(current.Element);
			current=current.Next;
		}
	}
	public String toString()
	{
		if(first== null)
			return "[]";
		Node cur =  first;
		StringBuffer res = new StringBuffer("["+cur.Element);
		while(cur.Next!=null)
		{
			cur=cur.Next;
			res.append(","+cur.Element);
			
		}
		res.append("]");
			return res.toString();
			
	}

}
