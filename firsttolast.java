class firsttolast
{
    Node head;
    class Node{
         
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
        
    }
    void move()
    {
        if(head==null||head.next==null)
        {
            return;
        }
        Node seclast=null;
        Node last=head;
        while(last.next!=null)
        {
            seclast=last;
            last=last.next;
        }
        seclast.next=null;
        last.next=head;
        head=last;
    }
    public void push(int new_data) 
    { 
        
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
    void printList() 
    { 
        Node temp = head; 
        while(temp != null) 
        { 
           System.out.print(temp.data+" "); 
           temp = temp.next; 
        }   
        System.out.println(); 
    } 
  
     
    public static void main(String args[]) 
    { 
        firsttolast llist = new firsttolast(); 
        llist.push(5); 
        llist.push(4); 
        llist.push(3); 
        llist.push(2); 
        llist.push(1); 
          
        System.out.println("Linked List before moving last to front "); 
        llist.printList(); 
          
        llist.move(); 
          
        System.out.println("Linked List after moving last to front "); 
        llist.printList(); 
    } 
}  
  
