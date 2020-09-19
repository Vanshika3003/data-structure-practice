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

class LinkedList2
{
    Node head;
	public void duplicate()
	{
    Node curr=head;
	while(curr!=null)
	{
		Node temp=curr;
		while(temp!=null&&temp.data==curr.data)
		{
			temp=temp.next;
		}
		current.data=temp;
		temp=temp.next;
    }
	}
    public void push(int new_data)
{
    Node new_node=new Node(new_data);
    new_node.next=head;
    head=new_node;
}

public void print()
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.println(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
}
	




	public static void main(String[] args) {
		LinkedList p=new LinkedList();
		p.push(12);
		p.push(12);
		p.push(34);
		p.push(45);
		p.print();
		p.duplicate();
	}
}
