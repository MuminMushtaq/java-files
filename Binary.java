import java.util.Scanner;
public class Binary
{
 public static void main(String arg[])
{

 long num1,num2;
 int i=0, r=0;
 int[] sum= new int[20];
 Scanner sc= new Scanner(System.in);
System.out.print("enter the first binary number: ");
num1=sc.nextLong();
System.out.print("enter the second binary number: ");
num2 = sc.nextLong();

while(num1 !=0 || num2 != 0)
{
 sum[i++] =(int)((num1%10 + num2%10 + r) %2);
 r=(int)((num1%10 + num2%10 + r)/ 2);
 num1=num1 / 10;
 num2=num2 / 10;
}
if(r != 0)
{
 sum[i++]=r;
}
--i;
System.out.print(" the addition of two numbers is: " );
while(i>=0)
{
 System.out.print(sum[i--]);
}



 
}
}