import java.util.HashSet; 
import java.util.LinkedList; 
import java.util.Queue; 
class pagefault
{
    static int countpagefaults(int page[],int n,int capacity)
    {
        HashSet<Integer> s=new HashSet<>(capacity);
        Queue <Integer> q=new LinkedList<>();
        int pagefault=0;
        for(int i=0;i<n;i++)
        {
            if(s.size()<capacity)
            {
                if(!s.contains(page[i]))
                {
                s.add(page[i]);
                pagefault++;
                q.add(page[i]);
                }
            }
            else{
				if(!s.contains(page[i]))
				{
               int top=q.peek();
                q.poll();
                s.remove(top);
                s.add(page[i]);
                //pagefault++;
                q.add(page[i]);
				pagefault++;
				}
            }
        }
        return pagefault;
    }
    public static void main(String args[]) 
    { 
        int page[] = {7, 0, 1, 2, 0, 3, 0, 4, 
                        2, 3, 0, 3, 2}; 
   
        int capacity = 4; 
        System.out.println(countpagefaults(page, page.length, capacity)); 
    } 

    
}