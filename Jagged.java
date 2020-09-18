import java.util.Scanner;
class Jagged
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int num[][]=new int[3][];
  num[0]=new int[3];
  num[1]=new int[2];
  num[2]=new int[1];
  System.out.print("enter values: ");
	for(int i=0; i<num.length;i++)
 {
  for(int j=0;j<num[i].length;j++)
 {
  num[i][j] =sc.nextInt();
  }
 }
System.out.println("entered data is : ");
for(int i=0;i<num.length;i++)
{
 for(int j=0;j<num[i].length;j++)
{
 num[i][j]=sc.nextInt();
}
}
System.out.print("entered data: ");
for(int i=0;i<num.length;i++)
{
for(int j=0;j<num[i].length;j++)
{
 System.out.print(num[i][j]+" ");
}
System.out.println();
}
}
}
