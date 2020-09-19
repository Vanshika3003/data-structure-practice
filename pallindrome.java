import java.util.*; 
  
class Node
{
    Node ptr;
    int data;
    Node(int d)
    {
        data=d;
        ptr=null;
        
    }
}
class pallindrome
{
    public static void main(String[] args) {
		Node one=new Node(1);
		Node two=new Node(5);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(3);
		Node six=new Node(2);
		Node seven=new Node(1);
		one.ptr=two;
		two.ptr=three;
		three.ptr=four;
		four.ptr=five;
		five.ptr=six;
		six.ptr=seven;
		boolean condition =pall(one);
		System.out.println("number is pallindrome"+condition);
	}

static boolean pall(Node head)
{
    int i;
    Node curr=head;
    boolean k=true;
    Stack<Integer> stack=new Stack<Integer>();
    while(curr!=null)
    {
        stack.push(curr.data);
        curr=curr.ptr;
    }
    while(head!=null)
    {
        i=stack.pop();
        if(i==head.data)
        {
            k=true;
        }
        else
        {
            k=false;
			break;
        }
        head=head.ptr;
    }
    return k;
    
}




}



