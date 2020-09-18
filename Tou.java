class Tou
{
 public static void main(String args[])
{
 int a[][] = new int[3][];
  a[0] = new int[3];
  a[1] = new int[4];
 int count = 0;
 for(int i=0; i<a.length; i++)
for(int j=0; j<a[i].length;j++)
 {a[i][j] = count++;
System.out.print(a[i][j] + " ");
}
}
} 