import java.util.*;
class Sort
{
    public static void main(String[] args) 
    {
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      int mid;
      if(n%2==0)
      mid=n/2;
      else
      mid=n/2+1;
    for(int i=1;i<mid;i++)
    {
        int j=i;
        while(j>0 && a[j]<a[j-1])
        {
            int t=a[j];
            a[j]=a[j-1];
           a[j-1]=t;
           j--;
        }
      }
      for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
    }
}