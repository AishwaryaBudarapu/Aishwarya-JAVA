import java.util.*;
class TEST
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  char Ch=sc.next().charAt(0); 
 if(Character.isLetterOrDigit(Ch))
{
  System.out.println("ALPHA NUMERIC");
  if(Character.isLetter(Ch))
{
  System.out.println("ALPHABET");
if(Character.isUpperCase(Ch))
{
System.out.println("UPPER CASE");
}
else
{
System.out.println("LOWER CASE");
}
}
else
{
 System.out.println("DIGIT");
}
}
else
{
 System.out.println("SPECIAL SYMBOL");
}
}
}