import java.util.*;
class Tesstt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         int T=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==T)
                {
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}