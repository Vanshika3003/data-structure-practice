class max
{
    static void max(int arr[],int n,int k)
    {
        int max,j;
        for(int i=0;i<n;i++)
        {
            max=arr[i];
            for(j=i+1;j<k;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
		
			System.out.print(max + " "); 
		}   
        
					
		
    }
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
        int k = 3; 
     max(arr, arr.length, k); 
    } 
}