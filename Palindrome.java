//palindrome of a number

import java.util.Scanner;
class Palindrome
{
 public static void main(String arg[])
{
 Scanner sc = new Scanner(System.in);
 int n,temp, sum=0, add, reverse;
 System.out.print("enter any three digit number: ");
 n= sc.nextInt();
 temp = n;
 while(n>0)
{
 reverse =n%10;
 sum = (sum*10)+reverse;
 n=n/10;
}
 if(temp==sum)

System.out.println("number is palindrome");
else
System.out.println("number is not Palindrome");
 add = sum + n;
System.out.println("  The addition is" + add);
}}