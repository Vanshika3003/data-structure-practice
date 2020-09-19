class maxdepth
{
   static int maxdepth(String s)
   {
       int max=0;
       int curmax=0;
      int n=s.length();
       for(int i=0;i<n;i++)
       {
           if(s.charAt(i)=='(')
           {
               curmax++;
               if(max<curmax)
           {
               max=curmax;
           }
           }
           else if(s.charAt(i)==')')
           {
               if(curmax>0)
               {
               curmax--;
               }
               else
               {
               return -1;
               }
           }
       }
           if(curmax!=0)
           {
               return -1;
           }
           return max;
   }
          public static void main(String[] args) { 
        String s = "( ((X)) (((Y))) )"; 
        System.out.println(maxdepth(s)); 
    } 
} 