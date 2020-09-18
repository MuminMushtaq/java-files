import java.util.Scanner;
class A
{
 public static void main(String args[])
  {
Scanner sc = new Scanner(System.in); 
int num, temp,r,sum=0;
 System.out.print("enter the number: ");
 num = sc.nextInt();
 temp=num;
while(num>0)
{
 r=num%10;
 num = num/10;
 sum = sum+(r*r*r);
}
if(temp== sum)
{
  System.out.println("this is an armstrong number");
 }

else
{
 System.out.println("this is not an armstrong number");
 }





 }
    }