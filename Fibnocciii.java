// program for fibnocci series 
// and also sum and reverse of number

import java.util.Scanner;
class Fibnocciii
{
 public static void main(String[] arg)
{
int i=0, j=1, k, m, limit, sum=0, reverse=0;
Scanner sc = new Scanner(System.in);

System.out.print("enter the limit: ");

limit = sc.nextInt();
for(m=2; m<=limit ;m++)
{
 k= i+j;
 System.out.print(" "+k);
 i=j;
 j=k;
sum= sum+k;
}
 System.out.println(" the sum is "+sum);
while(sum !=0)
{
 reverse = reverse*10;
 reverse = reverse + sum%10;
sum = sum/10;
}
System.out.print("reverse of the number is " + reverse);
int num = reverse;
if(num%2==0)
{
 System.out.println(" the number is even also");
}
else
{
 System.out.println(" the number is odd");
}
}
}