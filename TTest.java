import java.util.*;
abstract class parent 
{
    void m1()
    {
        System.out.println("m1 method in parent");
    }
    public abstract void m2();
}
class Child extends parent
{
    void m3()
    {
        System.out.println("m3 method in Child");
    }
    public void m2()
    {
         System.out.println("m2 abstract method in Child");
    }
}
class TTest{
    public static void main(String args[]){
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        
    }
}