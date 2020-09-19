import java.util.Stack; 
class substring
{
    //Stack <Integer> s=new Stack<Integer>();
    static int substring(String str)
    {
        
    int n=str.length();
    int result=0;
    Stack <Integer> s=new Stack<Integer>();
    s.push(-1);
    for(int i=0;i<n;i++)
    {
        if(str.charAt(i)=='(')
        {
            s.push(i);
        }
        else{
            s.pop();
            if(!s.isEmpty())
            {
            result=Math.max(result,i-s.peek());
            }
            else
            {
                s.push(i);
            }
        }
        
    }
    return result;
    }

    public static void main(String[] args)  
    { 
        String str = "((()()"; 
        System.out.println(substring(str)); 
       
        str = "()(()))))"; 
        System.out.println(substring(str)); 
       
    } 
}