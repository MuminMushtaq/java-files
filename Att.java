import java.util.Scanner;
class Att
{
 public static void main(String arg[])
{
 int i,j;
 Scanner sc = new Scanner(System.in);
 int a[][] = new int[3][2];
 int b[][] = new int[3][2];
 for(i=0; i<3; i++)
{
for(j=0; j<2; j++)
{
 System.out.print("enter the elements in an array: ");
 a[i][j] = sc.nextInt();
 }
System.out.print("the elememts in the array are: " +a[i][j]);
}
}
}