import java.util.LinkedList; 
import java.util.Queue; 
//stack using single queue
class stack
{
    Queue <Integer> q=new LinkedList<Integer>();
    void push(int val)
    {
        int n=q.size();
        q.add(val);//6
        for(int i=0;i<n;i++)
        {
            int x=q.remove();//1 2 3 4 5 6
            q.add(x);//2 3 4 5 6 1
			//3 4 5 6 1 2
			//4 5 6 1 2 3
			//5 6 1 2 3 4
			//6 1 2 3 4 5
			
        }
    }
    int pop()
    {
        int x;
        if(q.isEmpty())
        {
        System.out.println("No elements");
        return -1;
        }
        else
        x=q.remove();
        return x;
    }
    
    int top()
    {
        if(q.isEmpty())
        return -1;
        else
        return q.peek();
       
    }
    public static void main(String[] args)  
    { 
        stack s = new stack(); 
        s.push(10); 
        s.push(20); 
        System.out.println("Top element :" + s.top()); 
        s.pop(); 
        s.push(30); 
        s.pop(); 
        System.out.println("Top element :" + s.top()); 
    } 
    
    
}
