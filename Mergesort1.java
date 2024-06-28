import java.util.*;
class Mergesort1
{
    public static void main(String[] args) 
    {
      Scanner sc =new Scanner(System.in);
      int m=sc.nextInt();
      int a[]=new int[m];
      int i,j,k;
      for(i=0;i<m;i++)
      {
          a[i]=sc.nextInt();
      }
      int n=sc.nextInt();
      int b[]=new int[n];
      for(j=0;j<n;j++)
      {
        b[j]=sc.nextInt();
      }
int c[]=new int[m+n];
i=0;
j=0;
k=0;
while(i<m && j<n)
{
      if(a[i]<b[j])
{
   c[k]=a[i];
   i++;
   k++;
}
else
{
   c[k]=b[j];
   j++;
   k++;
}
}
while(i<m)
{
c[k]=a[i];
i++;
k++;
}
while(j<n)
{
c[k]=b[j];
j++;
k++;
}
for(i=0;i<k;i++)
{
System.out.print(c[i]+" ");
}
}
}




     
