#include <stdio.h>
int main()
{
    int i,n,temp,low,j;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        low=i;
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                low=j;
            }
        }
        
    
    temp=a[low];
    a[low]=a[i];
    a[i]=temp;
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
}
