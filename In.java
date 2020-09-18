import java.util.Scanner;
class In
{
 public static void main(String arg[])
 {
 Scanner sc = new Scanner(System.in);
 long n;
System.out.print("enter the integer: ");
n=sc.nextInt()
System.out.print("the sum of the digits "+ sumDigits(n));
}
 public staticint sumDigits(long n){
int sum =0;
while(n !=0)
{
 sum + = n%10;
n / = 10;
}
return sum;
}
}

