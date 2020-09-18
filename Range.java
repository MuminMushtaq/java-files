import java.util.Scanner;
class Range
{ 
 public static void main(String args[])
{
 int n,b;
 Scanner sc = new Scanner(System.in);
 System.out.print("enter the range to print the tables: ");
n= sc.nextInt();
b=sc.nextInt();
for(int j=n;j<=b;j++)
{
for(int i=0; i<=10; i++)
{
 int z= n*i;
System.out.println(n+"*"+i+"="+z);

}
n++;
}
}
}
