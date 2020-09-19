#include <stdio.h>
int binarysearch(int arr[],int x,int start,int end)
{
    while(start<=end)
    {
        int middle;
        middle=(start+end)/2;
        if(arr[middle]==x)
        {
           return middle; 
        }
        if(x<arr[middle])
        {
            end=middle-1;
        }
        else
        {
            start=middle+1;
        }
       // return -1;
    }
    return -1;
}
int main()
{
    int arr[100],x,i,n;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    scanf("%d",&x);
   int res=binarysearch(arr,x,0,n-1);
    if(res==-1)
    {
        printf("no element found");
    }
    else
    {
        printf("%d",res);
    }
}