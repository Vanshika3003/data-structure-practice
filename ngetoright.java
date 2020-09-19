import java.util.*; 
  
class ngetoright{
    static void fill(int next[],int n,int a[])
    {
        Stack <Integer> s=new Stack<Integer>();
        s.push(0);
        for(int i=1;i<n;i++)
        {
            while(s.size()>0)
            {
               int cur=s.peek();
            if(a[cur]<a[i])
            {
                next[cur]=i;
                s.pop();
            }
            else
            break;
            }
            s.push(i);
        
        }
        while(s.size()>0)
        {
            int cur=s.peek();
            next[cur]=-1;
            s.pop();
        }
        
    }
    static void count(int a[],int n,int dp[])
    {
        int next[]=new int[n];
        for(int i=0;i<n;i++)
        next[i]=0;
      fill(next,n,a);
        for(int i=n-2;i>=0;i--)
        {
            if(next[i]==-1)
            {
                dp[i]=0;
            }
            else{
                dp[i]=1+dp[next[i]];
            }
        }
    }
    static int answerQuery(int dp[], int index) 
{ 
    return dp[index]; 
} 
  
// driver code 
public static void main(String args[]) 
{ 
    int a[] = { 3, 4, 2, 7, 5, 8, 10, 6 }; 
    int n = a.length; 
  
    int dp[] = new int[n]; 
  
    // calls the function to count the number 
    // of greater elements to the right for 
    // every element. 
    count(a,n,dp); 
  
    // query 1 answered 
    System.out.println(answerQuery(dp, 3)); 
  
    // query 2 answered 
    System.out.println( answerQuery(dp, 6)); 
      
    // query 3 answered 
    System.out.println( answerQuery(dp, 1) ); 
  
} 
} 