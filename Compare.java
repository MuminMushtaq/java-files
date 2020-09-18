import java.util.Scanner;
class Compare
{
 public static void main(String arg[])
{
 int num1, num2;
 Scanner sc = new Scanner(System.in);
 System.out.print("enter the first number: ");
num1 = sc.nextInt();
System.out.print("enter the second number: ");
num2 = sc.nextInt();
if(num1==num2)
System.out.printf("%d == %d\n",num1,num2);
if(num1 != num2)
System.out.printf("%d != %d\n",num1,num2);
if(num1 > num2)
System.out.printf("%d > %d\n",num1,num2);
if(num1 < num2)
System.out.printf("%d < %d\n",num1,num2);



}
}