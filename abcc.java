import java.util.Scanner;
class Ad{
public static void main(String arg[])
{
 Scanner sc = new Scanner(System.in);
 int n,i;
System.out.print("enter the digit: ");
n=sc.nextInt();
for(i=1; i<=10; i++)
{ 
 System.out.println(n+"*"+i+"="+(n*i));
}

}
}
 