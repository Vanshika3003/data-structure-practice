class Node
{
  int data;
  Node next;
  Node(int d)
  {
      data=d;
      next=null;
  }
    
}

class middle
{
    Node head;
    public int get()
    {
		int c=0;
		Node curr=head;
		while(curr!=null)
		{
			c++;
		}
		curr=curr.next;
		if(c%3==1)
		{
		     Object a = p.getFirst();
    Object b = p.getLast();
	(a+b)/2;
           
		}
		else
		{
			(a+b)/2+1;
		}
        
	 return curr.data;
	}

    public void push(int new_data)
   {
    Node new_node=new Node(new_data);
    new_node.next=head;
    head=new_node;
    }






	public static void main(String[] args) {
		LinkedList p=new LinkedList();
		p.push(12);
		p.push(23);
		p.push(34);
		p.push(45);
		//System.out.println(p.get(4));
		
		
	}
}

