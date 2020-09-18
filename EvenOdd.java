import java.util.Scanner;
class EvenOdd
{
 public static void main(String arg[])
{
 Scanner sc = new Scanner(System.in);
 int n;
System.out.print("enter any number: ");
n=sc.nextInt();
if(n==0)
System.out.print("Nothing is here");
else if(n % 2==0)
System.out.print("the number is even: "+n);
else 
System.out.print("the number is odd: "+n);
}
}