import java.util.ListIterator; 
import java.util.Stack; 
  
class sortstack
{
    static void sort(Stack<Integer> s,int x)
    {
        if(s.isEmpty()||x>s.peek())
        {
           s.push(x);
		   return;
        }
        else{
          int temp=s.peek();
           s.pop();
           sort(s,x);
           s.push(temp);
        }
    }
    static void insert(Stack<Integer>s)
    {
        if(!s.empty())
        {
            int x=s.pop();
            insert(s);
            sort(s,x);
        }
    }
    static void printStack(Stack<Integer> s) 
    { 
       ListIterator<Integer> lt = s.listIterator(); 
         
       // forwarding 
       while(lt.hasNext()) 
           lt.next(); 
         
       // printing from top to bottom 
       while(lt.hasPrevious()) 
           System.out.print(lt.previous()+" "); 
    } 
    
    // Driver method  
    public static void main(String[] args)  
    { 
        Stack<Integer> s = new Stack<>(); 
        s.push(30); 
        s.push(-5); 
        s.push(18); 
        s.push(14); 
        s.push(-3); 
       
        System.out.println("Stack elements before sorting: "); 
        printStack(s); 
       
        insert(s); 
       
        System.out.println(" \n\nStack elements after sorting:"); 
        printStack(s); 
       
    } 
}