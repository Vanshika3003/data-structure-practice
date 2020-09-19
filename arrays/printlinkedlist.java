class LinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

public void push( int new_data)
{
    Node new_node=new Node (new_data);
    new_node.next=head;
    head=new_node;
}
public void print()
{
    Node tnode=head;
    while(tnode!=null)
    {
        System.out.println(tnode.data+"");
        tnode=tnode.next;
    }
}



	public static void main(String[] args) {
		LinkedList k=new LinkedList();
	    	k.push(10);
	   k.push(13);
	k.print();
	}

}