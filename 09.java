import java.util.*; 
class 09
{
   static int max=1000;
    static List<String> vec=new LinkedList<String>();
    public static void number()
    {
        Queue<String> q=new LinkedList<>();
        q.add("9");
        for(int i=max;i>0;i--)
        {
            String s1=q.peek();
            q.remove();
            vec.add(s1);
            String s2=s1;
            q.add(s1+'0');
            q.add(s2+'9');
        }
    }
    static String divisible(int n)
    {
    for(int i=0;i<vec.size();i++)
    
     { 
            if (Integer.parseInt(vec.get(i)) % n == 0)  
            { 
                return vec.get(i); 
            } 
        
     } 
        return ""; 
    
    }
    public static void main(String[] args)  
    { 
        number(); 
        int n = 7; 
        System.out.println(divisible(n)); 
    } 
    
}