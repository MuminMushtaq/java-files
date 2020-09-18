import java.util.Scanner;
class Swapp
{
 public static void main(String arg[])
{
 Scanner sc= new Scanner(System.in);
 int i, j ;
 int k;

System.out.print("enter the number to swap: ");
i=sc.nextInt();
System.out.print("enter the second number to swap: ");
j=sc.nextInt();

k=i;
i=j;
j=k;
{
 System.out.print("the numbers are swapped: " + i + " and "+ j);
}
}
}