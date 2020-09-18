import java.util.Scanner;
class Fibo
{
 public static void main(String args[])
  {
Scanner sc = new Scanner(System.in);
 int a=0, b=1, c , limit ;
 System.out.print("enter the limit: ");
 limit = sc.nextInt();
for(int i=0; i<=limit; i++)
{
 c=a+b;
System.out.println(" "+c);
a=b;
b=c;
}

  
  
   }
 }