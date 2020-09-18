import java.util.Scanner;
class Plus
{
 public static void main(String arg[])
{
 Scanner sc = new Scanner(System.in);
 int i,j,r,c;
System.out.print("enter the row and columns of the array: ");
r= sc.nextInt();
c= sc.nextInt();
int first[][] = new int[r][c];
int second[][] = new int[r][c];
int sum[][] = new int[r][c];
System.out.print("enter the elements of the first array: ");
for(i=0; i<r; i++)
for(j=0; j<c; j++)
first[i][j] = sc.nextInt();
System.out.print("enter the elements of the second array: ");
for(i=0;i<r; i++)
for(j=0; j<c; j++)
second[i][j] = sc.nextInt();
for(i=0;i<r; i++)
for(j=0; j<c; j++)
sum[i][j] = first[i][j] + second[i][j];
System.out.print("sum of matrices is: ");
for(i=0; i<r; i++)
{
for(j=0; j<c; j++) 
System.out.println(sum[i][j]);
System.out.println();
}
}
}
