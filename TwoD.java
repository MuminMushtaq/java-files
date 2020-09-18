import java.util.Scanner;
class TwoD
{
 public static void main(String arg[])
{
 int i,j;
Scanner sc = new Scanner(System.in);
 int a[][] = new int[3][3];

System.out.println("enter the rows and columns of the matrix");
 for(i=0; i<3; i++)
{
 for(j=0; j<3; j++)
{
 a[i][j] = sc.nextInt();
}
}

System.out.println("the matrix is");
 for(i=0; i<3; i++)
{
 for(j=0; j<3; j++)
{
 System.out.print(a[i][j]+"\t"); 
}

System.out.println();
}



   }
}

