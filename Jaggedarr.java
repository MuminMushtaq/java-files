// Program to demonstrate 2-D jagged array in Java
// 0 1 2
// 3 4

import java.util.Scanner;
class Jaggedarr
{
 public static void main(String[] args)
 {
  int i,j;
  int a[][] = new int[2][];
  a[0] = new int[3];
  a[1] = new int[2];
  int count=0;
 for(i=0;i<a.length;i++)
  for(j=0;j<a[i].length;j++)
 a[i][j] = count++;
System.out.println("contents of 2D jagged array");
for(i=0; i<a.length;i++)
{
for(j=0; j<a[i].length; j++) 
System.out.print(a[i][j]+" ");
System.out.println();
}
}
}