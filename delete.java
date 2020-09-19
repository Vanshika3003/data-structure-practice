import java.util.*; 
  
class delete
{
    static void delete(int arr[],int n,int k)
    {
        Stack<Integer>s=new Stack<>();
        s.push(arr[0]);
        int c=0;
        for(int i=0;i<n;i++)
        {
        while(!s.isEmpty()&&k<c&&s.peek()<arr[i])
        {
            s.pop();
            c++;
        }
        s.push(arr[i]);
    }
    }
    public static void main(String[] args) { 
        int n = 5, k = 2; 
        int arr[] = {20, 10, 25, 30, 40}; 
        delete(arr, n, k); 
    } 

}