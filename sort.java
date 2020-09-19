import java.util.*; 
class sort
{
   public static Stack<Integer> sort(Stack<Integer>s)
   {
       Stack<Integer> tmpStack = new Stack<Integer>(); 
       while(!s.empty())
       {
          int temp=s.pop();
          while(!tmpStack.isEmpty()&&tmpStack.peek()>temp)
          {
             s.push(tmpStack.pop());
          }
          tmpStack.push(temp);
       }
       return tmpStack;
   }
   public static void main(String args[]) 
    { 
        Stack<Integer> s = new Stack<Integer>(); 
        s.add(34); 
        s.add(3); 
    s.add(31); 
      s.add(98); 
        s.add(92); 
        s.add(23); 
      
        // This is the temporary stack 
        Stack<Integer> tmpStack=sort(s); 
        System.out.println("Sorted numbers are:"); 
      
        while (!tmpStack.empty()) 
        { 
            System.out.print(tmpStack.pop()+" "); 
        }  
    } 

}