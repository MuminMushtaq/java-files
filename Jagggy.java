import java.util.Scanner;
class Jagggy
{
 public static void main(String[] arg)
 {
  int a[][] = new int[5][];
int r,c;
for(r=0;r<=4;r++)
{
 a[r] = new int a[r+1];
}
for(r=1;r<=5;r++)
{
 for(c=1;c<=r;c++)
  { 
   a[r-1][c-1] = c;
}
for(r=0;r<=4;r++)
{
 for(c=0;c<=r;c++)
{
 System.out.print(a[r][c]);
}}
System.out.println();
}
}