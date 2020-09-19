import java.util.Stack;
class reversal
{
    static int reversal(String str)
    {
        int n=str.length();
		if (n%2 != 0) 
        return -1; 
      
        Stack <Character> s=new Stack <Character>();
        for(int i=0;i<n;i++)
        {
          char c=str.charAt(i);
            if(c=='}'&&!s.isEmpty())
            {
                if(s.peek()=='{')
                {
                    s.pop();
                    
                }
                else
                s.push(c);
            }
            else
            s.push(c);
        }
        //int k;
       int  red=s.size();
       int k=0;
        while(s.peek()=='{'&&!s.isEmpty())
        {
           // int k;
            s.pop();
            k++;
        }
        return (red/2+k%2);
    }
    public static void main(String[] args)  
    { 
        String str = "}}{{"; 
          
        System.out.println(reversal(str)); 
    } 
}