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

class LinkedList
{
    Node head;
    public int get(int index)
    {
    Node current=head;
    int c=0;
    while(current!=null)
    {
        if(c==index)
        {
            return current.data;
            
        }
        c++;
        current=current.next;
    }
    
    assert(false);
    return 0;
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
		System.out.println(p.get(0));
	}
}
