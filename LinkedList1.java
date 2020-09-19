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

class LinkedList1
{
    Node head;
    public int get(int index)
    {
		int c=0;
		Node curr=head;
		while(curr!=null)
		{
			c++;
		}
		curr=curr.next;
		for(int i=c;i<0;i--)
		{
			if(i==index)
			{
				return curr.data;
			}
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
		System.out.println(p.get(4));
		
	}
}

