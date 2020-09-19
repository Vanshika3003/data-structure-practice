class swap
{
    Node head;
    class Node
    {
     int data;
     Node next;
     Node(int d)
     {
         next=null;
         data=d;
         
     }
    }
    void swapping()
    {
      Node temp=head;
      while(temp!=null&&temp.next!=null)
      {
          int k=temp.data;
          temp.data=temp.next.data;
          temp.next.data=k;
          temp=temp.next.next;
      }
    }
    public void push(int new_data)
    {
       Node new_node=new Node(new_data);
       new_node.next=head;
       head=new_node;
    }
    void printList() 
    { 
        Node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } 
        System.out.println(); 
    } 
     public static void main(String args[]) 
    { 
        swap p = new swap(); 
  
        /* Created Linked List 1->2->3->4->5 */
    p.push(5); 
        p.push(4); 
        p.push(3); 
        p.push(2); 
        p.push(1); 
  
        System.out.println("Linked List before calling pairWiseSwap() "); 
        p.printList(); 
  
        p.swapping(); 
  
        System.out.println("Linked List after calling pairWiseSwap() "); 
        p.printList(); 
    } 

      
}
