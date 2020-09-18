// swapping of two numbers without third variable

import java.util.Scanner;
class Swap
{
 public static void main(String arg[])
 {
  Scanner sc = new Scanner(System.in);
  int i, j;
System.out.print("enter the values of i and j ");
i = sc.nextInt();
j = sc.nextInt();

{
i=i+j;
j=i-j;
i=i-j;
}
System.out.println(" After swapping the value of i is: " +i);
System.out.println(" After swapping the value of j is: " +j);
}
} 