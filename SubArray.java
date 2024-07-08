import java.util.*;
class SubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int k=sc.nextInt();
       int sum=sc.nextInt();
       int i,res;
       for(i=0;i<n-k;i++)
       {
           res=0;
           for(int j=i;j<i+k;j++)
           {
           res=res+a[j];
           if(res==k)
           {
               System.out.println("YES");
               return ;
           }
           }
       }
           if(i==n-k)
           System.out.println("NO");
       }
    }
