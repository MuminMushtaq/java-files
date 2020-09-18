class A
{
 int z;
 public void add(int x , int y)
{
 
z=x+y;
System.out.println("value of z is: " + z);
}
}
public class Aa extends A
{
public void sub(int x, int y)
{
 z = x-y;
System.out.print("the value of z is: " + z);
  }
 
public static void main(String args[])
 {
 int x =10,y=20;
Aa a1 = new Aa();
a1.add(x,y);
a1.sub(x,y);
 }
} 


