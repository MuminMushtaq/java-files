import java.util.Scanner;
class FloydsTriangle
{
 public static void main(String arg[])
 {
Scanner sc = new Scanner(System.in);
 int rows, n=1, i, j ;
System.out.print("enter the number of rows for floyds triangle: ");
 rows = sc.nextInt();
for(i=1; i< rows; i++)
{
 for(j=1; j<=i; j++)
{
 System.out.print(n+" ");
 n++;
  }
System.out.println(n);
} 
   }
	}