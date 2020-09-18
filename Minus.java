import java.util.Scanner;
class Minus
{
 public static void main(String arg[])
 {
  Scanner sc = new Scanner(System.in);
  int r,c,i,j;
  System.out.println("enter the number of rows: ");
  r=sc.nextInt();
  System.out.println("enter the number of columns: ");
  c = sc.nextInt();

 int a[][] = new int[r][c];
 int b[][] = new int[r][c];
 int res[][] = new int[r][c];  
 
 System.out.println("enter the elements of matrix one: ");
 for(i=0; i<r; i++)
{
 for(j=0; j<c; j++)
 a[i][j] = sc.nextInt();
}
System.out.println("enter the elements of matrix two: ");
for(i=0; i<r; i++)
{
 for(j=0; j<c; j++)
 b[i][j] = sc.nextInt();
}

 for(i=0; i<r; i++)
 for(j=0; j<c; j++)
 res[i][j] = a[i][j] - b[i][j];
 System.out.println("the substraction of two matrices is: ");
 for(i=0; i<r; i++)
{
 for(j=0; j<c; j++)
 System.out.print(res[i][j]+ "\t");
System.out.println();
}


    }
}