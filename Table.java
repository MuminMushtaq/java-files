import java.util.Scanner;
class Table
{
 public static void main(String args[])
{
 int n,b;
 Scanner sc = new Scanner(System.in);
 System.out.print("enter the number: ");
 n= sc.nextInt();
 for(int i=1; i<=10; i++)
{
  b = n*i;
System.out.println(n+"*" +i+ "="+b);
}
}
}
  