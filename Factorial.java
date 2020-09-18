import java.util.Scanner;
class Factorial
{
 public static void main (String arg[])
{
 int n,i=1;
 System.out.print("enter the number: ");
Scanner sc= new Scanner(System.in);
 n=sc.nextInt();
long fact= 1;
 while(i<=n)
 
{
 fact=fact*i;
 i++;
}
System.out.print("factorial of"+n+"is:"fact);
 }
}