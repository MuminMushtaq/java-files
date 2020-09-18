import java.util.Scanner;
class ReverseOfNumber
{
 public static void main(String arg[])
  {
Scanner sc = new Scanner(System.in);
 int n, reverse=0;
System.out.println("enter any number to reverse");
n = sc.nextInt();
while(n>0)
{
 reverse = reverse * 10;
 reverse = reverse+(n%10);
n = n / 10 ;
}
System.out.println("reverse of a number: "+ reverse);
  }
}