import java.util.Scanner;
class AllSum
{
 public static void main(String arg[])
  {
  Scanner sc= new Scanner(System.in);
  int i, n, sum =0;
  System.out.println("enter the numbers of elements you want to sum");
  n = sc.nextInt();
  int a[] = new int[n];
  System.out.print("enter the numbers ");
  for(i=0; i<n; i++)
   {
    System.out.print("enter numbers" +(i+1)+ ":" );
    a[i] = sc.nextInt();
     }
  for(i=0; i<n; i++)
{
 sum+=a[i];
}
System.out.println("sum of "+n+" numbers is ="+sum);




	}

   }