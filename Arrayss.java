//multiplication of a 2D array
import java.util.Scanner;
class Arrayss
{
 public static void main(String arg[])
{
 int i,j,r,c,m,n;
 Scanner sc = new Scanner(System.in);
 System.out.print("enter the elements of matrix");
 m=sc.nextInt();
 n=sc.nextInt();
 int first[][] = new int[m][n];
for(i=0;i<m; i++)
for(j=0; j<n; j++)
first[i][j] = sc.nextInt();
}
}
