import java.util.Scanner;
class SubtractMatrix
{
 public static void main(String arg[])
   {
 int row, col, i, j ;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number of elements: ");
 row = sc.nextInt();
 System.out.println("enter the number of elements: ");
 col = sc.nextInt();
 int a[][] = new int[row][col];
 int b[][] = new int[row][col];
 int res[][] = new int[row][col];
System.out.println("enter the elements: ");
for(i=0; i<row; i++)
{
 for(j=0; j<col; j++)
 a[i][j] = sc.nextInt();
  }
System.out.println("enter the elements: ");
 for(i=0; i<row; i++)
{
 for(j=0; j<row; j++)
 b[i][j] = sc.nextInt();
   }
for(i=0; i<row; i++)
for(j=0; j<col; j++)
res[i][j] = a[i][j] - b[i][j];
System.out.println("subtract of two matrices: ");
for(i=0; i<row; i++)
{
 for(j=0; j<row; j++)
System.out.print(res[i][j]);
System.out.println();
 }
 }
}