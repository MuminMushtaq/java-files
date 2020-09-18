import java.util.Scanner;
class File10
{
 public static void main(String arg[])
 {
  int i,j,k,avg;
  Scanner sc= new Scanner(System.in);
  System.out.print("enter the three digits to find average:");
  i=sc.nextInt();
  j=sc.nextInt();
  k=sc.nextInt();
 System.out.print("average of the numbers is "+(i+j+k)/3);
  }
}