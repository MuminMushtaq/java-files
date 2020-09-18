import java.util.Scanner;
class Tt
{
 public static void main(String arg[])
 {
 Scanner sc = new Scanner(System.in);
 int i,j,k;
 int arr[][]= new int[3][3];
 System.out.print("enter the elements in the array");
 for(i=0; i<3; i++)
{
 for(j=0; j<3; j++)
{
 arr[i][j] = sc.nextInt();
 }
}

for(i=0; i<3; i++)
{
 for(j=0; j<3; j++)
{
 System.out.print("\t"+arr[i][j]);
 }
System.out.println("");
}}}