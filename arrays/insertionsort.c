#include <stdio.h>

int main()
{
    int i,n,j,val;
    scanf("%d",&n);
    int arr[100];
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        val=arr[i];
        for(j=i-1;j>=0&&arr[j]>val;j--)
        {
            arr[j+1]=arr[j];
        }
        arr[j+1]=val;
        
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
}