import java.util.Scanner;
class Onedarray
{
 public static void main(String args[])
 {
 int i, sum=0 ;
 Scanner sc = new Scanner(System.in);
  int a[] = new int[5];
 
 System.out.print("enter the elements of the array: ");
try{
for(i=0; i<5; i++)
 a[i] = sc.nextInt();
for(i=0; i<5; i++)
{
 sum=a[i] + sum;
}
System.out.println("the array is " + sum);
 }
catch(Exception e){}
 

 }
 }
 