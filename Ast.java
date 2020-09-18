class Ast
{
 public static void main(String arg[])
{
 double a[][] = {
		{ 0*0, 1*0, 2*0, 3*0 },
		{ 0*1, 1*1, 2*1, 3*1 }
		};
 int i,j;
 for(i=0; i<2; i++)
{
 for(j=0; j<2; j++)
System.out.print(a[i][j] + " ");
System.out.println();
}
}
}