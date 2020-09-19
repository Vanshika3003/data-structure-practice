#include <stdio.h>

int main() {
    int t;
    int i,j,num,sum;
    scanf("%d",&t);
    for(i=1;i<=t;i++)//t testcases for it will work
    {
        scanf("%d",&num);
       int arr[num];//arr[100] will give segmentation fault
        for(j=0;j<num-1;j++)
        {
            scanf("%d",&arr[j]);
        }
        sum=num*(num+1)/2;
        for(j=0;j<num-1;j++)
        {
            sum=sum-arr[j];
        }
        printf("%d\n",sum);
    }
    
    
    
	
	return 0;
}