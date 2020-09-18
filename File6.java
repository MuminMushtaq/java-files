class Cal
{
 int z;
 public void addition(int x, int y)
{
 z = x+y;
 System.out.println("the additon is: " +z);
}
 public void subtraction(int x, int y)
{
 z = x-y;
 System.out.println("the subtraction is: " +z);
}
}
public class Hell extends Cal
{
 public void multiplication(int x, int y)
{
 z = x*y;
System.out.println("the product is: "+z);
}
 public static void main(String arg[])
{
 int a=10, b=20;
 Hell sc = new Hell();
 sc.addition(a,b);
 sc.subtraction(a,b);
 sc.multiplication(a,b);
}
} 