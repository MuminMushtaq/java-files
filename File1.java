import java.util.Scanner;
class File1
{
 public static void main(String arg[])
{
 int n, i, sum=0;
 Scanner sc = new Scanner(System.in);
 System.out.print("enter the numbers to add: ");
 n = sc.nextInt();
int a[]= new int[n];
 for(i=0; i<n; i++)
{
 System.out.println("enter number"+(i+1));
a[i] = sc.nextInt();
}
 for(i=0; i<n; i++)
{
 sum += i;
}

System.out.println("Sum of numbers is = " +sum); 
}
}