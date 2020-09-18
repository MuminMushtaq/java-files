// program on inheritance

class Calculate 
{
 int z;
 public void addition(int x, int y)
{ 
 z = x+y;
 System.out.println("the addition of given numbers is: "+z);
}
 public void subtraction(int x, int y)
{
 z = x-y;
 System.out.println("the difference of numbers is given:"+z);
}
}
public class Calculation extends Calculate
{
 public void multiplication(int x, int y)
{
 z = x*y;
 System.out.println("the product is: "+z);
}
public static void main(String arg[])
{
 int a=20,b=10;
Calculation demo = new Calculation();
demo.addition(a,b);
demo.subtraction(a,b);
demo.multiplication(a,b);
}
}
