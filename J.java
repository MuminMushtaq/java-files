import java.util.Scanner;
class J
{
 public static void main(String arg[])
{ 
 Scanner sc = new Scanner(System.in);
 int i,j;
 int a[][] = new int[3][3];
 System.out.print("enter the elements in an array: ");
for(i=0; i<3; i++)
{
 for(j=0; j<3; j++)
{
 a[i][j] = sc.nextInt();
}
}
for(i=0; i<3; i++)
{
 for(j=0; j<3; j++)
{
 System.out.print("\t"+a[i][j]);
}
System.out.println("");
}
}
}
