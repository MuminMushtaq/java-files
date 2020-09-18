///program on add sub mul in one go
//
//
import java.util.Scanner;
class Stuuu
{
 public static void main(String arg[])
{
 int x,y,res;
 System.out.print("enter the elements of x and y: ");
 Scanner sc = new Scanner(System.in);
 x = sc.nextInt();
 y = sc.nextInt();
 res = x+y;
System.out.println("the addition is "+res);
res = x-y;
System.out.println("the subtraction is "+res);
res = x*y;
System.out.println("the multiple is "+res);
res = x/y;
System.out.println("the division is "+res);
}
}
