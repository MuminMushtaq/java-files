class calculate
{
 int z;
 public void addition(int x, int y)
{
 return(x+y);
 System.out.print("the sum of given numbers is: "+z);
}
 public void subtraction(int x, int y)
{
 z=x-y;
 System.out.print(the product of numbers is: +z);
}
public class Kali extends Calculate
public void multiplication (int x, int y)
{
 z=x*y;
 System.out.println("the product is: "+z)
}
 public static void main(String arg[])
{
 int a=20; b=10;
Kali demo = new Kali();
demo.addition(a,b);
demo.subtraction(a,b);
demo.multiplication(a,b);
}
}
