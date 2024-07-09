import java.util.*;
class SubArray1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       for(int i=0;i<n;i++)
       {
           for(int j=i;j<n;j++)
           { 
               int sum=0;
               for(int k=i;k<=j;k++)
               {
                   sum=sum+a[k];
               }
               if(max<sum)
               max=sum;
           }
       }
               System.out.println(max);
           }
       }
