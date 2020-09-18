import java.util.Scanner;
class Arrayavg
{
 public static void main(String arg[])
{
   Scanner sc = new Scanner(System.in);
  int s=0,i,avg;
  int a[]= new int[5];
 for(i=0;i<=4;i++)
{
 System.out.println("Enter The elements in Array");
  a[i]= sc.nextInt();
  s=s+a[i];
}

 avg=s/5;
System.out.println(" the Sum of the array is"+" "+s);
System.out.println(" the Average of the array is"+" "+avg);
}
}
 

 
